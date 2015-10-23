/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Pojos.Docente;
import Pojos.Oferta;
import java.util.List;

/**
 *
 * @author Cilop002
 */
public interface InterfaceDAODocente {
    public boolean insert(Oferta ofer) throws Exception;
    public List<Oferta> mostrar() throws Exception;
    public Oferta buscar(String cod) throws Exception;
    public boolean delete(Oferta ofer) throws Exception;
}
