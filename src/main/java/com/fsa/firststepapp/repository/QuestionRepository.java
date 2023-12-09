package com.fsa.firststepapp.repository;

import com.fsa.firststepapp.models.Question;
import com.fsa.firststepapp.models.User;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question, Long> {
<<<<<<< HEAD
=======
     Question findByQuestionId(Long questionId);
>>>>>>> e76753342bcc4ac65edfcce4935e62cc95b6f8ee
}
