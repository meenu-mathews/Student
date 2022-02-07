package com.student.main;
public class Student {
    private String name;
    enum Grade {
        A, B, C, D, E, F;
        private static Grade[] grades = values();

        public Grade next() {
            return grades[(this.ordinal() + 1) % grades.length];
        }
        public Grade prev() {
            System.out.println(grades[(this.ordinal() - 1) % grades.length]);
            return grades[(this.ordinal() - 1) % grades.length];
        }
    }
    private Grade grade_enum;
    enum Group {One, Two, Three, Four, Five};
    private Group group_enum;
    private final String SECRETNICKNAME = "MySecretNickName";

    public Student(String name, Grade grade_enum, Group group_enum){
        this.name = name;
        this.grade_enum = grade_enum;
        this.group_enum = group_enum;
    }

    protected String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Grade getGrade_enum(){
        return grade_enum;
    }
    protected Grade upGrade(){
        if(getGrade_enum().equals(Grade.A))
            System.out.println("Grade A cannot be upgraded further");
       grade_enum.prev();

       grade_enum.prev();
       grade_enum.prev();
       grade_enum.prev();
       grade_enum.prev();


        return grade_enum;

    }
    protected Grade downGrade(){
        if(getGrade_enum().equals(Grade.F))
            System.out.println("Grade F cannot be downgraded further");
        else if(getGrade_enum().ordinal() != Grade.grades.length)
            this.grade_enum =  grade_enum.next();
System.out.println(grade_enum);
        return grade_enum;
    }
    public int getGroup(){
        return group_enum.ordinal();
    }
    public void setGroup(Group group){
        this.group_enum = group;
    }
    private String getSecretNickName(){
        return SECRETNICKNAME;
    }
}

