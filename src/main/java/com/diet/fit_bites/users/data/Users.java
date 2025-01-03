package com.diet.fit_bites.users.data;

import java.sql.Timestamp;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Entity
    @Table(name = "users")
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public class Users {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "user_id")
        private int userId;

        @Column(name = "name", nullable = false, length = 100)
        private String name;

        @Column(name = "email", nullable = false, length = 150, unique = true)
        private String email;

        @Column(name = "password", nullable = false, length = 255)
        private String password;

        @Column(name = "phone", length = 15)
        private String phone;

        @Column(name = "gender", length = 10)
        private String gender;

        @Column(name = "created_at", nullable = true, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
        private Timestamp createdAt;

        @Column(name = "updated_at", nullable = true, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
        private Timestamp updatedAt;

    }
