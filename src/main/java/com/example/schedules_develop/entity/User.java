package com.example.schedules_develop.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String userName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;


}
