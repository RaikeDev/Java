package ru.juravlev.work;

public class Employee {
    private String name;
    private Department department;

    public Employee(String name) {
        this(name, null);
    }

    public Employee(String name, Department department) {
        if (name == null) {
            this.name = "";
            this.department = department;
        } else {
            this.name = name;
            this.department = department;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) this.name = "unknown";
        else this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        if (this.department == department) return;
        if (this.department != null) {
            this.department.removeEmployee(this);
            if (this.department.getBoss() == this) {
                this.department.setBoss(null);
            }
        }
        if (department == null) {
            this.department = null;
            return;
        }
    }


    @Override
    public String toString() {
        if (department == null) {
            return name + " не работает";
        }
        if (department.getBoss() == null) {
            return name + " работает в отделе " + department.getTitle()
                    + ", начальник которого не указан";
        }
        if (department.getBoss() == this) {
            return name + " начальник отдела " + department.getTitle();
        }
        return name + " работает в отделе " + department.getTitle()
                + ", начальник которого " + department.getBoss().getName();
    }
}
