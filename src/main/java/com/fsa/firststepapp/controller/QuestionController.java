package com.fsa.firststepapp.controller;

import com.fsa.firststepapp.models.dto.QuestionDto;
import com.fsa.firststepapp.service.question_service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:8100", allowedHeaders = "*")
@RequestMapping("/api/questions")
public class QuestionController {
    private final IQuestionService questionService;

    @Autowired
    public QuestionController(IQuestionService questionService) { this.questionService = questionService;}

    @GetMapping("")
    public List<QuestionDto> getAllAnswers() {
        return questionService.getAllQuestions();
    }
}
