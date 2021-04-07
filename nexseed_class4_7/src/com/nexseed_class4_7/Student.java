package com.nexseed_class4_7;

public class Student {
    private String student_name;
    private int student_id;
    private String studentCurriculum;

    Student(String name, int id, String curriculum){
        student_name=name;
        student_id= id;
        studentCurriculum=curriculum;
    }
    public void setStudentName(String student_name){
        this.student_name=student_name;
    }
    public void setStudentId(int student_id){
        this.student_id=student_id;
    }
    public void setStudentCurriculum(String studentCurriculum){
        this.studentCurriculum=studentCurriculum;
    }
    public String getStudentName(){
        return this.student_name;
    }
    public int getStudentId(){
        return this.student_id;
    }public String getStudentCurriculum(){
        return this.studentCurriculum;
    }

}
