package ru.juravlev.people;

import java.util.ArrayList;

public class Student {
    private String name;
    private final ArrayList<Integer> grades;
    private final Checker checker;

    public Student(String name, ArrayList<Integer> grades, Checker checker) {
        setName(name);
        this.checker = checker == null ? new CheckAlwaysTrue() : checker;
        this.grades = new ArrayList<>();
        if (grades != null) {
            for (Integer grade : grades) {
                if (grade == null || !this.checker.check(grade)) {
                    throw new IllegalArgumentException("некорректная оценка: " + grade);
                }
                this.grades.add(grade);
            }
        }
    }

    public Student(String name, ArrayList<Integer> grades) {
        this(name, grades, null);
    }

    public Student(String name, Checker checker) {
        this(name, null, checker);
    }

    public Student(String name) {
        this(name, null, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("имя не передано");
        }
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    public double getAvgGrade() {
        if (grades.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public boolean isExcellent() {
        if (grades.isEmpty()) {
            return false;
        }
        for (int grade : grades) {
            if (grade != 5) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return name + ": " + grades;
    }
}