package com.company.hw3;

import java.util.Arrays;

public class Course {

    private String courseName;
    private Student[] students = new Student[0];
    private int capacity;
    private int numberOfStudent;
    private int numberOfStudents = 0;

    public Course(String courseName) {
        super();
        this.courseName = courseName;
        this.capacity = 40;
        this.numberOfStudent = 0;

    }


    public Course(String name, int capacity) {
        this.courseName = name;
        this.capacity = capacity;
    }

    public int getNumberOfStudent() {
        return this.numberOfStudent;
    }


    public String getName() {
        return this.courseName;

    }

    public Student[] getStudents() {
        return this.students;
    }

    public boolean addStudent(Student student) {
        if (numberOfStudent < capacity) {
            for (int i = 0; i < numberOfStudent; i++) {
                if (student.equals(students[i])) {
                    return false;
                }

            }
            students[numberOfStudent] = student;
            numberOfStudent++;
            return true;
        }
        return false;
    }

    public boolean dropStudent(Student student){
        for(int i = 0; i < numberOfStudent; i++){
            if(student.equals(students[i])){
                students[i] = null;
                while(i < numberOfStudent){
                    students[i] = students[i+1];
                    i++;
                }
                numberOfStudent--;
                return true;
            }
        }
        return false;
    }


    public void increaseCapacity(){
        this.capacity = capacity+5;
    }
    public Student getBestStudent(){
        Student bestStudent = students[0];
        for(int i=0; i < numberOfStudent-1; i++){
            if(students[i].getGpa() > students[i+1].getGpa())
                bestStudent = students[i];
        }
        return bestStudent;

    }

    public Student getYoungestStudent(){
        {
            Student youngestStudent = students[0];
            for(int i = 0; i < numberOfStudent - 1; i++){
                if((students[i].getPersonelData().getBirthDate()).compareTo(students[i+1].getPersonelData().getBirthDate()) < 0)
                    youngestStudent = students[i];
                else if(students[i].getPersonelData().getBirthDate().compareTo(students[i+1].getPersonelData().getBirthDate()) > 0)
                    youngestStudent = students[i + 1];
            }
            return youngestStudent;
        }
    }


    public void clear(){
        this.students = new Student[0];
        numberOfStudents = 0;
    }


    public void list(){
        for (Student s:students) {
            System.out.println(s);
        }

        }

    @Override
    public String toString() {
        return "Course name" + this.getName() + "  capacity  " + capacity + "   numberOfStudent " + numberOfStudent ;




    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
}
