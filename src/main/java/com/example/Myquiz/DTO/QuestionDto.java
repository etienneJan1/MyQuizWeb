package com.example.Myquiz.DTO;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

import com.example.Myquiz.models.Quizz;
import com.example.Myquiz.models.Reponse;

@Builder
@Getter
public class QuestionDto {
    private Long id;
    private String contenu;
    private String genre;
    private List<Reponse> reponses;
    private Quizz quizz;

}
