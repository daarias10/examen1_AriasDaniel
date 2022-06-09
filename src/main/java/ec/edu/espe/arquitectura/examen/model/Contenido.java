package ec.edu.espe.arquitectura.examen.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "gdc_contenido")
public class Contenido implements Serializable{
    private static final long serialVersionUID = 12345L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_contenido", nullable = false)
    private Integer codContenido;
    @Column(name = "cod_espacio", nullable = false)
    private Integer codEspacio;
    @Column(name = "cod_contenido_padre", nullable = false)
    private Integer codContenidoPadre;
    @Column(name = "cod_nivel", nullable = false)
    private Integer nivel;
    @Column(name = "tipo_contenido", nullable = false)
    private Integer tipoContenido;
    @Column(name = "nombre", nullable = false, length = 256)
    private String nombre;
    @Column(name = "nombre_archivo", nullable = false, length = 256)
    private String nombreArchivo;
    @Column(name = "version", nullable = false)
    @Version
    private Integer version;
    @Column(name = "estado", nullable = false, length = 3)
    private String estado;
    @JoinColumn(name = "seg_espacio", referencedColumnName = "cod_espacio", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Espacio espacio;
    @OneToMany(mappedBy = "codContenidoPadre")
    private List<Contenido> contenidos;
    @JoinColumn(name = "cod_contenido_padre", referencedColumnName = "cod_contenido", nullable = false, insertable = false, updatable = false)
    @ManyToOne
    private Contenido contenidoPadre;
    
    public Contenido(Integer codContenido) {
        this.codContenido = codContenido;
    }

    public Contenido() {
    }

    public Integer getCodContenido() {
        return codContenido;
    }

    public void setCodContenido(Integer codContenido) {
        this.codContenido = codContenido;
    }

    public Integer getCodEspacio() {
        return codEspacio;
    }

    public void setCodEspacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }

    public Integer getCodContenidoPadre() {
        return codContenidoPadre;
    }

    public void setCodContenidoPadre(Integer codContenidoPadre) {
        this.codContenidoPadre = codContenidoPadre;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getTipoContenido() {
        return tipoContenido;
    }

    public void setTipoContenido(Integer tipoContenido) {
        this.tipoContenido = tipoContenido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Espacio getEspacio() {
        return espacio;
    }

    public void setEspacio(Espacio espacio) {
        this.espacio = espacio;
    }

    public List<Contenido> getContenidos() {
        return contenidos;
    }

    public void setContenidos(List<Contenido> contenidos) {
        this.contenidos = contenidos;
    }

    public Contenido getContenidoPadre() {
        return contenidoPadre;
    }

    public void setContenidoPadre(Contenido contenidoPadre) {
        this.contenidoPadre = contenidoPadre;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codContenido == null) ? 0 : codContenido.hashCode());
        result = prime * result + ((codContenidoPadre == null) ? 0 : codContenidoPadre.hashCode());
        result = prime * result + ((codEspacio == null) ? 0 : codEspacio.hashCode());
        result = prime * result + ((contenidoPadre == null) ? 0 : contenidoPadre.hashCode());
        result = prime * result + ((contenidos == null) ? 0 : contenidos.hashCode());
        result = prime * result + ((espacio == null) ? 0 : espacio.hashCode());
        result = prime * result + ((estado == null) ? 0 : estado.hashCode());
        result = prime * result + ((nivel == null) ? 0 : nivel.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((nombreArchivo == null) ? 0 : nombreArchivo.hashCode());
        result = prime * result + ((tipoContenido == null) ? 0 : tipoContenido.hashCode());
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
        Contenido other = (Contenido) obj;
        if (codContenido == null) {
            if (other.codContenido != null)
                return false;
        } else if (!codContenido.equals(other.codContenido))
            return false;
        if (codContenidoPadre == null) {
            if (other.codContenidoPadre != null)
                return false;
        } else if (!codContenidoPadre.equals(other.codContenidoPadre))
            return false;
        if (codEspacio == null) {
            if (other.codEspacio != null)
                return false;
        } else if (!codEspacio.equals(other.codEspacio))
            return false;
        if (contenidoPadre == null) {
            if (other.contenidoPadre != null)
                return false;
        } else if (!contenidoPadre.equals(other.contenidoPadre))
            return false;
        if (contenidos == null) {
            if (other.contenidos != null)
                return false;
        } else if (!contenidos.equals(other.contenidos))
            return false;
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
        if (nivel == null) {
            if (other.nivel != null)
                return false;
        } else if (!nivel.equals(other.nivel))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (nombreArchivo == null) {
            if (other.nombreArchivo != null)
                return false;
        } else if (!nombreArchivo.equals(other.nombreArchivo))
            return false;
        if (tipoContenido == null) {
            if (other.tipoContenido != null)
                return false;
        } else if (!tipoContenido.equals(other.tipoContenido))
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
        return "Contenido [codContenido=" + codContenido + "]";
    }    
}
