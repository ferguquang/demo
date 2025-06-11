package com.example.demo;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Getter & Setter
    private String name;
    private int age;


    public User(Long id, String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public User() {

    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}