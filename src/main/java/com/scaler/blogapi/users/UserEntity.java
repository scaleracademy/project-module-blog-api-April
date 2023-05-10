package com.scaler.blogapi.users;

import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "users")
public class UserEntity {
    @Id()
    // primary key
    @GeneratedValue(strategy = GenerationType.UUID)
    //
    @Column(nullable = false)
    //
    UUID id;
}
