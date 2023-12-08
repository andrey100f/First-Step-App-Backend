package com.fsa.firststepapp.repository;

import com.fsa.firststepapp.models.Question;
import com.fsa.firststepapp.models.User;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question, Long> {
     Question findByQuestionId(Long questionId);
}
