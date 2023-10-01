package com.agenda.app.repository;

import org.springframework.stereotype.Repository;
import com.agenda.app.model.Contato;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, UUID> {
    
} 
