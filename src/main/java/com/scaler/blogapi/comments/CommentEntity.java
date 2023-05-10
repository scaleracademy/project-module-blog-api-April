package com.scaler.blogapi.comments;

import jakarta.persistence.*;

import java.util.UUID;
@Entity(name = "comments")
public class CommentEntity {
    @Id()
    // primary key
    @GeneratedValue(strategy = GenerationType.UUID)
    //
    @Column(nullable = false)
    //
    UUID id;
}