public class Employee {
    String name;
    Department department;

    public Employee(String name, Department department){
        this.name = name;
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
