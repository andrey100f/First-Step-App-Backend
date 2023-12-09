package com.fsa.firststepapp.service.question_service;

import com.fsa.firststepapp.models.dto.QuestionDto;

import java.util.List;

public interface IQuestionService {
    List<QuestionDto> getAllQuestions();
    QuestionDto addQuestion(String userEmail, String questionText, String category);
}