public class FullName {
    private String secName;
    private String firstName;
    private String patronymic;

    public FullName(String firstName, String secName, String patronymic) {
        this.firstName = firstName;
        this.secName = secName;
        this.patronymic = patronymic;
    }

    public FullName(String firstName, String secName) {
        this(firstName, secName, null);
    }

    public FullName(String firstName) {
        this(firstName, null, null);
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString(){
        if (secName == null && patronymic == null){
            return firstName;
        }
        if (patronymic == null){
            return firstName + " " + secName;
        }
        return firstName + " " + secName + " " + patronymic;
    }
}

