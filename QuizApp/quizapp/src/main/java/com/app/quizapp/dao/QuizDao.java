package com.app.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer> {

}
