package beans;

import java.util.List;
import javax.ejb.Local;
import modelo.Materias;

/**
 *
 * @author david
 */
@Local
public interface MateriasFacadeLocal {

    void create(Materias materias);

    void edit(Materias materias);

    void remove(Materias materias);

    Materias find(Object id);

    List<Materias> findAll();

    List<Materias> findRange(int[] range);

    int count();
    
}
