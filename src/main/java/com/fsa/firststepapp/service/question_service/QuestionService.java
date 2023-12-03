package com.fsa.firststepapp.service.question_service;

import com.fsa.firststepapp.models.Question;
import com.fsa.firststepapp.models.dto.QuestionDto;
import com.fsa.firststepapp.models.exception.models.EntityNotFoundException;
import com.fsa.firststepapp.models.mappers.QuestionMapper;
import com.fsa.firststepapp.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService implements IQuestionService{
    private final QuestionRepository questionRepository;
    private final QuestionMapper questionMapper;

    @Autowired
    public QuestionService(QuestionRepository questionRepository, QuestionMapper questionMapper){
        this.questionRepository=questionRepository;
        this.questionMapper=questionMapper;
    }

    @Override
    public List<QuestionDto> getAllQuestions() {
        List<Question> questions = (List<Question>) questionRepository.findAll();

        if(questions.isEmpty()) {
            throw new EntityNotFoundException("Questions Not Found!!");
        }

        return questionMapper.convertModelListToDtoList(questions);
    }
}
