package ec.edu.espe.arquitectura.examen.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "seg_usuario")
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1324321L;
    @Id
    @Column(name = "cod_usuario", nullable = false)
    private Integer codUsuario;
    @Column(name = "username", nullable = false, length = 32)
    private String username;
    @Column(name = "nombre", nullable = false, length = 128)
    private String nombre;
    @Column(name = "clave", nullable = false, length = 64)
    private String clave;
    @Column(name = "estado", nullable = false, length = 3)
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<UsuarioEspacio> usuarioEspacios;
    
    public Usuario() {
    }
    public Usuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }
    public Integer getCodUsuario() {
        return codUsuario;
    }
    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public List<UsuarioEspacio> getUsuarioEspacios() {
        return usuarioEspacios;
    }
    public void setUsuarioEspacios(List<UsuarioEspacio> usuarioEspacios) {
        this.usuarioEspacios = usuarioEspacios;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((clave == null) ? 0 : clave.hashCode());
        result = prime * result + ((codUsuario == null) ? 0 : codUsuario.hashCode());
        result = prime * result + ((estado == null) ? 0 : estado.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((username == null) ? 0 : username.hashCode());
        result = prime * result + ((usuarioEspacios == null) ? 0 : usuarioEspacios.hashCode());
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
        Usuario other = (Usuario) obj;
        if (clave == null) {
            if (other.clave != null)
                return false;
        } else if (!clave.equals(other.clave))
            return false;
        if (codUsuario == null) {
            if (other.codUsuario != null)
                return false;
        } else if (!codUsuario.equals(other.codUsuario))
            return false;
        if (estado == null) {
            if (other.estado != null)
                return false;
        } else if (!estado.equals(other.estado))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        if (usuarioEspacios == null) {
            if (other.usuarioEspacios != null)
                return false;
        } else if (!usuarioEspacios.equals(other.usuarioEspacios))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Usuario [codUsuario=" + codUsuario + "]";
    }
    
}
