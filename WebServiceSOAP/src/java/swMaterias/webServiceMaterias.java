
package swMaterias;

import beans.MateriasFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.Materias;

/**
 *
 * @author david
 */
@WebService(serviceName = "webServiceMaterias")
@Stateless()
public class webServiceMaterias {

    @EJB
    private MateriasFacadeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "materias") Materias materias) {
        ejbRef.create(materias);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "materias") Materias materias) {
        ejbRef.edit(materias);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "materias") Materias materias) {
        ejbRef.remove(materias);
    }

    @WebMethod(operationName = "find")
    public Materias find(@WebParam(name = "id") int id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Materias> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Materias> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }
    
}
