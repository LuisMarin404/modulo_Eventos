/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Luis
 */
@Entity
@Table(name = "reserva")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reserva.findAll", query = "SELECT r FROM Reserva r")
    , @NamedQuery(name = "Reserva.findByIdReserva", query = "SELECT r FROM Reserva r WHERE r.idReserva = :idReserva")
    , @NamedQuery(name = "Reserva.findByFecha", query = "SELECT r FROM Reserva r WHERE r.fecha = :fecha")
    , @NamedQuery(name = "Reserva.findByFechaLimite", query = "SELECT r FROM Reserva r WHERE r.fechaLimite = :fechaLimite")})
public class Reserva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idReserva")
    private Integer idReserva;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_Limite")
    private int fechaLimite;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reservaid")
    private Collection<Cootizacion> cootizacionCollection;
    @JoinColumn(name = "Cliente_id", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false)
    private Usuario clienteid;
    @JoinColumn(name = "Recepcion_id", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false)
    private Usuario recepcionid;

    public Reserva() {
    }

    public Reserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public Reserva(Integer idReserva, Date fecha, int fechaLimite) {
        this.idReserva = idReserva;
        this.fecha = fecha;
        this.fechaLimite = fechaLimite;
    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(int fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    @XmlTransient
    public Collection<Cootizacion> getCootizacionCollection() {
        return cootizacionCollection;
    }

    public void setCootizacionCollection(Collection<Cootizacion> cootizacionCollection) {
        this.cootizacionCollection = cootizacionCollection;
    }

    public Usuario getClienteid() {
        return clienteid;
    }

    public void setClienteid(Usuario clienteid) {
        this.clienteid = clienteid;
    }

    public Usuario getRecepcionid() {
        return recepcionid;
    }

    public void setRecepcionid(Usuario recepcionid) {
        this.recepcionid = recepcionid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReserva != null ? idReserva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reserva)) {
            return false;
        }
        Reserva other = (Reserva) object;
        if ((this.idReserva == null && other.idReserva != null) || (this.idReserva != null && !this.idReserva.equals(other.idReserva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entidades.Reserva[ idReserva=" + idReserva + " ]";
    }
    
}
