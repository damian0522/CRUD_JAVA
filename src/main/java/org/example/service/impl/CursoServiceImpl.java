package org.example.service.impl;

import org.example.domain.Cursos;
import org.example.dto.CursosDTO;
import org.example.repository.CursosRepository;
import org.example.service.CursoServiceI;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceImpl implements CursoServiceI {

    private final CursosRepository cursosRepository;

    public CursoServiceImpl(CursosRepository  cursosRepository){
        this.cursosRepository = cursosRepository;
    }

    @Override
    public List<Cursos> getAllCursos(){
        return cursosRepository.findAll();
    }

    @Override
    public Optional<Cursos> getCursoByIDCurso(int idCurso){
        return cursosRepository.findById(idCurso);
    }

    @Override
    public Cursos saveCurso(CursosDTO cursosDTO){
        Cursos curso = new Cursos();
        curso.setNombreCurso(cursosDTO.getNombreCurso());
        curso.setDescripcionCurso(cursosDTO.getDescripcionCurso());
        curso.setFechaInicio(cursosDTO.getFechaInicio());
        curso.setFechaFin(cursosDTO.getFechaFin());
        curso.setActivo(cursosDTO.isActivo());

        return cursosRepository.save(curso);
    }

    @Override
    public Optional<Cursos> updateCurso(int idCurso, CursosDTO cursosDTO){
        return cursosRepository.findById(idCurso).map(curso -> {
            curso.setNombreCurso(cursosDTO.getNombreCurso());
            curso.setDescripcionCurso(cursosDTO.getDescripcionCurso());
            curso.setFechaInicio(cursosDTO.getFechaInicio());
            curso.setFechaFin(cursosDTO.getFechaFin());
            curso.setActivo(cursosDTO.isActivo());

            return cursosRepository.save(curso);
        });
    }

    @Override
    public void deleteCurso(int idCurso){
        cursosRepository.deleteById(idCurso);
    }
}
