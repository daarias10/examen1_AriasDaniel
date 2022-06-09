package ec.edu.espe.arquitectura.examen.model;

import ec.edu.espe.arquitectura.examen.model.Espacio;
import ec.edu.espe.arquitectura.examen.model.Usuario;
import ec.edu.espe.arquitectura.examen.model.UsuarioEspacioPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-06-08T20:26:04")
@StaticMetamodel(UsuarioEspacio.class)
public class UsuarioEspacio_ { 

    public static volatile SingularAttribute<UsuarioEspacio, Espacio> espacio;
    public static volatile SingularAttribute<UsuarioEspacio, String> estado;
    public static volatile SingularAttribute<UsuarioEspacio, Usuario> usuario;
    public static volatile SingularAttribute<UsuarioEspacio, UsuarioEspacioPK> pk;

}