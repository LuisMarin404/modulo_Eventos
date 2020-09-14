/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Luis
 */
@Entity
@Table(name = "cootizacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cootizacion.findAll", query = "SELECT c FROM Cootizacion c")
    , @NamedQuery(name = "Cootizacion.findByIdCotizacion", query = "SELECT c FROM Cootizacion c WHERE c.idCotizacion = :idCotizacion")})
public class Cootizacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCotizacion")
    private Integer idCotizacion;
    @JoinColumn(name = "Reserva_id", referencedColumnName = "idReserva")
    @ManyToOne(optional = false)
    private Reserva reservaid;
    @JoinColumn(name = "Eventos_id", referencedColumnName = "idEventos")
    @ManyToOne(optional = false)
    private Eventos eventosid;

    public Cootizacion() {
    }

    public Cootizacion(Integer idCotizacion) {
        this.idCotizacion = idCotizacion;
    }

    public Integer getIdCotizacion() {
        return idCotizacion;
    }

    public void setIdCotizacion(Integer idCotizacion) {
        this.idCotizacion = idCotizacion;
    }

    public Reserva getReservaid() {
        return reservaid;
    }

    public void setReservaid(Reserva reservaid) {
        this.reservaid = reservaid;
    }

    public Eventos getEventosid() {
        return eventosid;
    }

    public void setEventosid(Eventos eventosid) {
        this.eventosid = eventosid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCotizacion != null ? idCotizacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cootizacion)) {
            return false;
        }
        Cootizacion other = (Cootizacion) object;
        if ((this.idCotizacion == null && other.idCotizacion != null) || (this.idCotizacion != null && !this.idCotizacion.equals(other.idCotizacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entidades.Cootizacion[ idCotizacion=" + idCotizacion + " ]";
    }
    
}
