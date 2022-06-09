package ec.edu.espe.arquitectura.examen.model;

import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class UsuarioEspacioPK implements Serializable {
    @Column(name = "cod_usuario", nullable = false)
    private Integer codUsuario;
    @Column(name = "cod_espacio", nullable = false)
    private Integer codEspacio;
   
    public UsuarioEspacioPK() {
    }

    public UsuarioEspacioPK(Integer codUsuario, Integer codEspacio) {
        this.codUsuario = codUsuario;
        this.codEspacio = codEspacio;
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Integer getCodEspacio() {
        return codEspacio;
    }

    public void setCodEspacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codEspacio == null) ? 0 : codEspacio.hashCode());
        result = prime * result + ((codUsuario == null) ? 0 : codUsuario.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UsuarioEspacioPK other = (UsuarioEspacioPK) obj;
        if (codEspacio == null) {
            if (other.codEspacio != null)
                return false;
        } else if (!codEspacio.equals(other.codEspacio))
            return false;
        if (codUsuario == null) {
            if (other.codUsuario != null)
                return false;
        } else if (!codUsuario.equals(other.codUsuario))
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "UsuarioEspacioPK [codEspacio=" + codEspacio + ", codUsuario=" + codUsuario + "]";
    }    
}
