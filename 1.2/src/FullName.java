class FullName {
    private String secName = "";
    private String firstName = "";
    private String surname = "";
    public FullName() {
        return;
    }
    public FullName(String secName) {
        this.secName = secName;
    }
    public FullName(String secName, String firstName) {
        this.secName = secName;
        this.firstName = firstName;
    }
    public FullName(String secName, String firstName, String surname) {
        this.secName = secName;
        this.firstName = firstName;
        this.surname = surname;
    }

    public String getSecName(){
        return this.secName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getSurname(){
        return this.surname;
    }
    public void setSecName(String secName){
        this.secName = secName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    @Override
    public String toString() {
        return secName +
                (firstName.isEmpty() ? "" : " " + firstName) +
                (surname.isEmpty() ? "" : " " + surname);
    }
}