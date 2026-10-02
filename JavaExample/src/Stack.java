public class Stack {
    int [] arr = new int[100];
    int size = 0;

    /** 
     * @param i
     */
    public void push(int i){
        this.arr[this.size++] = i;
    }

    /** 
     * @return int
     */
    public int pop(){
        return this.arr[--this.size];
    }

    /** 
     * @return boolean
     */
    public boolean isEmpty(){
        return this.size == 0;
    }
}
