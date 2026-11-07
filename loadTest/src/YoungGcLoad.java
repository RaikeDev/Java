import java.util.concurrent.locks.LockSupport;

public class YoungGcLoad {
    private static volatile byte[] lastAllocated;

    public static void main(String[] args) {
        int durationSeconds = Integer.parseInt(args[0]);
        int targetMBPerSeconds = Integer.parseInt(args[1]);

        int arraySize = 16 * 1024;
        int arraysPerBatch = 64;

        long bytesPerBatch = (long) arraySize * arraysPerBatch;
        long start = System.nanoTime();
        long deadline = start + durationSeconds * 1_000_000_000L;
        long allocatedBytes = 0;

        while (System.nanoTime() < deadline) {
            for (int i = 0; i < arraysPerBatch; i++) {
                byte[] data = new byte[arraySize];
                data[0] = 1;
                data[arraySize - 1] = 2;

                lastAllocated = data;
            }

            allocatedBytes += bytesPerBatch;
        }

        long expectedNs = (long) (
                allocatedBytes * 1_000_000_000.0 /
                        (targetMBPerSeconds * 1024.0 * 1024.0)
        );

        long sleepNs = start + expectedNs - System.nanoTime();

        if (sleepNs > 0) {
            LockSupport.parkNanos(sleepNs);
        }

        double elapsed = (System.nanoTime() - start) / 1_000_000_000.0;

        System.out.printf("Duration: %.2f s%n", elapsed);
        System.out.printf("Allocated: %.0f MiB%n",
                allocatedBytes / 1048576.0);
        System.out.printf("Actual rate: %.1f MiB/s%n",
                allocatedBytes / 1048576.0 / elapsed);

    }
}
