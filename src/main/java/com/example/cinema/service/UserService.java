package com.example.cinema.service;

import com.example.cinema.entity.User;

import java.util.List;

public interface UserService {

    public User getUser(Long id);
    public List<User> getAllUser();
    public User createUser(User user);
    public User updateUser(Long id, User user);
    public void deleteUser(Long id);
}
