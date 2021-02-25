package com.sumon.xyz.Spring.Boot.with.ThymeLeaf.entity;


import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_no")
    private long phoneNo;

    public Student() {
        super();
    }

    public Student(long id, String name, String email, long phoneNo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

}
