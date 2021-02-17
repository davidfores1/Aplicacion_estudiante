/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author david
 */
@Entity
@Table(name = "materias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materias.findAll", query = "SELECT m FROM Materias m")
    , @NamedQuery(name = "Materias.findByIdMateria", query = "SELECT m FROM Materias m WHERE m.idMateria = :idMateria")
    , @NamedQuery(name = "Materias.findByCodigoMateria", query = "SELECT m FROM Materias m WHERE m.codigoMateria = :codigoMateria")
    , @NamedQuery(name = "Materias.findByNombreMateria", query = "SELECT m FROM Materias m WHERE m.nombreMateria = :nombreMateria")
    , @NamedQuery(name = "Materias.findByFecha", query = "SELECT m FROM Materias m WHERE m.fecha = :fecha")})
public class Materias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMateria")
    private Integer idMateria;
    @Column(name = "codigoMateria")
    private Integer codigoMateria;
    @Size(max = 100)
    @Column(name = "nombreMateria")
    private String nombreMateria;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @OneToMany(mappedBy = "idMateria")
    private List<Matriculas> matriculasList;

    public Materias() {
    }

    public Materias(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public Integer getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(Integer codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @XmlTransient
    public List<Matriculas> getMatriculasList() {
        return matriculasList;
    }

    public void setMatriculasList(List<Matriculas> matriculasList) {
        this.matriculasList = matriculasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMateria != null ? idMateria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materias)) {
            return false;
        }
        Materias other = (Materias) object;
        if ((this.idMateria == null && other.idMateria != null) || (this.idMateria != null && !this.idMateria.equals(other.idMateria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Materias[ idMateria=" + idMateria + " ]";
    }
    
}
