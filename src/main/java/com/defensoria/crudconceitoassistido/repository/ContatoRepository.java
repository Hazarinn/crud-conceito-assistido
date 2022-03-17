package com.defensoria.crudconceitoassistido.repository;

import com.defensoria.crudconceitoassistido.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {
}
