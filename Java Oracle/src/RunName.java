import java.util.Objects

public class RunName {
    public static void main(String[]args){
        FullName kleo = new FullName("Клеопатра", "", "");
        System.out.println(kleo.getFullName());

    }
}

class FullName {
    private String secName;
    private String firstName;
    private String surname;

    public FullName(String secName, String firstName, String surname){
        this.secName = secName;
        this.firstName = firstName;
        this.surname = surname;
    }

    public String getFullName(){
        return secName + " " + firstName + " " + surname;
    }
}

