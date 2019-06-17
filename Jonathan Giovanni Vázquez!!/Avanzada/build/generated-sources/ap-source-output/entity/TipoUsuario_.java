package entity;

import entity.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-16T14:42:06")
@StaticMetamodel(TipoUsuario.class)
public class TipoUsuario_ { 

    public static volatile CollectionAttribute<TipoUsuario, Usuarios> usuariosCollection;
    public static volatile SingularAttribute<TipoUsuario, Integer> idTipo;
    public static volatile SingularAttribute<TipoUsuario, String> tipoUsu;

}