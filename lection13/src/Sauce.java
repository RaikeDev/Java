import lombok.Data;

@Data
class Sauce implements Comparable<Sauce>{
    String name;
    Hotness hotness;


    public int compareTo(Sauce s){
        return hotness.compareTo(s.hotness);
    }
}


