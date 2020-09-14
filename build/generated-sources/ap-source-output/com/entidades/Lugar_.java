package com.entidades;

import com.entidades.Eventos;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-09-14T09:56:40")
@StaticMetamodel(Lugar.class)
public class Lugar_ { 

    public static volatile SingularAttribute<Lugar, Boolean> disponibilidad;
    public static volatile SingularAttribute<Lugar, String> direccion;
    public static volatile CollectionAttribute<Lugar, Eventos> eventosCollection;
    public static volatile SingularAttribute<Lugar, Integer> idLugar;
    public static volatile SingularAttribute<Lugar, String> nombre;

}