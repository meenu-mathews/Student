package com.student.main;
public class Student {
    public String name;
    public char grade;
    public int group;
    private final String secretNickName = "MySecretNickName";

    private String getName(){
        return name;
    }
    private void setName(String name){
        this.name = name;
    }
    private char getGrade(){
        return grade;
    }
    private char upGrade(char grade){
        if(grade>='A' && grade <= 'E' )
            grade++;
        return grade;
    }
    private char downGrade(char grade){
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
