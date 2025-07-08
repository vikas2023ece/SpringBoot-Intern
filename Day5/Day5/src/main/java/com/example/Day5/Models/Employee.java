package com.example.Day5.Models;

import jakarta.persistence.*;
import java.util.Date;

@Entity // Specifies that this is a JPA entity
public class Employee {

    @Id // Specifies that this field is the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment the empid
    private int empid;

    private String empname;
    private String job;

    @Temporal(TemporalType.DATE) // Maps the Date object correctly to the database
    private Date dob;

    private String phoneno;
    private String email;
    private String password;

    public Employee() {}

    public Employee(int empid, String empname, String job, Date dob, String phoneno, String email, String password) {
        this.empid = empid;
        this.empname = empname;
        this.job = job;
        this.dob = dob;
        this.phoneno = phoneno;
        this.email = email;
        this.password = password;
    }

    // Getters and setters for all fields (already provided in your code)

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
