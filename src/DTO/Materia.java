/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author kevin
 */
public class Materia {
    
    private Integer idMateria;
    private String nombre;
    private String profesor;
    private String creditos;

    public Materia() {
    }

    public Materia(Integer idMateria, String nombre, String profesor, String creditos) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.profesor = profesor;
        this.creditos = creditos;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Informacion De La Materia{" + "idMateria=" + idMateria + ", nombre=" + nombre + ", profesor=" + profesor + ", creditos=" + creditos + '}';
    }
    
    
    
}
