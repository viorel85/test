
package com.iucosoft.maven.service.impl;

import com.iucosoft.maven.dao.ReservationDaoIntf;
import com.iucosoft.maven.model.Rezervari;
import com.iucosoft.maven.model.Users;
import com.iucosoft.maven.service.ReservationServiceIntf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Viorel
 */
@Service
public class ReservationServiceImpl implements ReservationServiceIntf{
    
    @Autowired
    ReservationDaoIntf reservationDao;

    @Override
    public void save(Rezervari u) {
        reservationDao.save(u);
    }

    @Override
    public void update(Rezervari u) {
        reservationDao.update(u);
    }

    @Override
    public void delete(Rezervari u) {
        reservationDao.delete(u);
    }

   
}
