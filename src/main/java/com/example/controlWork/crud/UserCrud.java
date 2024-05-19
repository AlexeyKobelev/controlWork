package com.example.controlWork.crud;

import com.example.controlWork.entity.UserEntity;
import com.example.controlWork.repository.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserCrud{

    @Autowired
    UserRep usersRepository;
    @PostMapping("/add")
    public void addUser(@RequestBody UserEntity user) {
        usersRepository.addUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id) {
        usersRepository.deleteUserById(Long.valueOf(id));
        return ResponseEntity.noContent().build();
    }

}
