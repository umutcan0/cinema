package com.example.cinema.service;

import com.example.cinema.entity.User;
import com.example.cinema.exception.UserNotFoundException;
import com.example.cinema.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUser(Long id){
        return userRepository.findById(id).orElseThrow(() ->{
            throw new UserNotFoundException("User mevcut değil",id);
        });
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, User user){
        User existingUser = userRepository.findById(id).orElseThrow(() ->
                new UserNotFoundException("User bulunamadı", id));

        existingUser.setName(user.getName());

        return userRepository.save(existingUser);
    }

    @Override
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
