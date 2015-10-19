package cl.hipocrates.test;

import cl.hipocrates.dao.CargoDao;
import cl.hipocrates.dao.InterfaceCargo;
import cl.hipocrates.modelo.Cargos;
//import java.math.BigDecimal;

/**
 *
 * @author BULLANGERON
 */
public class prueba {

    public static void main(String[] args) {
        Cargos cargo = new Cargos();
        InterfaceCargo dao = new CargoDao();
        cargo.setNombre("Campos booleanos");
        cargo.setEstado(true);
        cargo.setIdCargo(776);
        cargo.setModAgenda(true);
        cargo.setModAtencion(false);
        cargo.setModExamenes(false);
        cargo.setModHonorarios(false);
        cargo.setModRecepcion(false);
        cargo.setModRegistro(false);
        cargo.setMtnCajas(false);
        cargo.setMtnCargos(false);
        cargo.setMtnEspecialidades(false);
        cargo.setMtnInsumos(false);
        cargo.setMtnPacientes(false);
        cargo.setMtnPersonal(false);
        cargo.setMtnUsuarios(false);
        dao.guardar(cargo);
        //dao.actualizar(cargo);
        //dao.eliminar(cargo);
        //cargo = dao.getCargo(0);
        //dao.listar().stream().forEach((c) -> {
        //  System.out.println(c.toString());
        //});
        //System.out.println(cargo.toString());
        System.exit(0);
    }
}
