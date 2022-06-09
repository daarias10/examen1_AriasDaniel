package ec.edu.espe.arquitectura.examen.model;

import ec.edu.espe.arquitectura.examen.model.Contenido;
import ec.edu.espe.arquitectura.examen.model.Espacio;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-06-08T20:44:04")
@StaticMetamodel(Contenido.class)
public class Contenido_ { 

    public static volatile SingularAttribute<Contenido, Espacio> espacio;
    public static volatile SingularAttribute<Contenido, String> nombreArchivo;
    public static volatile SingularAttribute<Contenido, String> estado;
    public static volatile SingularAttribute<Contenido, Integer> codContenidoPadre;
    public static volatile ListAttribute<Contenido, Contenido> contenidos;
    public static volatile SingularAttribute<Contenido, Integer> tipoContenido;
    public static volatile SingularAttribute<Contenido, Contenido> contenidoPadre;
    public static volatile SingularAttribute<Contenido, Integer> codEspacio;
    public static volatile SingularAttribute<Contenido, Integer> codContenido;
    public static volatile SingularAttribute<Contenido, String> nombre;
    public static volatile SingularAttribute<Contenido, Integer> version;
    public static volatile SingularAttribute<Contenido, Integer> nivel;

}