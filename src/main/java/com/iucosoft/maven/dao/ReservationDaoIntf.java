package com.iucosoft.maven.dao;

import com.iucosoft.maven.model.Rezervari;
import javax.sql.DataSource;

/**
 *
 * @author Viorel
 */
public interface ReservationDaoIntf {
    
    void setDataSource(DataSource ds);
    
    void save(Rezervari r);
    void update(Rezervari r);
    void delete(Rezervari r);
}
