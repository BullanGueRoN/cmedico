package cl.hipocrates.controlador;

import cl.hipocrates.dao.CargoDao;
import cl.hipocrates.dao.InterfaceCargo;
import cl.hipocrates.modelo.Cargos;
import java.awt.event.ActionEvent;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import org.primefaces.event.ToggleEvent;
import org.primefaces.model.Visibility;

/**
 *
 * @author BULLANGERON
 */
@ManagedBean(name = "cargoControlador")
@SessionScoped
public class CargoControlador {

    private Cargos cargo;
    private DataModel listaCargos;
    private String mensaje;
    private String titulo;
    private Severity grado;

    //Podré eliminar esta intanciacion con etiquetas?
    //Las mejoras eliminaran la dependencia entre clases y obtener los beneficios de ello
    //debemos conseguir está mejora para la tercera iteracion
    private final InterfaceCargo dao = new CargoDao();

    public Cargos getCargo() {
        if (this.cargo == null) {
            this.cargo = new Cargos();
        }
        return cargo;
    }

    public void setCargo(Cargos cargo) {
        this.cargo = cargo;
    }

    public DataModel getListaCargos() {
        return new ListDataModel(new CargoDao().listar());
    }

    public void setListaCargos(DataModel listaCargos) {
        this.listaCargos = listaCargos;
    }

    public void prepararGuardarCargo(ActionEvent evt) {
        cargo = new Cargos();
    }

    public void prepararInterfaceCargo(ActionEvent evt) {

    }

    /* No entiendo, ¿porque parece que va a buscar una lista de cargos
     cuando se supone que debo modificar solo uno, eso implica que debo identificarlo?
     Quizas... se debe a que busca y crea una lista con un solo objeto, que es aquel que 
     devuelve. Esto se define más a adelante al parecer. 
    
     Cada metodo de contarte una historia, solo luego de haberla contado por completo,
     pasa a la siguiente. La otra forma sería hacerlos por capitulos diferentes.
     */
    public void prepararModificarCargos(ActionEvent evt) {
        cargo = (Cargos) (listaCargos.getRowData());
    }

    //Aplicación de polimorfismo -> buscar beneficios de hacer esto
    public void guardar(ActionEvent evt) {
        dao.guardar(cargo);
        System.out.println(cargo.toString());
    }

    public void modificar(ActionEvent evt) {
        dao.actualizar(cargo);
    }

    public String eliminar(ActionEvent evt) {
        cargo = (Cargos) (listaCargos.getRowData());
        dao.actualizar(cargo);
        return "index";
    }

    public void mostrarOcultarDetalles(ToggleEvent event) {
        grado = FacesMessage.SEVERITY_INFO;
        titulo = "Objetivo de la Tarea";
        mensaje = "Debe dar nombre al nuevo cargo. \n Luego tendrá que seleccionar los módulos que le permitirá acceder.";
        FacesMessage msg = new FacesMessage(grado, titulo, mensaje);
        if (event.getVisibility() == Visibility.VISIBLE) {
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }        
    }

    public void mostrarOcultarAdministrativos(ToggleEvent event) {
        if (event.getVisibility() == Visibility.HIDDEN) {
            grado = FacesMessage.SEVERITY_WARN;
            titulo = "¡Importante!";
            mensaje = "Si no cambia los permisos, por defecto no serán autorizados";
        } else {
            grado = FacesMessage.SEVERITY_INFO;
            titulo = "Objetivo de la Operación:";
            mensaje = "Asignar permisos de acceso a los Mantenedores que proveen información de administración.";

        }
        FacesMessage msg = new FacesMessage(grado, titulo, mensaje);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public void mostrarOcultarOperaciones(ToggleEvent event) {
        if (event.getVisibility() == Visibility.HIDDEN) {
            grado = FacesMessage.SEVERITY_WARN;
            titulo = "¡Importante!";
            mensaje = "Si no cambia los permisos, por defecto no serán autorizados";
        } else {
            grado = FacesMessage.SEVERITY_INFO;
            titulo = "Objetivo de la Operación:";
            mensaje = "Asignar permisos de acceso a los Módulos que permiten proveer servicios.";

        }
        FacesMessage msg = new FacesMessage(grado, titulo, mensaje);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

}
