package cl.hipocrates.modelo;

//import java.math.BigDecimal;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.annotations.Type;

/**
 *
 * @author BULLANGERON
 */

@Entity
@Table(name = "CARGOS")
public class Cargos implements Serializable {    
    @GeneratedValue(generator="CARGO_ID_SEQ")
    @Id
    @Basic(optional = false)
    @NotNull
    @SequenceGenerator(name = "CARGO_ID_SEQ", sequenceName = "CARGO_ID_SEQ", allocationSize = 1)
    @Column(name = "ID_CARGO")
    private int idCargo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE")
    private String nombre;    
    @Basic(optional = false)
    @NotNull
    @Column(name = "MTN_CAJAS", length=1) 
    @Type(type="true_false")
    private boolean mtnCajas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MTN_PERSONAL", length=1)
    @Type(type="true_false")
    private boolean mtnPersonal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MTN_CARGOS", length=1)
    @Type(type="true_false")
    private boolean mtnCargos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MTN_ESPECIALIDADES", length=1)
    @Type(type="true_false")
    private boolean mtnEspecialidades;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MTN_USUARIOS", length=1)
    @Type(type="true_false")
    private boolean mtnUsuarios;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MTN_INSUMOS", length=1)
    @Type(type="true_false")
    private boolean mtnInsumos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MTN_PACIENTES", length=1)
    @Type(type="true_false")
    private boolean mtnPacientes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MOD_ATENCION", length=1)
    @Type(type="true_false")
    private boolean modAtencion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MOD_EXAMENES", length=1)
    @Type(type="true_false")
    private boolean modExamenes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MOD_AGENDA", length=1)
    @Type(type="true_false")
    private boolean modAgenda;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MOD_HONORARIOS", length=1)
    @Type(type="true_false")
    private boolean modHonorarios;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MOD_REGISTRO", length=1)
    @Type(type="true_false")
    private boolean modRegistro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MOD_RECEPCION", length=1)
    @Type(type="true_false")
    private boolean modRecepcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESTADO", length=1)
    @Type(type="true_false")
    private boolean estado;

    public Cargos() {
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMtnCajas() {
        return mtnCajas;
    }

    public void setMtnCajas(boolean mtnCajas) {
        this.mtnCajas = mtnCajas;
    }

    public boolean isMtnPersonal() {
        return mtnPersonal;
    }

    public void setMtnPersonal(boolean mtnPersonal) {
        this.mtnPersonal = mtnPersonal;
    }

    public boolean isMtnCargos() {
        return mtnCargos;
    }

    public void setMtnCargos(boolean mtnCargos) {
        this.mtnCargos = mtnCargos;
    }

    public boolean isMtnEspecialidades() {
        return mtnEspecialidades;
    }

    public void setMtnEspecialidades(boolean mtnEspecialidades) {
        this.mtnEspecialidades = mtnEspecialidades;
    }

    public boolean isMtnUsuarios() {
        return mtnUsuarios;
    }

    public void setMtnUsuarios(boolean mtnUsuarios) {
        this.mtnUsuarios = mtnUsuarios;
    }

    public boolean isMtnInsumos() {
        return mtnInsumos;
    }

    public void setMtnInsumos(boolean mtnInsumos) {
        this.mtnInsumos = mtnInsumos;
    }

    public boolean isMtnPacientes() {
        return mtnPacientes;
    }

    public void setMtnPacientes(boolean mtnPacientes) {
        this.mtnPacientes = mtnPacientes;
    }

    public boolean isModAtencion() {
        return modAtencion;
    }

    public void setModAtencion(boolean modAtencion) {
        this.modAtencion = modAtencion;
    }

    public boolean isModExamenes() {
        return modExamenes;
    }

    public void setModExamenes(boolean modExamenes) {
        this.modExamenes = modExamenes;
    }

    public boolean isModAgenda() {
        return modAgenda;
    }

    public void setModAgenda(boolean modAgenda) {
        this.modAgenda = modAgenda;
    }

    public boolean isModHonorarios() {
        return modHonorarios;
    }

    public void setModHonorarios(boolean modHonorarios) {
        this.modHonorarios = modHonorarios;
    }

    public boolean isModRegistro() {
        return modRegistro;
    }

    public void setModRegistro(boolean modRegistro) {
        this.modRegistro = modRegistro;
    }

    public boolean isModRecepcion() {
        return modRecepcion;
    }

    public void setModRecepcion(boolean modRecepcion) {
        this.modRecepcion = modRecepcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
       
    @Override
    public String toString() {
        return "Cargos{" + "idCargo=" + idCargo + ", nombre=" + nombre + ", mtnCajas=" + mtnCajas + ", mtnPersonal=" + mtnPersonal + ", mtnCargos=" + mtnCargos + ", mtnEspecialidades=" + mtnEspecialidades + ", mtnUsuarios=" + mtnUsuarios + ", mtnInsumos=" + mtnInsumos + ", mtnPacientes=" + mtnPacientes + ", modAtencion=" + modAtencion + ", modExamenes=" + modExamenes + ", modAgenda=" + modAgenda + ", modHonorarios=" + modHonorarios + ", modRegistro=" + modRegistro + ", modRecepcion=" + modRecepcion + ", estado=" + estado + '}';
    }   

}
