/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.hipocrates.dao;

import cl.hipocrates.modelo.Cargos;
import java.util.List;

/**
 *
 * @author BULLANGERON
 */
public interface InterfaceCargo {
    
    public Cargos getCargo(int id);
    public void guardar(Cargos cargo);
    public void actualizar(Cargos cargo);
    public void eliminar(Cargos cargo);
    public List<Cargos> listar();
    
}
