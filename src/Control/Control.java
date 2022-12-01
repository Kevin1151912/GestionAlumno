/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import DAO.RegistrarAlumno;
import DAO.RegistrarMateria;
import DAO.RegistrarMatricula;
import DTO.Alumno;
import DTO.Materia;
import DTO.Matricula;
import Servicios.Conexion;
import java.sql.Date;

/**
 *
 * @author kevin
 */
public class Control {

    private RegistrarAlumno ra = new RegistrarAlumno();
    private RegistrarMateria rm = new RegistrarMateria();
    private RegistrarMatricula rmt = new RegistrarMatricula();

    
    public void registrarA(Alumno a) {

        try {
            //   RegistrarProducto rp = new RegistrarProducto();

            ra.registrar(Conexion.obtener(), a);
        } catch (Exception e) {

        }

    }
    public void registrarM(Materia m) {

        try {
            //   RegistrarProducto rp = new RegistrarProducto();
            
            rm.registrar(Conexion.obtener(), m);
        } catch (Exception e) {

        }

    }
    
    public void registrarMT(Matricula mt, Alumno a, Materia m) {

        try {

            rmt.registrar(Conexion.obtener(), mt, a, m);
        } catch (Exception e) {

        }

    }

    public void actualizarA(Integer idAlumno, String nombre, String apellido, String email, String genero) {
        try {
            //  RegistrarProducto rp=new RegistrarProducto();
            ra.actualizar(Conexion.obtener(), idAlumno, nombre, apellido, email, genero);
        } catch (Exception e) {

        }
    }
    
    public void actualizarM(Integer idMateria,String nombre,String profesor,String creditos) {
        try {
            //  RegistrarProducto rp=new RegistrarProducto();
            rm.actualizar(Conexion.obtener(), idMateria, nombre, profesor, creditos);
        } catch (Exception e) {

        }
    }
    
    public void actualizarMt(Integer idMatricula,Integer idAlumno,Integer idMateria ,Date fechaMatricula) {
        try {
            //  RegistrarProducto rp=new RegistrarProducto();
            rmt.actualizar(Conexion.obtener(), idMatricula, idAlumno, idMateria, fechaMatricula);
        } catch (Exception e) {

        }
    }

    public Alumno buscarAlumno(Integer idAlumno) {
        try {
            return ra.buscar(Conexion.obtener(), idAlumno);
        } catch (Exception e) {

        }
        return null;
    }
    
    public Materia buscarMateria(Integer idMateria) {
        try {
            return rm.buscar(Conexion.obtener(), idMateria);
        } catch (Exception e) {

        }
        return null;
    }
    
    public Matricula buscarMatricula(Integer idMatricula) {
        try {
            return rmt.buscar(Conexion.obtener(), idMatricula);
        } catch (Exception e) {

        }
        return null;
    }
    
    public void eliminar(Integer idAlumno, Integer idMateria, Integer idMatricula){
        try{
            //RegistrarProducto rp=new RegistrarProducto();
            ra.eliminar(Conexion.obtener(), idAlumno);
            rm.eliminar(Conexion.obtener(), idMateria);
            rmt.eliminar(Conexion.obtener(), idMatricula);
        }catch(Exception e){
            
        }
    }

}
