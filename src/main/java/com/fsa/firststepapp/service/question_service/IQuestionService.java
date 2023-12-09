package com.fsa.firststepapp.service.question_service;

<<<<<<< HEAD
=======
import com.fsa.firststepapp.models.Question;
import com.fsa.firststepapp.models.User;
>>>>>>> e76753342bcc4ac65edfcce4935e62cc95b6f8ee
import com.fsa.firststepapp.models.dto.QuestionDto;

import java.util.List;
import java.util.Optional;

public interface IQuestionService {
    List<QuestionDto> getAllQuestions();
    Question addQuestion(String userEmail, String questionText, String category);
}