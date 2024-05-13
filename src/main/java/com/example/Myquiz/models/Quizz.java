package com.example.Myquiz.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

//Même principe pour les annotations
//On définit encore une séquence pour l'id et on précise les relations et colonnes
@Entity
@Getter
@Table(name= "quizz")
public class Quizz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "quizz_id_seq")
    private Long id;
    private String genre;
    @OneToMany(mappedBy = "quizz", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Question> questions;

    //On définit les getters et setters
    public Long getId() {
        return id;
    }

    public String getGenre() {
        return genre;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }


    private Quizz(Builder builder) {
        this.id = builder.id;
        this.genre = builder.genre;
        this.questions=builder.questions;
    }
    public Quizz() {
    }

    //On créé un builder pour les quizz
    public static class Builder {
        private Long id;
        private String genre;

        private List<Question> questions;

        public Builder id (Long id) {
            this.id = id;
            return this;
        }

        public Builder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public Builder questions(List<Question> questions){
            this.questions=questions;
            return this;
        }
        public Quizz build() {
            return new Quizz(this);
        }
    }
}


