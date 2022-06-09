package ec.edu.espe.arquitectura.examen.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "gdc_espacio")
public class Espacio implements Serializable {
    private static final long serialVersionUID = 1324321L;
    @Id
    @Column(name = "cod_espacio", nullable = false)
    private Integer codEspacio;
    @Column(name = "nombre", nullable = false, length = 128)
    private String nombre;
    @Column(name = "fecha_creacion", nullable = false, length = 64)
    private Date fechaCreacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "espacio")
    private List<UsuarioEspacio> usuarioEspacios;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codModulo")
    private List<Contenido> contenidos;

    public Espacio() {
    }

    public Espacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Integer getCodEspacio() {
        return codEspacio;
    }

    public void setCodEspacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public List<UsuarioEspacio> getUsuarioEspacios() {
        return usuarioEspacios;
    }

    public void setUsuarioEspacios(List<UsuarioEspacio> usuarioEspacios) {
        this.usuarioEspacios = usuarioEspacios;
    }

    public List<Contenido> getContenidos() {
        return contenidos;
    }

    public void setContenidos(List<Contenido> contenidos) {
        this.contenidos = contenidos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codEspacio == null) ? 0 : codEspacio.hashCode());
        result = prime * result + ((fechaCreacion == null) ? 0 : fechaCreacion.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
        Espacio other = (Espacio) obj;
        if (codEspacio == null) {
            if (other.codEspacio != null)
                return false;
        } else if (!codEspacio.equals(other.codEspacio))
            return false;
        if (fechaCreacion == null) {
            if (other.fechaCreacion != null)
                return false;
        } else if (!fechaCreacion.equals(other.fechaCreacion))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
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
        return "Espacio [codEspacio=" + codEspacio + "]";
    }
}
