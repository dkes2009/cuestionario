package com.crud.cuestionario.repository;

import com.crud.cuestionario.entity.RequiQuestions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionsRepository  extends JpaRepository <RequiQuestions, Long> {
}
