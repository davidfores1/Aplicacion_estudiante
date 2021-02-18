
package swMatriculas;

import beans.MatriculasFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.Matriculas;

/**
 *
 * @author david
 */
@WebService(serviceName = "webServiceMatriculas")
@Stateless()
public class webServiceMatriculas {

    @EJB
    private MatriculasFacadeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "matriculas") Matriculas matriculas) {
        ejbRef.create(matriculas);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "matriculas") Matriculas matriculas) {
        ejbRef.edit(matriculas);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "matriculas") Matriculas matriculas) {
        ejbRef.remove(matriculas);
    }

    @WebMethod(operationName = "find")
    public Matriculas find(@WebParam(name = "id") int id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Matriculas> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Matriculas> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }
    
}
