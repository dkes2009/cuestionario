package com.crud.cuestionario.controller;

import com.crud.cuestionario.entity.RequiQuestions;
import com.crud.cuestionario.repository.QuestionsRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controlador {

    private QuestionsRepository questionsRepository;

    public controlador(QuestionsRepository questionsRepository) {
        this.questionsRepository = questionsRepository;
    }

    @CrossOrigin(origins = "http://192.168.1.7:5500")
    @PostMapping("/guardarEncuesta")
    public RequiQuestions guardar(@RequestBody RequiQuestions questions) {

        System.out.println(questions.toString());

        return questionsRepository.save(questions);
    }


}
