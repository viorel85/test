
package com.iucosoft.maven.service;

import com.iucosoft.maven.model.Rezervari;

/**
 *
 * @author Viorel
 */
public interface ReservationServiceIntf {
    
    void save(Rezervari u);
    void update(Rezervari u);
    void delete(Rezervari u);
}
