import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


class Hotness implements Comparable<Hotness>{
    private String name;
    private int grade;



    // типовой и широкораспространенный случай. enum.
    public static final Hotness NOT = new Hotness("NOT", 0);
    public static final Hotness HOT = new Hotness("HOT", 1);
    public static final Hotness VERY_HOT = new Hotness("VERY_HOT", 2);

    private Hotness(String name, int grade){
        this.name = name;
        this.grade = grade;
    }

    public static Hotness valueOf(String s){
        if (NOT.name.equals(s)){
            return NOT;
        } else if (HOT.name.equals(s)){
            return HOT;
        } else if (VERY_HOT.name.equals(s)){
            return VERY_HOT;
        } else {
            throw new NoSuchElementException();
        }
    }

    public static Hotness[] retHotnesses(){
        return new Hotness[]{NOT,HOT, VERY_HOT};
    }

    public String getName(){
        return name;
    }

    public int getGrade(){
        return grade;
    }

    @Override
    public int compareTo(Hotness t) {
        return ;
    }
}