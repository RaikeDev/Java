import java.util.*;

public class ArithmeticExpression{
    // ArrayList<Integer> value = new ArrayList<>();

    ArrayList<Integer> value;

    public ArithmeticExpression(ArrayList<Integer> value){
        this.value = value;
    }

    public ArithmeticExpression(String str){
        this();
        value.add(Integer.parseInt(str));
    }

    public ArithmeticExpression(){
        this.value = new ArrayList<>();
    }

    public double calculate(){
        
        return 0;
    }


    public void setValue(ArrayList<Integer> value){
        this.value=value;
    }

    public ArrayList<Integer> getValue(){
        return value;
    }

    public String toString(){
        return value + "";
    }
}