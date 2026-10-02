public class HumanDemo{
    public static void main(String[]args){
        Human kleopatra = new Human("Клеопатра", 152);
        Human pushkin = new Human("Пушкин", 167);
        Human alex = new Human("Александр", 189);
        System.out.println(kleopatra.getInfo());
        System.out.println(pushkin.getInfo());
        System.out.println(alex.getInfo());

    }
}

class Human{
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