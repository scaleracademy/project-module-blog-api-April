package com.scaler.blogapi.users;

import com.scaler.blogapi.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
import java.util.UUID;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Setter
@Entity(name = "users")
public class UserEntity  extends BaseEntity  {


    @Column(nullable = false, unique = true, length = 30)
    String username;
    @Column(nullable = false, unique = true, length = 50)
    String email;
    @Column(nullable = false, length = 100)
    String password;  // TODO: Hash this password

    @Column(length = 100)
    String bio;

}
