package entity;

import entity.Categoria;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-18T09:16:37")
@StaticMetamodel(Proyectos.class)
public class Proyectos_ { 

    public static volatile SingularAttribute<Proyectos, String> descripcion;
    public static volatile SingularAttribute<Proyectos, Integer> idProyecto;
    public static volatile SingularAttribute<Proyectos, String> desarrolladores;
    public static volatile SingularAttribute<Proyectos, String> requerimientos;
    public static volatile SingularAttribute<Proyectos, Date> fechaTermino;
    public static volatile SingularAttribute<Proyectos, String> titulo;
    public static volatile SingularAttribute<Proyectos, String> imagen;
    public static volatile SingularAttribute<Proyectos, Date> fechaInicio;
    public static volatile SingularAttribute<Proyectos, String> objetivos;
    public static volatile SingularAttribute<Proyectos, Float> avance;
    public static volatile SingularAttribute<Proyectos, Categoria> fkCategoria;
    public static volatile SingularAttribute<Proyectos, String> reporteTecnico;
    public static volatile SingularAttribute<Proyectos, String> ejecutable;
    public static volatile SingularAttribute<Proyectos, String> codigoFuente;

}