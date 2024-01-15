package com.fsa.firststepapp.repository;

import com.fsa.firststepapp.models.Question;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface QuestionRepository extends CrudRepository<Question, Long> {
     Optional<Question> findByQuestionId(Long questionId);
}
