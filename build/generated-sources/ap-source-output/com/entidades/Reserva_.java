package com.entidades;

import com.entidades.Cootizacion;
import com.entidades.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-09-14T09:56:40")
@StaticMetamodel(Reserva.class)
public class Reserva_ { 

    public static volatile SingularAttribute<Reserva, Date> fecha;
    public static volatile CollectionAttribute<Reserva, Cootizacion> cootizacionCollection;
    public static volatile SingularAttribute<Reserva, Usuario> clienteid;
    public static volatile SingularAttribute<Reserva, Integer> fechaLimite;
    public static volatile SingularAttribute<Reserva, Integer> idReserva;
    public static volatile SingularAttribute<Reserva, Usuario> recepcionid;

}