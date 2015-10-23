package Ejb;

import Dao.DaoDocente;
import Pojos.Oferta;
import static java.lang.System.out;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Cilop002
 */
@Stateless
public class EjbDocente {
    
    private Oferta ofer;
    private List<Oferta> lista;
    private final DaoDocente dao;
    
    public EjbDocente(){
        ofer = new Oferta();
        dao = new DaoDocente();
    }
    public boolean insert(){
        try {
            dao.insert(ofer);
            return true;
        } catch (Exception e) {
            out.println(e.getMessage());
            return false;
        }
    }
    public Oferta getOfer() {
        return ofer;
    }

    public void setOfer(Oferta doc) {
        this.ofer = ofer;
    }

    public List<Oferta> getLista() {
        return lista;
    }

    public void setLista(List<Oferta> lista) {
        this.lista = lista;
    }
    
}
