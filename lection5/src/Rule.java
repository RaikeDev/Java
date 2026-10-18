public interface Rule {
    public static final Rule EMPTY = new AllTrue();
    public static Rule ofEmpty(){
        return EMPTY;
    }
    static Rule ofRange(int min, int max){
        return new RuleRange(min, max);
    }

    boolean check(int x);
    public default void checkWithCode(int x){
        System.out.println("There is some code with" + x);
    };
}

class RuleRange implements Rule{
    private final int min, max;

    public RuleRange(int min, int max) {
        if (min > max) throw new IllegalArgumentException("min > max");
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean check(int x){
        return x >= min && x <= max;
    }
}

class AllTrue implements Rule{
    public boolean check(int x){
        return true;
    }
}


