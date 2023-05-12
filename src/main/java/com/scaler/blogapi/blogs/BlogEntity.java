package com.scaler.blogapi.blogs;
import com.scaler.blogapi.common.BaseEntity;
import com.scaler.blogapi.users.UserEntity;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
import java.util.UUID;
@Entity(name = "blogs")
public class BlogEntity extends BaseEntity {

    @Column(nullable = false, length = 150)
    String title;
    @Column(nullable = false, length = 150)
    String slug;
    @Column(nullable = false, length = 50)
    String subtitle;
    @Column(nullable = false, length = 5000)
    String body;

    @ManyToOne
    UserEntity author;
}
