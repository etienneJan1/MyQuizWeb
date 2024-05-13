package com.example.Myquiz.DTO;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

import com.example.Myquiz.models.Question;
@Builder
@Getter
public class QuizzDto {
    private String genre;
    private List<Question> questions;
}
