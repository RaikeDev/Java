public class Employee {
    private String name;
    private Department department;

    public Employee(String name, Department department){
        this.name = name;
        this.department = department;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        if (department == null){
            return name + " не работает";
        }
        if (department.getDepartmentName() == null){
            return name + " работает в неизвестном отделе";
        }
        if (department.getBoss() == null){
            return name + " работает в отделе " + department.getDepartmentName() + ", начальние которого не указан";
        }
        if (department.getBoss() == this){
            return name + " начальник отдела " + department.getDepartmentName();
        }
        return name + " работает в отделе " + department.getDepartmentName() + ", начальние которого " + department.getBoss();
    }

}
