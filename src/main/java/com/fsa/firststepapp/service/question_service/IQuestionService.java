package com.fsa.firststepapp.service.question_service;

import com.fsa.firststepapp.models.Question;
import com.fsa.firststepapp.models.User;
import com.fsa.firststepapp.models.dto.QuestionDto;

import java.util.List;
import java.util.Optional;

public interface IQuestionService {
    List<QuestionDto> getAllQuestions();
  //  Question addQuestion(String userEmail, String questionText, String category);
   // Optional<User> findByEmail(String email) ;
}