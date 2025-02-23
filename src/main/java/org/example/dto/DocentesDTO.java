package org.example.dto;

public class DocentesDTO {
    private String nombreDocente;
    private String apellidoDocente;
    private int cursoImparte;

    public DocentesDTO(){};

    public String getNombreDocente() {
        return nombreDocente;
    }

    public String getApellidoDocente() {
        return apellidoDocente;
    }

    public int getCursoImparte() {
        return cursoImparte;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public void setApellidoDocente(String apellidoDocente) {
        this.apellidoDocente = apellidoDocente;
    }

    public void setCursoImparte(int cursoImparte) {
        this.cursoImparte = cursoImparte;
    }
}
