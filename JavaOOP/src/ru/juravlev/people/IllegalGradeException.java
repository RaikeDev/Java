package ru.juravlev.people;

public class IllegalGradeException extends RuntimeException {
    private int wrongGrade;
    public IllegalGradeException(int grade) {
        super("grade " + grade + " is not valid for current student");
        this.wrongGrade = grade;
    }

    public IllegalGradeException(){

    }

    public int getWrongGrade(){
        return wrongGrade;
    }
}
