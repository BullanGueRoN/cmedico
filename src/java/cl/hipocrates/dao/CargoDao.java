package cl.hipocrates.dao;

import cl.hipocrates.modelo.Cargos;
import cl.hipocrates.util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author BULLANGERON
 */
public class CargoDao implements InterfaceCargo {

    @Override
    public Cargos getCargo(int id) {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        return (Cargos) ss.load(Cargos.class, id);
    }

    @Override
    public void guardar(Cargos cargo) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction t = ss.beginTransaction();
            ss.save(cargo);
            t.commit();
        } catch (Exception e) {            
            //JOptionPane.showMessageDialog(null,"ERROR AL GUARDAR: " + e.getMessage());
            System.exit(0);
        }
    }

    @Override
    public void actualizar(Cargos cargo) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction t = ss.beginTransaction();
            ss.update(cargo);
            t.commit();
        } catch (Exception e) {
            System.out.println("ERROR AL ACTUALIZAR: " + e.getMessage());
        }
    }

    @Override
    public void eliminar(Cargos cargo) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction t = ss.beginTransaction();
            ss.delete(cargo);
            t.commit();
        } catch (Exception e) {
            System.out.println("ERROR AL ELIMINAR: " + e.getMessage());
        }
    }

    @Override
    public List<Cargos> listar() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction t = ss.beginTransaction();
            List listaCargos = ss.createQuery("from Cargos").list();
            t.commit();
            return listaCargos;
        } catch (Exception e) {
            System.out.println("ERROR AL LISTAR: " + e.getMessage());
            
            return null;
        }
    }

}
