public class Department {
    private String departmentName;
    private Employee boss;
    private Employee[] employees;

    public Department(String departmentName){
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Employee getBoss() {
        return boss;
    }

    public void setBoss(Employee boss) {
        this.boss = boss;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }


    @Override
    public String toString(){
        return "department name: " + departmentName + ", boss: " + boss;
    }
}
