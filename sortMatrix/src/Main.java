public class Main{
    public static void main(String[]args){
//        int[] array = {234,23};
        DynamicArray dynamicArray = new DynamicArray();

        System.out.println(dynamicArray.toString());
//        newArray = dynamicArray.addNumToArr(array, 5);
        dynamicArray.array = new int[]{1,23,2};

//        System.out.println(dynamicArray.toString());

        System.out.println(dynamicArray);

//        DynamicArray dynamicArray = new DynamicArray();
//        dynamicArray.arr = new int[]{1,2,3,4};
//        System.out.println(dynamicArray);


//        int[][] arr = {{0,1,1,1},{3,3,43,4},{4,1,1},{23,2343,22},{44}};
//        ArrayUtils sort = new ArrayUtils();
//        sort.sortMatrixBySum(arr);
//
//        for (int[] row : arr) {
//            System.out.print("[ ");
//            for (int num : row) {
//                System.out.print(num + " ");
//            }
//            System.out.println("]");
//        }
    }
}






// 1. добавить метод принимающий двумерный массив чисел и сортирующий его так,
// чтобы строки массива шли по возрастанию суммы элементов строки
//
// 2. показать что умеешь делать JAR файлы