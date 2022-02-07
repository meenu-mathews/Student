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
    protected String upGrade(){
        System.out.println(grade_enum.prev().name());
        if(getGrade_enum().name().equals(Grade.F))
            System.out.println("Grade F cannot be downgraded further");
        else if(getGrade_enum().ordinal() != Grade.grades.length) {
            return grade_enum.prev().name();
        }

        return grade_enum.name();

    }
    protected String downGrade(){
        if(getGrade_enum().name().equals(Grade.F))
            System.out.println("Grade F cannot be upgraded further");
        else
            return grade_enum.next().name();

        return grade_enum.name();
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

