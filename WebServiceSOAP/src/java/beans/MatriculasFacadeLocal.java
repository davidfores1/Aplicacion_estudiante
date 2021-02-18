/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.List;
import javax.ejb.Local;
import modelo.Matriculas;

/**
 *
 * @author david
 */
@Local
public interface MatriculasFacadeLocal {

    void create(Matriculas matriculas);

    void edit(Matriculas matriculas);

    void remove(Matriculas matriculas);

    Matriculas find(Object id);

    List<Matriculas> findAll();

    List<Matriculas> findRange(int[] range);

    int count();
    
}
