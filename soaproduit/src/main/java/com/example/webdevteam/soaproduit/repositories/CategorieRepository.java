package com.example.webdevteam.soaproduit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.webdevteam.soaproduit.models.CategorieModel;

import java.util.Optional;

@Repository
public interface CategorieRepository extends JpaRepository<CategorieModel, Long> {
    
}
