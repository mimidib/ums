package com.cst8277.ums;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name="user")
public class User {
    @Id//primary key indicator:  JPA recognizes it as the object’s ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) //@GeneratedValue indicates that the ID should be AUTO INCREMENTED by DBMS MySQL
    private int id;
    private String name;
    private String email;
    private String password;
    private int created; //TODO fix this to date
    private int last_visit_id;

    //role toString for front-end TODO -> Check if Password should be given for use case
    @Override
    public String toString() {
        return "User [Id= " + id + ", Name= " + name + ", Email = " + email + ", Password = ******" +
                ", Date Created = " + created + ", Last Visit Id = " + last_visit_id + "]";
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public int getLast_visit_id() {
        return last_visit_id;
    }

    public void setLast_visit_id(int last_visit_id) {
        this.last_visit_id = last_visit_id;
    }
}
