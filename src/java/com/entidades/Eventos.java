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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
 * @author Luis
 */
@Entity
@Table(name = "eventos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Eventos.findAll", query = "SELECT e FROM Eventos e")
    , @NamedQuery(name = "Eventos.findByIdEventos", query = "SELECT e FROM Eventos e WHERE e.idEventos = :idEventos")
    , @NamedQuery(name = "Eventos.findByTipoEventos", query = "SELECT e FROM Eventos e WHERE e.tipoEventos = :tipoEventos")})
public class Eventos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEventos")
    private Integer idEventos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "tipo_Eventos")
    private String tipoEventos;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventoid")
    private Collection<DetalleProducto> detalleProductoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventosid")
    private Collection<Cootizacion> cootizacionCollection;
    @JoinColumn(name = "Lugar_id", referencedColumnName = "idLugar")
    @ManyToOne(optional = false)
    private Lugar lugarid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEventos")
    private Collection<DetalleMenu> detalleMenuCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventosid")
    private Collection<DetalleServicio> detalleServicioCollection;

    public Eventos() {
    }

    public Eventos(Integer idEventos) {
        this.idEventos = idEventos;
    }

    public Eventos(Integer idEventos, String tipoEventos, String descripcion) {
        this.idEventos = idEventos;
        this.tipoEventos = tipoEventos;
        this.descripcion = descripcion;
    }

    public Integer getIdEventos() {
        return idEventos;
    }

    public void setIdEventos(Integer idEventos) {
        this.idEventos = idEventos;
    }

    public String getTipoEventos() {
        return tipoEventos;
    }

    public void setTipoEventos(String tipoEventos) {
        this.tipoEventos = tipoEventos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<DetalleProducto> getDetalleProductoCollection() {
        return detalleProductoCollection;
    }

    public void setDetalleProductoCollection(Collection<DetalleProducto> detalleProductoCollection) {
        this.detalleProductoCollection = detalleProductoCollection;
    }

    @XmlTransient
    public Collection<Cootizacion> getCootizacionCollection() {
        return cootizacionCollection;
    }

    public void setCootizacionCollection(Collection<Cootizacion> cootizacionCollection) {
        this.cootizacionCollection = cootizacionCollection;
    }

    public Lugar getLugarid() {
        return lugarid;
    }

    public void setLugarid(Lugar lugarid) {
        this.lugarid = lugarid;
    }

    @XmlTransient
    public Collection<DetalleMenu> getDetalleMenuCollection() {
        return detalleMenuCollection;
    }

    public void setDetalleMenuCollection(Collection<DetalleMenu> detalleMenuCollection) {
        this.detalleMenuCollection = detalleMenuCollection;
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
        hash += (idEventos != null ? idEventos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eventos)) {
            return false;
        }
        Eventos other = (Eventos) object;
        if ((this.idEventos == null && other.idEventos != null) || (this.idEventos != null && !this.idEventos.equals(other.idEventos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entidades.Eventos[ idEventos=" + idEventos + " ]";
    }
    
}
