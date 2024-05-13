package com.example.Myquiz.DTO;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

import com.example.Myquiz.models.Question;

@Builder
@Getter
public class ReponseDTO {
    private String contenu;
    private boolean isGood;
    private Question question;

}