package com.scaler.blogapi.comments;

import com.scaler.blogapi.blogs.BlogEntity;
import com.scaler.blogapi.common.BaseEntity;
import com.scaler.blogapi.users.UserEntity;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
import java.util.UUID;
@Entity(name = "comments")
public class CommentEntity extends BaseEntity {

    @Column(nullable = false, length = 150)
    String title;
    @Column(nullable = false, length = 550)
    String body;


    @ManyToOne
    UserEntity author;

    @ManyToOne
    BlogEntity blog;
}