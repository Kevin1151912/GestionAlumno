/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Matricula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kevin
 */
public class RegistrarMatricula {
    
    public static void registrarMatricula(Connection cn, Matricula mt) throws SQLException {
        try {
            PreparedStatement consulta;
            consulta = cn.prepareStatement("Insert into matricula(idMatricula,idAlumno,idMatricula,fechaMatricula) Values(?,?,?,?,?)");
            consulta.setInt(1, mt.getIdMatricula());
            consulta.setInt(2, mt.getIdAlumno());
            consulta.setInt(3, mt.getIdMatricula());
            consulta.setDate(4, mt.getFechaMatricula());
            consulta.executeUpdate();
            System.out.println("guarda");
        } catch (SQLException e) {
            System.out.println("E guardar");
            throw new SQLException(e);
        }
    }
    
    public static Producto buscar(Connection cn,String codigo) throws SQLException{
        Producto p=new Producto();
        try{
            PreparedStatement consulta;
            consulta=cn.prepareStatement("Select categoria as Cate , descripcion as Des , valor as Valor , stock as Stock from producto where codigo='"+codigo+"'");
            ResultSet rs=consulta.executeQuery();
            if(rs.next()){
                p.setCategoria(rs.getString("Cate"));
                p.setDescripcion(rs.getString("Des"));
                p.setValor(rs.getInt("Valor"));
                p.setStock(rs.getInt("Stock"));
                
            }
        }catch(SQLException e){
            throw new SQLException(e);
        }
        return p;
    }
    
}
