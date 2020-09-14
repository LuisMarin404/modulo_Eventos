package com.entidades;

import com.entidades.Eventos;
import com.entidades.Servicios;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-09-14T09:56:40")
@StaticMetamodel(DetalleServicio.class)
public class DetalleServicio_ { 

    public static volatile SingularAttribute<DetalleServicio, Integer> idDetallServ;
    public static volatile SingularAttribute<DetalleServicio, Double> precio;
    public static volatile SingularAttribute<DetalleServicio, Eventos> eventosid;
    public static volatile SingularAttribute<DetalleServicio, Servicios> servicosid;
    public static volatile SingularAttribute<DetalleServicio, Integer> cantidad;

}