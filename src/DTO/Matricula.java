/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.sql.Date;

/**
 *
 * @author kevin
 */
public class Matricula {
    
    private Integer idMatricula;
    private Alumno idAlumno;
    private Materia idMateria;
    private String fechaMatricula;
    

    public Matricula() {
    }

    public Matricula(Integer idMatricula, Alumno idAlumno, Materia idMateria, String fechaMatricula) {
        this.idMatricula = idMatricula;
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
        this.fechaMatricula = fechaMatricula;
    }

    public Integer getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(Integer idMatricula) {
        this.idMatricula = idMatricula;
    }

    public Alumno getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Alumno idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Materia getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Materia idMateria) {
        this.idMateria = idMateria;
    }

    public String getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(String fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }
}
