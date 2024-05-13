package com.example.Myquiz.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Myquiz.models.Quizz;

import java.util.Optional;

@Repository
public interface QuizzDao extends JpaRepository<Quizz,Long> {


    // Enregistre un quiz dans la base de données
    Quizz save(Quizz quizz);

    // Supprime un quiz par ID
    void deleteById(Long id);

    // Recherche un quiz par ID
    @Query("SELECT q FROM Quizz q WHERE q.id = :id")
    Optional<Quizz> findById(Long id);
}

