package org.example.repository;

import org.example.domain.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursosRepository extends JpaRepository<Cursos, Integer> {
}
