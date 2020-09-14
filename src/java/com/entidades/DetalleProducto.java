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
@Table(name = "detalle_producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleProducto.findAll", query = "SELECT d FROM DetalleProducto d")
    , @NamedQuery(name = "DetalleProducto.findByIdDetallprod", query = "SELECT d FROM DetalleProducto d WHERE d.idDetallprod = :idDetallprod")
    , @NamedQuery(name = "DetalleProducto.findByCantidad", query = "SELECT d FROM DetalleProducto d WHERE d.cantidad = :cantidad")
    , @NamedQuery(name = "DetalleProducto.findByPrecio", query = "SELECT d FROM DetalleProducto d WHERE d.precio = :precio")})
public class DetalleProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDetall_prod")
    private Integer idDetallprod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private double precio;
    @JoinColumn(name = "Evento_id", referencedColumnName = "idEventos")
    @ManyToOne(optional = false)
    private Eventos eventoid;
    @JoinColumn(name = "Producto_id", referencedColumnName = "idProducto")
    @ManyToOne(optional = false)
    private Producto productoid;

    public DetalleProducto() {
    }

    public DetalleProducto(Integer idDetallprod) {
        this.idDetallprod = idDetallprod;
    }

    public DetalleProducto(Integer idDetallprod, int cantidad, double precio) {
        this.idDetallprod = idDetallprod;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Integer getIdDetallprod() {
        return idDetallprod;
    }

    public void setIdDetallprod(Integer idDetallprod) {
        this.idDetallprod = idDetallprod;
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

    public Eventos getEventoid() {
        return eventoid;
    }

    public void setEventoid(Eventos eventoid) {
        this.eventoid = eventoid;
    }

    public Producto getProductoid() {
        return productoid;
    }

    public void setProductoid(Producto productoid) {
        this.productoid = productoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetallprod != null ? idDetallprod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleProducto)) {
            return false;
        }
        DetalleProducto other = (DetalleProducto) object;
        if ((this.idDetallprod == null && other.idDetallprod != null) || (this.idDetallprod != null && !this.idDetallprod.equals(other.idDetallprod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entidades.DetalleProducto[ idDetallprod=" + idDetallprod + " ]";
    }
    
}
