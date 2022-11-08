/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kevin
 */
public class RegistrarMateria {
    
    public static void registrarMateria(Connection cn, Materia m) throws SQLException {
        try {
            PreparedStatement consulta;
            consulta = cn.prepareStatement("Insert into materia(idMateria,nombre,apellido,profesor,creditos) Values(?,?,?,?,?)");
            consulta.setInt(1, m.getIdMateria());
            consulta.setString(2, m.getNombre());
            consulta.setString(3, m.getApellido());
            consulta.setString(4, m.getProfesor());
            consulta.setString(5, m.getCreditos());
            consulta.executeUpdate();
            System.out.println("guarda");
        } catch (SQLException e) {
            System.out.println("E guardar");
            throw new SQLException(e);
        }
    }
    
    public static Alumno buscar(Connection cn,Integer idAlumno) throws SQLException{
        Alumno a =new Alumno();
        try{
            PreparedStatement consulta;
            consulta=cn.prepareStatement("Select nombre as name , apellido as ape , email as ema , genero as gen from alumno where idAlumno='"+idAlumno+"'");
            ResultSet rs=consulta.executeQuery();
            if(rs.next()){
                a.setNombre(rs.getString("name"));
                a.setApellido(rs.getString("ape"));
                a.setEmail(rs.getString("ema"));
                a.setGenero(rs.getString("gen"));
                
            }
        }catch(SQLException e){
            throw new SQLException(e);
        }
        return a;
    }
    
}
