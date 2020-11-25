
package com.iucosoft.maven.dao.impl;

import com.iucosoft.maven.dao.ReservationDaoIntf;
import com.iucosoft.maven.model.Rezervari;
import com.iucosoft.maven.utils.ArraysConvert;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Viorel
 */
@Repository
public class ReservationDaoImpl implements ReservationDaoIntf{

    JdbcTemplate jdbcTemplate;
    
    @Autowired
    @Override
    public void setDataSource(DataSource ds) {
        jdbcTemplate = new JdbcTemplate(ds);
    }
    
    @Override
    public void save(Rezervari r) {
        String sql = "INSERT INTO rezervari VALUES(null, ?, ?, ?, ?, ?, ?)";
        
        jdbcTemplate.update(sql, new Object[]{
           r.getNume(), r.getPrenume(),r.getOrasul(), 
            ArraysConvert.toString(r.getLimbajul()),
//            Arrays.toString(r.getLimbajul()),
            r.getLocalitatea(), r.getGenul()
        });
    }

    @Override
    public void update(Rezervari r) {
       String sql = "UPDATE rezervari SET nume=?, premume=?, data_nasterii=? WHERE id=?";
        
        jdbcTemplate.update(sql, new Object[]{
        });
    }

    @Override
    public void delete(Rezervari r) {
        String sql = "DELETE FROM rezervari WHERE id=?";
        
        jdbcTemplate.update(sql, new Object[]{ });
    }
    
}
