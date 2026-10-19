package ru.juravlev.work;

import java.util.ArrayList;

public class Department {
    private String title;
    private Employee boss;
    private final ArrayList<Employee> employees;

    public Department(String title) {
        employees = new ArrayList<>();
        if (this.title == null) {
            this.title = "";
        } else {
            this.title = title;
        }
        this.boss = null;
    }

    public Department(String title, Employee boss) {
        employees = new ArrayList<>();
        this.title = title;
        this.boss = boss;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Employee getBoss() {
        return boss;
    }

    public void setBoss(Employee boss) {
        if (this.boss == boss) return;
        this.boss = boss;
        this.employees.add(boss);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        if (employee == null || employees.contains(employee)) return;
        if (employee.getDepartment() != this) {
            employee.getDepartment().removeEmployee(employee);
            employee.setDepartment(this);
        }
    }

    public void removeEmployee(Employee employee) {
        if (employee == null || !employees.contains(employee)) {
            return;
        } else {
            if (employee.getDepartment().getBoss() == employee) employee.getDepartment().setBoss(null);
            employees.remove(employee);
            employee.setDepartment(null);
        }
    }

    @Override
    public String toString() {
        return "department name: " + title + ", boss: " + (boss == null ? "нет" : boss.getName());
    }
}