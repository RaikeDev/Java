
public class MatrixSorter{
    public static int[][] sortMatrixBySum(int[][] doubleArray){
        boolean swapped = true;
        while (swapped){
            int prevSum = 0;
            int sum = 0;
            swapped = false;
            for (int arrayInd=0; arrayInd<doubleArray.length; arrayInd++){
                for (int numInd=0; numInd<doubleArray[arrayInd].length; numInd++){
                    sum += doubleArray[arrayInd][numInd];
                }
                if (arrayInd > 0 && prevSum > sum) {
                    int[]temp = doubleArray[arrayInd];
                    doubleArray[arrayInd] = doubleArray[arrayInd-1];
                    doubleArray[arrayInd-1] = temp;
                    swapped = true;
                }
                if (arrayInd == 0 || sum > prevSum) {
                    prevSum = sum;
                }
                sum = 0;
            }
        }
        return doubleArray;
    }
}