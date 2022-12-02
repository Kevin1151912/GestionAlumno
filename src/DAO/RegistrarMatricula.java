/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Alumno;
import DTO.Materia;
import DTO.Matricula;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class RegistrarMatricula {
    
    public static void registrar(Connection cn, DTO.Matricula mt, DTO.Alumno a, DTO.Materia m) throws SQLException {
        try {
            PreparedStatement consulta;
            consulta = cn.prepareStatement("Insert into matricula(idmatricula,idalumno,idmateria,fechaMatricula) Values(?,?,?,?)");
            consulta.setInt(1, mt.getIdMatricula());
            consulta.setInt(2,  a.getIdAlumno());
            consulta.setInt(3, m.getIdMateria());
            consulta.setString(4, mt.getFechaMatricula());
            consulta.executeUpdate();
            System.out.println("guarda");
        } catch (SQLException e) {
            System.out.println("E guardar");
            throw new SQLException(e);
        }
    }
    
    public static Matricula buscar(Connection cn,Integer idMatricula) throws SQLException{
        Matricula ma=new Matricula();
        Alumno a=new Alumno();
        Materia m=new Materia();
        
            try{
            PreparedStatement consulta;
            consulta=cn.prepareStatement("Select idAlumno as ia , idMateria as im , fechaMatricula as fm from producto where idMatricula='"+idMatricula+"'");
            ResultSet rs=consulta.executeQuery();
            if(rs.next()){
                a.setIdAlumno(rs.getInt("ia"));
                m.setIdMateria(rs.getInt("im"));
                ma.setFechaMatricula(rs.getString("fm"));
                
            }
        }catch(SQLException e){
            throw new SQLException(e);
        }
        return ma;
    }
    
    public static void actualizar(Connection cn,Integer idMatricula,Integer idAlumno,Integer idMateria ,Date fechaMatricula) throws SQLException{
        try{
            PreparedStatement consulta;
            consulta=cn.prepareStatement("UPDATE matricula set idAlumno='"+idAlumno+"' , idMateria='"+idMateria+"' ,fechaMatricula='"+fechaMatricula+"' where idMatricula='"+idMatricula+"'");
            consulta.executeUpdate();
            System.out.println("Actualiza");
        }catch(SQLException e){
            System.out.println("E actualizar");
            throw new SQLException(e);
        }
    }
    
    public static void eliminar(Connection cn,Integer idMatricula) throws SQLException{
        try{
            PreparedStatement consulta;
            consulta=cn.prepareStatement("DELETE from matricula where idMatricula='"+idMatricula+"'");
            consulta.executeUpdate();
            System.out.println("Elimina");
            JOptionPane.showMessageDialog(null, "Matricula Eliminada");
        }catch(SQLException e){
            System.out.println("    E eliminar");
            throw new SQLException(e);
        }
    }
    
}
