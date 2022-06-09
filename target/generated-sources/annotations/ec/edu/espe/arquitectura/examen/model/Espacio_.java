package ec.edu.espe.arquitectura.examen.model;

import ec.edu.espe.arquitectura.examen.model.Contenido;
import ec.edu.espe.arquitectura.examen.model.UsuarioEspacio;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-06-08T20:49:07")
@StaticMetamodel(Espacio.class)
public class Espacio_ { 

    public static volatile ListAttribute<Espacio, Contenido> contenidos;
    public static volatile ListAttribute<Espacio, UsuarioEspacio> usuarioEspacios;
    public static volatile SingularAttribute<Espacio, Integer> codEspacio;
    public static volatile SingularAttribute<Espacio, Date> fechaCreacion;
    public static volatile SingularAttribute<Espacio, String> nombre;

}