/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author david
 */
@Entity
@Table(name = "estudiantes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estudiantes.findAll", query = "SELECT e FROM Estudiantes e")
    , @NamedQuery(name = "Estudiantes.findByIdEstudiante", query = "SELECT e FROM Estudiantes e WHERE e.idEstudiante = :idEstudiante")
    , @NamedQuery(name = "Estudiantes.findByCedulaEstudiante", query = "SELECT e FROM Estudiantes e WHERE e.cedulaEstudiante = :cedulaEstudiante")
    , @NamedQuery(name = "Estudiantes.findByNombreEstudiante", query = "SELECT e FROM Estudiantes e WHERE e.nombreEstudiante = :nombreEstudiante")})
public class Estudiantes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEstudiante")
    private Integer idEstudiante;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cedulaEstudiante")
    private int cedulaEstudiante;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombreEstudiante")
    private String nombreEstudiante;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstudiante")
    private Collection<Matriculas> matriculasCollection;

    public Estudiantes() {
    }

    public Estudiantes(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Estudiantes(Integer idEstudiante, int cedulaEstudiante, String nombreEstudiante) {
        this.idEstudiante = idEstudiante;
        this.cedulaEstudiante = cedulaEstudiante;
        this.nombreEstudiante = nombreEstudiante;
    }

    public Integer getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getCedulaEstudiante() {
        return cedulaEstudiante;
    }

    public void setCedulaEstudiante(int cedulaEstudiante) {
        this.cedulaEstudiante = cedulaEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    @XmlTransient
    public Collection<Matriculas> getMatriculasCollection() {
        return matriculasCollection;
    }

    public void setMatriculasCollection(Collection<Matriculas> matriculasCollection) {
        this.matriculasCollection = matriculasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstudiante != null ? idEstudiante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiantes)) {
            return false;
        }
        Estudiantes other = (Estudiantes) object;
        if ((this.idEstudiante == null && other.idEstudiante != null) || (this.idEstudiante != null && !this.idEstudiante.equals(other.idEstudiante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Estudiantes[ idEstudiante=" + idEstudiante + " ]";
    }
    
}
