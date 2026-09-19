public class Main{
    public static void main(String[]args){
        int[][] arr = {{0,1,1,1},{3,3,43,4},{4,1,1},{23,2343,22},{44}};
        MatrixSorter sort = new MatrixSorter();
        int[][] sortedMatrix = sort.sortMatrixBySum(arr);
        for (int[] row : sortedMatrix) {
            System.out.print("[ ");
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println("]");
        }
    }
}






// 1. добавить метод принимающий двумерный массив чисел и сортирующий его так,
// чтобы строки массива шли по возрастанию суммы элементов строки
//
// 2. показать что умеешь делать JAR файлы