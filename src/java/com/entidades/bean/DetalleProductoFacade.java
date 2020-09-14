/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidades.bean;

import com.entidades.DetalleProducto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Luis
 */
@Stateless
public class DetalleProductoFacade extends AbstractFacade<DetalleProducto> {

    @PersistenceContext(unitName = "modulo_EventosPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DetalleProductoFacade() {
        super(DetalleProducto.class);
    }
    
}
