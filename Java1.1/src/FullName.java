public class FullName {
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

