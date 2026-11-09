package ru.juravlev.people;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student implements Cloneable, Comparab {
    private String name;
    private List<Integer> grades;
    private final Checker checker;

    public Student(String name, List<Integer> grades, Checker checker) {
        setName(name);
        this.checker = checker == null ? new CheckAlwaysTrue() : checker;
        this.grades = new ArrayList<>();
        if (grades != null) {
            for (Integer grade : grades) {
                if (grade == null || !this.checker.check(grade)) {
                    throw new IllegalGradeException();
                }
                this.grades.add(grade);
            }
        }
    }

    public Student(String name, List<Integer> grades) {
        this(name, grades, null);
    }

    public Student(String name, Checker checker) {
        this(name, null, checker);
    }

    public Student(String name) {
        this(name, null, null);
    }

    public void addGrade(int grade) {
        if (!checker.check(grade)) throw new IllegalGradeException();
        grades.add(grade);
    }

    public void setGrades(List<Integer> grades) {
        for (int g : grades) {
            if (!checker.check(g)) throw new IllegalGradeException();
        }
        this.grades = new ArrayList<>(grades);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalGradeException();
        }
        this.name = name;
    }

    public List<Integer> getGrades() {
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
    public Student clone() {
        try {
            Student s = (Student) super.clone();
            s.setGrades(getGrades());
            return s;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return name + ": " + grades;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return Objects.equals(name, student.name) &&
                Double.compare(getAvgGrade(), student.getAvgGrade()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, getAvgGrade());
    }
}