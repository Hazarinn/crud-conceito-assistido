package com.defensoria.crudconceitoassistido.repository;

import com.defensoria.crudconceitoassistido.model.Assistido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssistidoRepository extends JpaRepository<Assistido, Long> {
}
