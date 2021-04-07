package com.nexseed_class4_7;

public class Main {

    public static void main(String[] args) {
        Student st1 = new Student("Maria", 1, "OOP");
        Student st2 = new Student("John", 2, "Methoda");
        Student st3 = new Student("Jaguar", 3, "Data Structure");
        System.out.println(st1.getStudentName()+" "+st1.getStudentId()+" "+st1.getStudentCurriculum());
        System.out.println(st2.getStudentName()+" "+st2.getStudentId()+" "+st2.getStudentCurriculum());
        System.out.println(st3.getStudentName()+" "+st3.getStudentId()+" "+st3.getStudentCurriculum());


    }
}
