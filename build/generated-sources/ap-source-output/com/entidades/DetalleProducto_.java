package com.entidades;

import com.entidades.Eventos;
import com.entidades.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-09-14T09:56:40")
@StaticMetamodel(DetalleProducto.class)
public class DetalleProducto_ { 

    public static volatile SingularAttribute<DetalleProducto, Double> precio;
    public static volatile SingularAttribute<DetalleProducto, Eventos> eventoid;
    public static volatile SingularAttribute<DetalleProducto, Producto> productoid;
    public static volatile SingularAttribute<DetalleProducto, Integer> idDetallprod;
    public static volatile SingularAttribute<DetalleProducto, Integer> cantidad;

}