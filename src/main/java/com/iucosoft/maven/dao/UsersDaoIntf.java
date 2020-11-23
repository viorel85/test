package com.iucosoft.maven.dao;

import com.iucosoft.maven.model.Users;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author Viorel
 */
public interface UsersDaoIntf {
    
    void setDataSource(DataSource ds);
    
    void save(Users u);
    void update(Users u);
    void delete(Users u);
    List<Users> getAll();
    Users getById(int id);
}
