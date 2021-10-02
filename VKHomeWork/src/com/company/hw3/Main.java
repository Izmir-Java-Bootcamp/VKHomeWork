package com.company.hw3;

import static javax.swing.UIManager.get;

public class Main<student, student1, student2, student3,student4 > {
    public static void main(String[] args) {

        Student student = new Student("ravza", 5005, 5.8, new PersonelData(1999, 3, 29, 4));
        Student student1 = new Student("volkan", 5015, 10.7, new PersonelData(1998, 5, 27, 8));
        Student student2 = new Student("mustafa", 5025, 15.6, new PersonelData(1997, 4, 14, 9));
        Student student3 = new Student("kamil", 5035, 20.5, new PersonelData(1996, 8, 16, 3));
        Student student4 = new Student("mecnun", 5045, 25.4, new PersonelData(1995, 9, 5, 7));


        Course courseK129 = new Course("K129", 3);

        courseK129.addStudent(student);
        courseK129.addStudent(student1);
        courseK129.addStudent(student2);
        courseK129.addStudent(student3);

        System.out.println("student name: "+ courseK129.getName());


        courseK129.list();

        courseK129.increaseCapacity();

        courseK129.addStudent(student4);

        System.out.println("student name: "+ courseK129.getName());

        courseK129.list();

        courseK129.dropStudent(student);

        courseK129.list();

        System.out.println(courseK129.getNumberOfStudent());

        System.out.println(courseK129.getBestStudent().getPersonelData().getBirthDate().getYear());


        Course courseK130 = new Course("K130", 5);

        for(int i=0;i<courseK129.getNumberOfStudents();i++) {
            final boolean b = courseK130.addStudent(courseK129.getStudents()[i]);

             }
        courseK129.clear();
        System.out.println("-----------------");
        courseK130.list();
        System.out.println("-----------------");
        courseK130.dropStudent(courseK130.getBestStudent());
        System.out.println("-----------------");
        courseK130.list();
        System.out.println(courseK130.getYoungestStudent().getGpa());
        courseK129.list();
        System.out.println("-----------------");
        courseK130.list();


        }
}
