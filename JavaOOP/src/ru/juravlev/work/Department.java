package ru.juravlev.work;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department {
    private final String name;
    Employee head;
    ArrayList<Employee> employees;

    public Department(String name) {
        employees = new ArrayList<>();
        if (name == null) {
            this.name = "";
        } else {
            this.name = name;
        }
        this.head = null;
    }

    public Department(String name, Employee head) {
        this(name);
        setBoss(head);
    }

    public void setEmployees(List<Employee> employees) {
        this.employees.forEach(e -> e.setDepartment(null));
        if (employees == null) return;
        employees.forEach(this::addEmployee);
    }

    public void addEmployee(Employee employee) {
        if (employee == null || employees.contains(employee)) {
            return;
        }
        employee.setDepartment(this);
    }

    public String getTitle() {
        return name;
    }

    public Employee getBoss() {
        return head;
    }

    public void setBoss(Employee head) {
        if (head != null) head.setDepartment(this);
        this.head = head;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void removeEmployee(Employee employee) {
        if (employee != null && employee.department == this) {
            employee.setDepartment(null);
        }
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o.getClass() != getClass()) return false;
        Department dep = (Department) o;
        return Objects.equals(dep.name, name);
    }

    @Override
    public String toString() {
        return "department name: " + name + ", head: " + (head == null ? "нет" : head.getName());
    }
}