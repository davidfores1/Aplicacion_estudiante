
package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author david
 */
@Entity
@Table(name = "matriculas")
@XmlRootElement

public class Matriculas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMatricula")
    private int idMatricula;
 
    @JoinColumn(name = "idEstudiante", referencedColumnName = "idEstudiante")
    @ManyToOne(optional = false)
    private Estudiantes idEstudiante;
    
    @JoinColumn(name = "idMateria", referencedColumnName = "idMateria")
    @ManyToOne(optional = false)
    private Materias idMateria;

    public Matriculas() {
    }

    public Matriculas(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    
    
    public Estudiantes getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Estudiantes idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Materias getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Materias idMateria) {
        this.idMateria = idMateria;
    }

}
