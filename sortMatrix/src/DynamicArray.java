// 1) Добавить к ArrayUtils JavaDoc
// 2) DynamicArray: добавить в  начало, в указанную позицию, удаление(начало-конец-позиция)
// 2a) Сделать нормальный динамический массив у которого size и capacity не одно и то же.
// 3) Реализиция задач 1.1 из ООП задачника.



/**
 * Динамический массив целых чисел, реализованный поверх обычного {@code int[]}.
 *
 * <p>Внутренний массив может быть не инициализирован (равен {@code null}) —
 * это допустимое состояние, а не ошибка: методы {@link #sumArray()} и {@link #toString()},
 * корректно его обрабатывают без исключений.
 *
 * <p>Текущая реализация {@link #addNumToArr(int)} создаёт новый массив на
 * каждый вызов.
 */
public class DynamicArray {
    int[] array;


    /**
     * Возвращает сумму всех элементов массива {@link #array}.
     *
     * <p>Если {@code array} равен {@code null}, метод возвращает {@link Double#NaN}.
     *
     * @return Сумма элементов массива в виде {@code double};
     *         {@link Double#NaN}, когда {@code array} не задан.
     */
    public double sumArray(){
        if (array == null) return Double.NaN;
        double res=0;
        for (int i : array){
            res += i;
        }
        return res;
    }


    /**
     * Возвращает строковое представление массива {@link #array}.
     * <ul>
     *    <li>Если {@code array} равен {@code null}, метод возвращает строку {@code "null"}.</li>
     *    <li>Если {@code array.length} равен {@code 0}, метод возвращает {@code "[]"}.</li>
     * </ul>
     * @return Строковое представление массива {@link #array};
     *          {@code "null"} когда {@link #array} не задан; {@code "[]"} когда {@link #array} пустой.
     */
    public String toString(){
        if (array == null) return "null";
        if (array.length == 0) return "[]";
        String stringArray = new String("[" + array[0]);
        for (int i=1; i<array.length; i++){
            stringArray += ", " + array[i];
        }
        stringArray += "]";
        return stringArray;
    }


    /**
     * Добавляет число {@code num} в конец массива {@link #array}.
     *
     * <p>Если {@link #array} равен {@code null}, создаётся новый массив из одного элемента - {@code num}.
     *
     * @param num число, которое будет добавлено в конец массива.
     */
    public void addNumToArr(int num){
        if (array == null){
            array = new int[]{num};
            return;
        }
        int[] newArray = new int[array.length+1];
        for (int i=0; i<array.length; i++){
            newArray[i] = array[i];
        }
        newArray[array.length] = num;
        array = newArray;
    }
}