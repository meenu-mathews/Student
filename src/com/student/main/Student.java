package com.student.main;
public class Student {
    public String name;
    public char grade; //A, B, C, D, E, F
    public int group; //1, 2, 3, 4, 5
    private final String secretNickName = "MySecretNickName";

    public Student(String name, char grade, int group){
        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    private String getName(){
        return name;
    }
    private void setName(String name){
        this.name = name;
    }
    private char getGrade(){
        return grade;
    }
    public void setGrade(char grade){
        this.grade = grade;
    }
    private char downGrade(){
        if(grade>='A' && grade <= 'E' )
            grade++;
        return grade;
    }
    private char upGrade(){
        if(grade >= 'B' && grade<='E')
            grade--;
        return grade;
    }
    public int getGroup(){
        return group;
    }
    public void setGroup(int group){
        this.group = group;
    }

    public static void main(String[] args) {
        Student stud = new Student("John",'A','1');

    }
}

