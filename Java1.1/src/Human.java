
public class Human{
    private String name;
    private int height;
    public String getInfo(){
        return name + ", рост: " + height;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setName(int height){
        this.height = height;
    }
    public Human(String name, int height){
        this.name = name;
        this.height = height;
    }
    public String getName(){
        return this.name;
    }
    public int getHeight(){
        return this.height;
    }
}