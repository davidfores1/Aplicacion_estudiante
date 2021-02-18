/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Matriculas;

/**
 *
 * @author david
 */
@Stateless
public class MatriculasFacade extends AbstractFacade<Matriculas> implements MatriculasFacadeLocal {

    @PersistenceContext(unitName = "WebServiceSOAPPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MatriculasFacade() {
        super(Matriculas.class);
    }
    
}
