package com.questions.QuestionService.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.questions.QuestionService.entities.Question;

public interface QuestionService {

	Question create(Question question);
	
	List<Question> get();
	
	Question getOne(Long id);
	
	List<Question> getQuestionsOfQuiz(Long quizId);
	
}
