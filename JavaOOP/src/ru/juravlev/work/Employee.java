package ru.juravlev.work;

import java.util.Objects;

public class Employee {
    private final String name;
    Department department;

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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        if (this.department == department) return;

        if (this.department != null) {
            if (isHead()) this.department.head = null;
            this.department.employees.remove(this);
        }
        if (department != null) {
            department.employees.add(this);
        }
        this.department = department;
    }

    public boolean isHead() {
        return this == this.department.head;
    }

    public boolean equals(Object o) {
        if (o == null) return false;
        Employee employee = (Employee) o;
        return (Objects.equals(employee.name, name)) && (employee.department == department);
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
