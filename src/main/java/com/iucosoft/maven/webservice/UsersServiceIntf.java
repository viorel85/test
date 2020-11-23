
package com.iucosoft.maven.webservice;

import com.iucosoft.maven.model.Users;
import java.util.List;

/**
 *
 * @author Viorel
 */
public interface UsersServiceIntf {
    
    void save(Users u);
    void update(Users u);
    void delete(Users u);
    Users getById(int id);
    List<Users> getAll();
    
}
