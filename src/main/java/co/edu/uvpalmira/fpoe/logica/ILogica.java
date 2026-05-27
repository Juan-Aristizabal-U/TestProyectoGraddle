/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.uvpalmira.fpoe.logica;

import co.edu.uvpalmira.fpo.web.modelo.Asignatura;
import co.edu.uvpalmira.fpoe.jpalib.NonexistentEntityException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

/**
 *
 * @author Sala Sistemas
 */
public interface ILogica {
    
    public void creaAsignatura(Asignatura asignatura) throws SQLIntegrityConstraintViolationException, Exception;
    public void modificarAsignatura(Asignatura asignatura)throws NonexistentEntityException, Exception;
    public Asignatura buscarAsignatura(String codigo);
    public List<Asignatura> buscarAsignaturas();
    
}
