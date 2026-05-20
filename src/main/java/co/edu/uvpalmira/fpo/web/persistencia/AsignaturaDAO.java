/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpo.web.persistencia;

import co.edu.uvpalmira.fpo.web.modelo.Asignatura;
import co.edu.uvpalmira.fpoe.jpalib.AbstractDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import java.util.List;

/**
 *
 * @author Sala Sistemas
 */

public class AsignaturaDAO extends AbstractDAO<Asignatura>{
    
    public AsignaturaDAO(EntityManagerFactory emf) {
        super(Asignatura.class, emf);
    }



    
    //Metodo que ejecuta la consulta que  y devuelve el resultado correspondiente
    public Asignatura buscarPorCodigo(String codigo){
        EntityManager em = super.getEntityManager();
        return (Asignatura) em.createNamedQuery("Asignatura.buscarPorCodigo")
                .setParameter("codigo", codigo)
                .getSingleResult();
    }
    
    //Metodo que ejecuto la consulta y devuelve una lista con los resultados
    public List<Asignatura> buscarPorEScuela(String codigoEscuela){
        EntityManager em = super.getEntityManager();
        return em.createNamedQuery("Asignatura.buscarPorEscuela")
                .setParameter("prefijo", codigoEscuela)
                .getResultList();
    }
    
}
