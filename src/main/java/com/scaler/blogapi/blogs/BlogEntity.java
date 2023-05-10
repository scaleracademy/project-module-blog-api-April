package com.scaler.blogapi.blogs;
import jakarta.persistence.*;

import java.util.UUID;
@Entity(name = "blogs")
public class BlogEntity {
    @Id()
    // primary key
    @GeneratedValue(strategy = GenerationType.UUID)
    //
    @Column(nullable = false)
    //
    UUID id;
}
