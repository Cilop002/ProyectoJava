
package Dao;

import HibernateUtil.HibernateUtil;
import Interfaces.InterfaceDAODocente;
import Pojos.Docente;
import Pojos.Oferta;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Cilop002
 */
public class DaoDocente implements InterfaceDAODocente{
    private Session se;
    
    @Override
    public boolean insert(Oferta ofer) throws Exception {
        se=HibernateUtil.getSessionFactory().openSession();
        Transaction tx =  se.beginTransaction();
        se.save(ofer);
        tx.commit();
        se.close();
        return true;
    }

    @Override
    public List<Oferta> mostrar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Oferta buscar(String cod) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Oferta ofer) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
