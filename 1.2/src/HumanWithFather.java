public class HumanWithFather {

    private FullName name;
    private int height;
    Human father;

    @Override
    public String toString() {
        String fatherInfo = (father != null) ?
                "имя: " + father.getName() : "";

        return "имя: " + name + ", отец: " + fatherInfo;
    }

    public HumanWithFather(FullName name, int height, Human father) {
        this.name = name;
        if (name.getSecName() == ""){
            name.setSecName(father.getName().getSecName());
        }
        if (name.getSurname() == ""){
            name.setSurname(father.getName().getFirstName() + "ович");
        }

        this.height = height;
        this.father = father;
    }

    public Human getFather(){ return this.father; }
}


