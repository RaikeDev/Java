public class Cat {
    private String name;

    public Cat(String name){
        this.name = name;
    }

    public String meow(){
        return name + ": мяу!";
    }
    public String meow(int count){
        String result = name + ": ";
        for(int i=0; i<count; i++){
            if (i == 0) result += "мяу";
            else result += "-мяу";
        }
        result += "!";
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "кот: " + name;
    }
}
