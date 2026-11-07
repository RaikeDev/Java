public class DontHaveCashOnItExcemption extends RuntimeException {
    public DontHaveCashOnItExcemption() {
        super("Не хватает денег на счете");
    }
}
