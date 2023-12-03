package com.fsa.firststepapp.service.answer_service;

import com.fsa.firststepapp.models.Answer;
import com.fsa.firststepapp.models.dto.AnswerDto;
import com.fsa.firststepapp.models.exception.models.EntityNotFoundException;
import com.fsa.firststepapp.models.mappers.AnswerMapper;
import com.fsa.firststepapp.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService implements IAnswerService{
    private final AnswerRepository answerRepository;
    private final AnswerMapper answerMapper;

    @Autowired
    public AnswerService(AnswerRepository answerRepository, AnswerMapper answerMapper){
        this.answerMapper = answerMapper;
        this.answerRepository = answerRepository;
    }

    @Override
    public List<AnswerDto> getAllAnswers() {
        List<Answer> answers = (List<Answer>) answerRepository.findAll();

        if(answers.isEmpty()) {
            throw new EntityNotFoundException("Answers Not Found!!");
        }

        return answerMapper.convertModelListToDtoList(answers);
    }
}
