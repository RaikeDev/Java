

public class Expression {
    Stack operands;
    Stack operators;
    String expression;

    /** 
     * @return double
     */
    public double calculate(){
        // разобрать expression по стэкам
        while(!operators.isEmpty()){
            operators.pop();
        }
        return 0.0;
    }

    /** 
     * @param s
     */
    public void fill(String s){
        expression = s;
    }

    /** 
     * @return String
     */
    @Override 
    public String toString(){
        return "Expression{" + "expression=" + expression + "}";
    }
}
