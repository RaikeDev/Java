//// 1) Добавить к этому коду JavaDoc
//
//public class ArrayUtils {
//    public static double sumArray(int[]arr){
//        if (arr == null) return Double.NaN;
//        int res=0;
//        for (int i : arr){
//            res += i;
//        }
//        return res;
//    }
//    /**
//     *
//     * @param array
//     * @return
//     */
//
//
//    public static String toString(int[] array){
//        if (array == null) return "null";
//        if (array.length == 0) return "[]";
//        String stringArray = new String("[" + array[0]);
//        for (int i=1; i<array.length; i++){
//            stringArray += ", " + array[i];
//        }
//        stringArray += "]";
//        return stringArray;
//    }
//    /**
//     *
//     * @param array
//     * @return
//     */
//
//
//    public static int[] addNumToArr(int[] array, int num){
//        if (array == null){
//            return new int[]{num};
//        }
//        int[] newArray = new int[array.length+1];
//        for (int i=0; i<array.length; i++){
//            newArray[i] = array[i];
//        }
//        newArray[array.length] = num;
//        return newArray;
//    }
//    /**
//     *
//     * @param array
//     * @return
//     */
//
//    public static void sortMatrixBySum(int[][] doubleArray){
//        boolean swapped = true;
//        while (swapped){
//            int prevSum = 0;
//            int sum = 0;
//            swapped = false;
//            for (int arrayInd=0; arrayInd<doubleArray.length; arrayInd++){
//                sum = sumArray(doubleArray[arrayInd]);
//                if (arrayInd > 0 && prevSum > sum) {
//                    int[]temp = doubleArray[arrayInd];
//                    doubleArray[arrayInd] = doubleArray[arrayInd-1];
//                    doubleArray[arrayInd-1] = temp;
//                    swapped = true;
//                }
//                if (arrayInd == 0 || sum > prevSum) {
//                    prevSum = sum;
//                }
//                sum = 0;
//            }
//        }
//    }
//    /**
//     *
//     * @param array
//     * @return
//     */
//}
///**
// *
// * @param array
// * @return
// */