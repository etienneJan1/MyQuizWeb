package com.example.Myquiz.DTO;


import java.io.IOException;

import com.example.Myquiz.models.Question;

public class QuestionMapper {

    // Convertit un objet QuestionDto en objet Question en spécifiant l'identifiant (id)
    public static Question fromDto(Question dto, Long id) throws IOException {
        return new Question.Builder()
                .id(id)
                .contenu(dto.getContenu())
                .genre(dto.getGenre())
                .quizz(dto.getQuizz())
                .build();
    }

    // Convertit un objet Question en objet QuestionDto
    public static QuestionDto toDto (Question question){
        return QuestionDto.builder()
                .contenu(question.getContenu())
                .genre(question.getGenre())
                .quizz(question.getQuizz())
                .build();
    }
}
