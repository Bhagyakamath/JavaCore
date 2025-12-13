package com.example.alldependencies.entity;


import java.sql.Date;
import java.util.List;
 
public class UserEntity {
 
    private String userId;
    private String username;
    private String email;
    private String password;
    private String phoneNumber;
    private boolean active;
    private Date createdAt;
    private Date updatedAt;
 
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
 
    @Override
    public String toString() {
        return "UserEntity [userId=" + userId + ", username=" + username + ", email=" + email + ", password=" + password
                + ", phoneNumber=" + phoneNumber + ", active=" + active + ", createdAt=" + createdAt + ", phoneNumber=" + phoneNumber + ", active=" + active + ", createdAt=" + createdAt + ", updatedAt="
                + updatedAt + "]";
    }
}