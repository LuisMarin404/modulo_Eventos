package com.entidades;

import com.entidades.Cootizacion;
import com.entidades.DetalleMenu;
import com.entidades.DetalleProducto;
import com.entidades.DetalleServicio;
import com.entidades.Lugar;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-09-14T09:56:40")
@StaticMetamodel(Eventos.class)
public class Eventos_ { 

    public static volatile SingularAttribute<Eventos, Integer> idEventos;
    public static volatile SingularAttribute<Eventos, String> descripcion;
    public static volatile CollectionAttribute<Eventos, Cootizacion> cootizacionCollection;
    public static volatile CollectionAttribute<Eventos, DetalleProducto> detalleProductoCollection;
    public static volatile CollectionAttribute<Eventos, DetalleMenu> detalleMenuCollection;
    public static volatile SingularAttribute<Eventos, String> tipoEventos;
    public static volatile SingularAttribute<Eventos, Lugar> lugarid;
    public static volatile CollectionAttribute<Eventos, DetalleServicio> detalleServicioCollection;

}