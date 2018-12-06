package com.angelo.deleon.deleonangelope2;

public class Student {
    String fname, lname;
    Long average;


    public Student(String fname, String lname, Long average) {
        this.fname = fname;
        this.lname = lname;
        this.average = average;


    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public Long getAverage() {
        return average;
    }

}
