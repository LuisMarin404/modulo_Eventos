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
@Table(name = "detalle_menu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleMenu.findAll", query = "SELECT d FROM DetalleMenu d")
    , @NamedQuery(name = "DetalleMenu.findByIdDetallmenu", query = "SELECT d FROM DetalleMenu d WHERE d.idDetallmenu = :idDetallmenu")})
public class DetalleMenu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDetall_menu")
    private Integer idDetallmenu;
    @JoinColumn(name = "idMenu", referencedColumnName = "idMenu")
    @ManyToOne(optional = false)
    private Menu idMenu;
    @JoinColumn(name = "idEventos", referencedColumnName = "idEventos")
    @ManyToOne(optional = false)
    private Eventos idEventos;

    public DetalleMenu() {
    }

    public DetalleMenu(Integer idDetallmenu) {
        this.idDetallmenu = idDetallmenu;
    }

    public Integer getIdDetallmenu() {
        return idDetallmenu;
    }

    public void setIdDetallmenu(Integer idDetallmenu) {
        this.idDetallmenu = idDetallmenu;
    }

    public Menu getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Menu idMenu) {
        this.idMenu = idMenu;
    }

    public Eventos getIdEventos() {
        return idEventos;
    }

    public void setIdEventos(Eventos idEventos) {
        this.idEventos = idEventos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetallmenu != null ? idDetallmenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleMenu)) {
            return false;
        }
        DetalleMenu other = (DetalleMenu) object;
        if ((this.idDetallmenu == null && other.idDetallmenu != null) || (this.idDetallmenu != null && !this.idDetallmenu.equals(other.idDetallmenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entidades.DetalleMenu[ idDetallmenu=" + idDetallmenu + " ]";
    }
    
}
