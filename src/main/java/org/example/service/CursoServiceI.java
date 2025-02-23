package org.example.service;

import org.example.domain.Cursos;
import org.example.dto.CursosDTO;

import java.util.List;
import java.util.Optional;

public interface CursoServiceI {
    List<Cursos> getAllCursos();
    Cursos saveCurso(CursosDTO cursosDTO);
    Optional<Cursos> getCursoByIDCurso(int idCurso);
    Optional<Cursos> updateCurso(int idCurso, CursosDTO cursosDTO);
    void deleteCurso(int idCurso);
}
