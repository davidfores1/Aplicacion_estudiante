
package beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Materias;

/**
 *
 * @author david
 */
@Stateless
public class MateriasFacade extends AbstractFacade<Materias> implements MateriasFacadeLocal {

    @PersistenceContext(unitName = "WebServiceSOAPPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MateriasFacade() {
        super(Materias.class);
    }
    
}
