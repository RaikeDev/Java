public class Main{
    /** 
     * @param args
     */
    public static void main(String[] args){
        Expression e = new Expression();
        System.out.println(e);

        System.out.println(e.operands);

        e.operators = new Stack();
        e.operands = new Stack();
        e.fill("2+3");

        e.operators.push('+');
        e.operands.push(6);
        e.operands.push(8);

        System.out.println(e.calculate());
    }
}