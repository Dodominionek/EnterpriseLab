/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package req.facade;

import java.util.List;
import javax.ejb.Local;
import req.entities.Request;

/**
 *
 * @author dt532
 */
@Local
public interface RequestFacadeLocal {

    void create(Request reqyest);

    void edit(Request reqyest);

    void remove(Request reqyest);

    Request find(Object id);

    List<Request> findAll();

    List<Request> findRange(int[] range);

    int count();
    
}
