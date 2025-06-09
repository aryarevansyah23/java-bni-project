package com.bni.bni.entity;

import jakarta.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;
    
    @Column(name = "is_active", nullable = false)
    private boolean is_active = true; // Default to true

    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt; // Default to current time

    @Column(name = "updated_at", nullable = false)
    private OffsetDateTime updatedAt = OffsetDateTime.now(); // Default to current time

    public User() {
        // Default constructor
    }

    // Constructor with parameters
    public User(String username, String email, String password, OffsetDateTime createdAt) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.is_active = true; // Default to true
        this.createdAt = createdAt; // Set createdAt to current time
        this.updatedAt = OffsetDateTime.now(); // Set updatedAt to current time
    }

    // Getter & Setter untuk id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter & Setter untuk username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter & Setter untuk email
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter & Setter untuk password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter & Setter untuk is_active
    public boolean isActive() {
        return is_active;
    }

    public void setActive(boolean active) {
        is_active = active;
    }

    // Getter & Setter untuk createdAt 
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    // Getter & Setter untuk updatedAt
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}