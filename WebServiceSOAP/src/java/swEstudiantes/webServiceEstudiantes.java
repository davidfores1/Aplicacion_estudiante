/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swEstudiantes;

import beans.EstudiantesFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.Estudiantes;

/**
 *
 * @author david
 */
@WebService(serviceName = "webServiceEstudiantes")
@Stateless()
public class webServiceEstudiantes {

    @EJB
    private EstudiantesFacadeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "estudiantes") Estudiantes estudiantes) {
        ejbRef.create(estudiantes);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "estudiantes") Estudiantes estudiantes) {
        ejbRef.edit(estudiantes);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "estudiantes") Estudiantes estudiantes) {
        ejbRef.remove(estudiantes);
    }

    @WebMethod(operationName = "find")
    public Estudiantes find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Estudiantes> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Estudiantes> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }
    
}
