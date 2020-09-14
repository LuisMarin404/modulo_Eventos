/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Luis
 */
@Entity
@Table(name = "servicios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servicios.findAll", query = "SELECT s FROM Servicios s")
    , @NamedQuery(name = "Servicios.findByIdServicios", query = "SELECT s FROM Servicios s WHERE s.idServicios = :idServicios")
    , @NamedQuery(name = "Servicios.findByNombre", query = "SELECT s FROM Servicios s WHERE s.nombre = :nombre")
    , @NamedQuery(name = "Servicios.findByProgramaFormacion", query = "SELECT s FROM Servicios s WHERE s.programaFormacion = :programaFormacion")
    , @NamedQuery(name = "Servicios.findByFicha", query = "SELECT s FROM Servicios s WHERE s.ficha = :ficha")})
public class Servicios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idServicios")
    private Integer idServicios;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Lob
    @Size(max = 65535)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 45)
    @Column(name = "programaFormacion")
    private String programaFormacion;
    @Column(name = "ficha")
    private Integer ficha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "servicosid")
    private Collection<DetalleServicio> detalleServicioCollection;

    public Servicios() {
    }

    public Servicios(Integer idServicios) {
        this.idServicios = idServicios;
    }

    public Integer getIdServicios() {
        return idServicios;
    }

    public void setIdServicios(Integer idServicios) {
        this.idServicios = idServicios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getProgramaFormacion() {
        return programaFormacion;
    }

    public void setProgramaFormacion(String programaFormacion) {
        this.programaFormacion = programaFormacion;
    }

    public Integer getFicha() {
        return ficha;
    }

    public void setFicha(Integer ficha) {
        this.ficha = ficha;
    }

    @XmlTransient
    public Collection<DetalleServicio> getDetalleServicioCollection() {
        return detalleServicioCollection;
    }

    public void setDetalleServicioCollection(Collection<DetalleServicio> detalleServicioCollection) {
        this.detalleServicioCollection = detalleServicioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idServicios != null ? idServicios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servicios)) {
            return false;
        }
        Servicios other = (Servicios) object;
        if ((this.idServicios == null && other.idServicios != null) || (this.idServicios != null && !this.idServicios.equals(other.idServicios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entidades.Servicios[ idServicios=" + idServicios + " ]";
    }
    
}
