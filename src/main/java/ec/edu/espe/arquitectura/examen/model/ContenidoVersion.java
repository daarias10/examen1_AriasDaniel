package ec.edu.espe.arquitectura.examen.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "gdc_contenido_version")
public class ContenidoVersion implements Serializable {
    private static final long serialVersionUID = 12345L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_contenido_version", nullable = false)
    private Integer codContenidoVersion;
    @Column(name = "cod_contenido", nullable = false)
    private Integer codContenido;
    @Column(name = "hash_archivo", nullable = false, length = 64)
    private String hashArchivo;
    @Column(name = "nombre_archivo", nullable = false, length = 256)
    private String nombreArchivo;
    @Column(name = "tamanio", nullable = false)
    private Integer tamanio;
    @Column(name = "version", nullable = false)
    @Version
    private Integer version;
    @Column(name = "comentario", nullable = false, length = 500)
    private String comentario;
    @Column(name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;
    @Column(name = "cod_usuario_creacion", nullable = false)
    private String codUsuarioCreacion;
    @JoinColumn(name = "gdc_contenido", referencedColumnName = "cod_contenido", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Contenido contenido;
    
    public ContenidoVersion(Integer codContenidoVersion) {
        this.codContenidoVersion = codContenidoVersion;
    }

    public ContenidoVersion() {
    }

    public Integer getCodContenidoVersion() {
        return codContenidoVersion;
    }

    public void setCodContenidoVersion(Integer codContenidoVersion) {
        this.codContenidoVersion = codContenidoVersion;
    }

    public Integer getCodContenido() {
        return codContenido;
    }

    public void setCodContenido(Integer codContenido) {
        this.codContenido = codContenido;
    }

    public String getHashArchivo() {
        return hashArchivo;
    }

    public void setHashArchivo(String hashArchivo) {
        this.hashArchivo = hashArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getCodUsuarioCreacion() {
        return codUsuarioCreacion;
    }

    public void setCodUsuarioCreacion(String codUsuarioCreacion) {
        this.codUsuarioCreacion = codUsuarioCreacion;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codContenido == null) ? 0 : codContenido.hashCode());
        result = prime * result + ((codContenidoVersion == null) ? 0 : codContenidoVersion.hashCode());
        result = prime * result + ((codUsuarioCreacion == null) ? 0 : codUsuarioCreacion.hashCode());
        result = prime * result + ((comentario == null) ? 0 : comentario.hashCode());
        result = prime * result + ((contenido == null) ? 0 : contenido.hashCode());
        result = prime * result + ((fechaCreacion == null) ? 0 : fechaCreacion.hashCode());
        result = prime * result + ((hashArchivo == null) ? 0 : hashArchivo.hashCode());
        result = prime * result + ((nombreArchivo == null) ? 0 : nombreArchivo.hashCode());
        result = prime * result + ((tamanio == null) ? 0 : tamanio.hashCode());
        result = prime * result + ((version == null) ? 0 : version.hashCode());
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
        ContenidoVersion other = (ContenidoVersion) obj;
        if (codContenido == null) {
            if (other.codContenido != null)
                return false;
        } else if (!codContenido.equals(other.codContenido))
            return false;
        if (codContenidoVersion == null) {
            if (other.codContenidoVersion != null)
                return false;
        } else if (!codContenidoVersion.equals(other.codContenidoVersion))
            return false;
        if (codUsuarioCreacion == null) {
            if (other.codUsuarioCreacion != null)
                return false;
        } else if (!codUsuarioCreacion.equals(other.codUsuarioCreacion))
            return false;
        if (comentario == null) {
            if (other.comentario != null)
                return false;
        } else if (!comentario.equals(other.comentario))
            return false;
        if (contenido == null) {
            if (other.contenido != null)
                return false;
        } else if (!contenido.equals(other.contenido))
            return false;
        if (fechaCreacion == null) {
            if (other.fechaCreacion != null)
                return false;
        } else if (!fechaCreacion.equals(other.fechaCreacion))
            return false;
        if (hashArchivo == null) {
            if (other.hashArchivo != null)
                return false;
        } else if (!hashArchivo.equals(other.hashArchivo))
            return false;
        if (nombreArchivo == null) {
            if (other.nombreArchivo != null)
                return false;
        } else if (!nombreArchivo.equals(other.nombreArchivo))
            return false;
        if (tamanio == null) {
            if (other.tamanio != null)
                return false;
        } else if (!tamanio.equals(other.tamanio))
            return false;
        if (version == null) {
            if (other.version != null)
                return false;
        } else if (!version.equals(other.version))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ContenidoVersion [codContenidoVersion=" + codContenidoVersion + "]";
    }
}
