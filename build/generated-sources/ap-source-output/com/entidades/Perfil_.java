package com.entidades;

import com.entidades.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-09-14T09:56:40")
@StaticMetamodel(Perfil.class)
public class Perfil_ { 

    public static volatile SingularAttribute<Perfil, String> perfilUsuario;
    public static volatile SingularAttribute<Perfil, Integer> idPerfil;
    public static volatile CollectionAttribute<Perfil, Usuario> usuarioCollection;

}