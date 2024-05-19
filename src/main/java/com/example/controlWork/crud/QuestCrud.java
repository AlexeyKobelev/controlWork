package com.example.controlWork.crud;

import com.example.controlWork.entity.QuestEntity;
import com.example.controlWork.repository.QuestRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuestCrud {
    @Autowired
    QuestRep questsRespository;
    @PostMapping("/questadd")
    public void addUser(@RequestBody QuestEntity quest) {
        questsRespository.addQuest(quest);
    }

    @DeleteMapping("/questdelete/{id}")
    public ResponseEntity<Void> deleteQuest(@PathVariable Integer id) {
        questsRespository.deleteQuestById(id);
        return ResponseEntity.noContent().build();
    }
}
