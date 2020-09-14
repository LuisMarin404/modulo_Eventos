package com.entidades;

import com.entidades.DetalleServicio;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-09-14T09:56:40")
@StaticMetamodel(Servicios.class)
public class Servicios_ { 

    public static volatile SingularAttribute<Servicios, String> descripcion;
    public static volatile SingularAttribute<Servicios, String> programaFormacion;
    public static volatile SingularAttribute<Servicios, Integer> ficha;
    public static volatile CollectionAttribute<Servicios, DetalleServicio> detalleServicioCollection;
    public static volatile SingularAttribute<Servicios, String> nombre;
    public static volatile SingularAttribute<Servicios, Integer> idServicios;

}