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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Luis
 */
@Entity
@Table(name = "detalle_servicio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleServicio.findAll", query = "SELECT d FROM DetalleServicio d")
    , @NamedQuery(name = "DetalleServicio.findByIdDetallServ", query = "SELECT d FROM DetalleServicio d WHERE d.idDetallServ = :idDetallServ")
    , @NamedQuery(name = "DetalleServicio.findByCantidad", query = "SELECT d FROM DetalleServicio d WHERE d.cantidad = :cantidad")
    , @NamedQuery(name = "DetalleServicio.findByPrecio", query = "SELECT d FROM DetalleServicio d WHERE d.precio = :precio")})
public class DetalleServicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDetall_Serv")
    private Integer idDetallServ;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private double precio;
    @JoinColumn(name = "Eventos_id", referencedColumnName = "idEventos")
    @ManyToOne(optional = false)
    private Eventos eventosid;
    @JoinColumn(name = "Servicos_id", referencedColumnName = "idServicios")
    @ManyToOne(optional = false)
    private Servicios servicosid;

    public DetalleServicio() {
    }

    public DetalleServicio(Integer idDetallServ) {
        this.idDetallServ = idDetallServ;
    }

    public DetalleServicio(Integer idDetallServ, int cantidad, double precio) {
        this.idDetallServ = idDetallServ;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Integer getIdDetallServ() {
        return idDetallServ;
    }

    public void setIdDetallServ(Integer idDetallServ) {
        this.idDetallServ = idDetallServ;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Eventos getEventosid() {
        return eventosid;
    }

    public void setEventosid(Eventos eventosid) {
        this.eventosid = eventosid;
    }

    public Servicios getServicosid() {
        return servicosid;
    }

    public void setServicosid(Servicios servicosid) {
        this.servicosid = servicosid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetallServ != null ? idDetallServ.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleServicio)) {
            return false;
        }
        DetalleServicio other = (DetalleServicio) object;
        if ((this.idDetallServ == null && other.idDetallServ != null) || (this.idDetallServ != null && !this.idDetallServ.equals(other.idDetallServ))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entidades.DetalleServicio[ idDetallServ=" + idDetallServ + " ]";
    }
    
}
