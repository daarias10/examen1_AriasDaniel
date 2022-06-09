package ec.edu.espe.arquitectura.examen.model;

import ec.edu.espe.arquitectura.examen.model.Contenido;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-06-08T20:39:17")
@StaticMetamodel(ContenidoVersion.class)
public class ContenidoVersion_ { 

    public static volatile SingularAttribute<ContenidoVersion, String> nombreArchivo;
    public static volatile SingularAttribute<ContenidoVersion, Contenido> contenido;
    public static volatile SingularAttribute<ContenidoVersion, Integer> tamanio;
    public static volatile SingularAttribute<ContenidoVersion, Integer> codContenidoVersion;
    public static volatile SingularAttribute<ContenidoVersion, String> codUsuarioCreacion;
    public static volatile SingularAttribute<ContenidoVersion, String> hashArchivo;
    public static volatile SingularAttribute<ContenidoVersion, Date> fechaCreacion;
    public static volatile SingularAttribute<ContenidoVersion, Integer> codContenido;
    public static volatile SingularAttribute<ContenidoVersion, String> comentario;
    public static volatile SingularAttribute<ContenidoVersion, Integer> version;

}