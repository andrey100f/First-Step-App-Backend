package com.fsa.firststepapp.service.answer_service;

import com.fsa.firststepapp.models.Answer;
import com.fsa.firststepapp.models.dto.AnswerDto;

import java.util.List;

public interface IAnswerService {
    List<AnswerDto> getAllAnswers();

    Answer addAnswer(String userEmail, Long questionId, String answerText);
}
