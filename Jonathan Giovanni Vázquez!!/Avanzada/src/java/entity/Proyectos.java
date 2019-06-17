/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author BLUE_LIGHT
 */
@Entity
@Table(name = "proyectos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proyectos.findAll", query = "SELECT p FROM Proyectos p")
    , @NamedQuery(name = "Proyectos.findByIdProyecto", query = "SELECT p FROM Proyectos p WHERE p.idProyecto = :idProyecto")
    , @NamedQuery(name = "Proyectos.findByTitulo", query = "SELECT p FROM Proyectos p WHERE p.titulo = :titulo")
    , @NamedQuery(name = "Proyectos.findByFechaInicio", query = "SELECT p FROM Proyectos p WHERE p.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "Proyectos.findByFechaTermino", query = "SELECT p FROM Proyectos p WHERE p.fechaTermino = :fechaTermino")
    , @NamedQuery(name = "Proyectos.findByAvance", query = "SELECT p FROM Proyectos p WHERE p.avance = :avance")})
public class Proyectos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_proyecto")
    private Integer idProyecto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "titulo")
    private String titulo;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "desarrolladores")
    private String desarrolladores;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_termino")
    @Temporal(TemporalType.DATE)
    private Date fechaTermino;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "imagen")
    private String imagen;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "objetivos")
    private String objetivos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "avance")
    private float avance;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "requerimientos")
    private String requerimientos;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "reporte_tecnico")
    private String reporteTecnico;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "codigo_fuente")
    private String codigoFuente;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "ejecutable")
    private String ejecutable;
    @JoinColumn(name = "fk_categoria", referencedColumnName = "id_categoria")
    @ManyToOne(optional = false)
    private Categoria fkCategoria;

    public Proyectos() {
    }

    public Proyectos(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public Proyectos(Integer idProyecto, String titulo, String descripcion, String desarrolladores, Date fechaInicio, Date fechaTermino, String imagen, String objetivos, float avance, String requerimientos, String reporteTecnico, String codigoFuente, String ejecutable) {
        this.idProyecto = idProyecto;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.desarrolladores = desarrolladores;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.imagen = imagen;
        this.objetivos = objetivos;
        this.avance = avance;
        this.requerimientos = requerimientos;
        this.reporteTecnico = reporteTecnico;
        this.codigoFuente = codigoFuente;
        this.ejecutable = ejecutable;
    }

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDesarrolladores() {
        return desarrolladores;
    }

    public void setDesarrolladores(String desarrolladores) {
        this.desarrolladores = desarrolladores;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public float getAvance() {
        return avance;
    }

    public void setAvance(float avance) {
        this.avance = avance;
    }

    public String getRequerimientos() {
        return requerimientos;
    }

    public void setRequerimientos(String requerimientos) {
        this.requerimientos = requerimientos;
    }

    public String getReporteTecnico() {
        return reporteTecnico;
    }

    public void setReporteTecnico(String reporteTecnico) {
        this.reporteTecnico = reporteTecnico;
    }

    public String getCodigoFuente() {
        return codigoFuente;
    }

    public void setCodigoFuente(String codigoFuente) {
        this.codigoFuente = codigoFuente;
    }

    public String getEjecutable() {
        return ejecutable;
    }

    public void setEjecutable(String ejecutable) {
        this.ejecutable = ejecutable;
    }

    public Categoria getFkCategoria() {
        return fkCategoria;
    }

    public void setFkCategoria(Categoria fkCategoria) {
        this.fkCategoria = fkCategoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProyecto != null ? idProyecto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proyectos)) {
            return false;
        }
        Proyectos other = (Proyectos) object;
        if ((this.idProyecto == null && other.idProyecto != null) || (this.idProyecto != null && !this.idProyecto.equals(other.idProyecto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Proyectos[ idProyecto=" + idProyecto + " ]";
    }
    
}
