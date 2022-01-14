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

    protected String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    protected char getGrade(){
        return grade;
    }
    public void setGrade(char grade){
        this.grade = grade;
    }
    protected char downGrade(){
        if(grade>='A' && grade <= 'E' )
            grade++;
        return grade;
    }
    protected char upGrade(){
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
    private String getSecretNickName(){
        return secretNickName;
    }
}

