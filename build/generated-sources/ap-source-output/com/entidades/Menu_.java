package com.entidades;

import com.entidades.DetalleMenu;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-09-14T09:56:40")
@StaticMetamodel(Menu.class)
public class Menu_ { 

    public static volatile SingularAttribute<Menu, String> descripcion;
    public static volatile SingularAttribute<Menu, Double> precio;
    public static volatile CollectionAttribute<Menu, DetalleMenu> detalleMenuCollection;
    public static volatile SingularAttribute<Menu, Integer> idMenu;
    public static volatile SingularAttribute<Menu, String> nombre;

}