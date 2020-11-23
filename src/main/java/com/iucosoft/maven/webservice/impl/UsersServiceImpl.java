
package com.iucosoft.maven.webservice.impl;

import com.iucosoft.maven.dao.UsersDaoIntf;
import com.iucosoft.maven.model.Users;
import com.iucosoft.maven.webservice.UsersServiceIntf;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Viorel
 */
@Service
public class UsersServiceImpl implements UsersServiceIntf{

    @Autowired
    UsersDaoIntf usersDao;
    
    @Override
    public void save(Users u) {
        usersDao.save(u);
    }

    @Override
    public void update(Users u) {
        usersDao.update(u);
    }

    @Override
    public void delete(Users u) {
        usersDao.delete(u);
    }

    @Override
    public Users getById(int id) {
        return usersDao.getById(id);
    }

    @Override
    public List<Users> getAll() {
        return usersDao.getAll();
    }
    
}
