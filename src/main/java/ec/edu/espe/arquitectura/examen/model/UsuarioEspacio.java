package ec.edu.espe.arquitectura.examen.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "seg_usuario_espacio")
public class UsuarioEspacio implements Serializable {
    private static final long serialVersionUID = 14343L;
    @EmbeddedId
    private UsuarioEspacioPK pk;
    @Column(name = "estado", nullable = false, length = 3)
    private String estado;
    @JoinColumn(name = "seg_usuario", referencedColumnName = "cod_usuario", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;
    @JoinColumn(name = "seg_espacio", referencedColumnName = "cod_espacio", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Espacio espacio;

    
    public UsuarioEspacio() {
    }
    
    public UsuarioEspacio(UsuarioEspacioPK pk) {
        this.pk = pk;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public UsuarioEspacioPK getPk() {
        return pk;
    }
    public void setPk(UsuarioEspacioPK pk) {
        this.pk = pk;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Espacio getEspacio() {
        return espacio;
    }
    public void setEspacio(Espacio espacio) {
        this.espacio = espacio;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((espacio == null) ? 0 : espacio.hashCode());
        result = prime * result + ((estado == null) ? 0 : estado.hashCode());
        result = prime * result + ((pk == null) ? 0 : pk.hashCode());
        result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
        UsuarioEspacio other = (UsuarioEspacio) obj;
        if (espacio == null) {
            if (other.espacio != null)
                return false;
        } else if (!espacio.equals(other.espacio))
            return false;
        if (estado == null) {
            if (other.estado != null)
                return false;
        } else if (!estado.equals(other.estado))
            return false;
        if (pk == null) {
            if (other.pk != null)
                return false;
        } else if (!pk.equals(other.pk))
            return false;
        if (usuario == null) {
            if (other.usuario != null)
                return false;
        } else if (!usuario.equals(other.usuario))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "UsuarioEspacio [pk=" + pk + "]";
    }
    
}
