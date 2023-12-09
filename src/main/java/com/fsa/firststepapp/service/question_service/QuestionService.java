package com.fsa.firststepapp.service.question_service;

import com.fsa.firststepapp.models.User;
import com.fsa.firststepapp.models.Question;
import com.fsa.firststepapp.models.dto.QuestionDto;
import com.fsa.firststepapp.models.exception.models.EntityNotFoundException;
import com.fsa.firststepapp.models.mappers.QuestionMapper;
import com.fsa.firststepapp.repository.QuestionRepository;
import com.fsa.firststepapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class QuestionService implements IQuestionService{
    private final QuestionRepository questionRepository;
    private final QuestionMapper questionMapper;
    private final UserRepository userRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository, QuestionMapper questionMapper, UserRepository userRepository){
        this.questionRepository=questionRepository;
        this.questionMapper=questionMapper;
        this.userRepository = userRepository;
    }

    @Override
    public List<QuestionDto> getAllQuestions() {
        List<Question> questions = (List<Question>) questionRepository.findAll();

        if(questions.isEmpty()) {
            throw new EntityNotFoundException("Questions Not Found!!");
        }

        return questionMapper.convertModelListToDtoList(questions);
    }
  
   public QuestionDto addQuestion(String userEmail, String questionText, String category) {
        Optional<User> user = userRepository.findByEmail(userEmail);

        if (user.isPresent()) {
            Question question = new Question();
            question.setText(questionText);
            question.setQuestionDate(new Date());
            question.setCategory(category);
            question.setUser(user);

            return questionMapper.convertModelToDto(questionRepository.save(question));
        } else {
            throw new EntityNotFoundException("User not found with email: " + userEmail);
        }
    }
}
