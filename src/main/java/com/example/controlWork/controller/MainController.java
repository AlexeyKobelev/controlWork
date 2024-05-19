package com.example.controlWork.controller;

import com.example.controlWork.entity.QuestEntity;
import com.example.controlWork.entity.UserEntity;
import com.example.controlWork.repository.QuestRep;
import com.example.controlWork.repository.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    UserRep userRep;
    @Autowired
    QuestRep questRep;
    @GetMapping("/")
    public String handleHome() {
        return "index";
    }
    @GetMapping("/users")
    public String handleUsers(Model model){
        List<UserEntity> users = userRep.findAllUsers();
        model.addAttribute("users", users);
        return "users";
    }
    @GetMapping("/quests")
    public String handleQuests(Model model){
        List<QuestEntity> quests  = questRep.findAllQuests();
        model.addAttribute("quests", quests);
        return "quests";
    }
}
