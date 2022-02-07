package com.student.main;


public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("John", Student.Grade.B, Student.Group.Four);
        System.out.println("\nThe current grade for "+student1.getName()+" is "+ student1.getGrade_enum());
        System.out.println("Grade after upgrade: "+student1.upGrade());
        System.out.println("Grade after downgrade: "+student1.downGrade());

//        Student student2 = new Student("Jane",'F','3');
//        System.out.println("\nThe current grade for "+student2.getName()+" is "+ student2.getGrade());
//        System.out.println("Grade after downgrade: "+student2.downGrade());
//        System.out.println("Grade after upgrade: "+student2.upGrade());
//        System.out.println("Grade after downgrade: "+student2.downGrade());
//
//        Student student3 = new Student("Mike",'E','5');
//        System.out.println("\nThe current grade for "+student3.getName()+" is "+ student3.getGrade());
//        System.out.println("Grade after downgrade: "+student3.downGrade());
//        System.out.println("Grade after downgrade: "+student3.downGrade());
//        System.out.println("Grade after upgrade: "+student3.upGrade());
    }
}
