package com.agenda.app.repository;

import org.springframework.stereotype.Repository;
import com.agenda.app.model.Contato;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer> {
  
  public List<Contato> findAllByNome(String name);
  public List<Contato> findAllByEndereco(String endereco);
  public List<Contato> findAllByTelefone(String string);
  public List<Contato> findAllByEmail(String email);
}
