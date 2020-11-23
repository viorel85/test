package com.iucosoft.maven.dao.impl;

import com.iucosoft.maven.dao.UsersDaoIntf;
import com.iucosoft.maven.model.Users;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Viorel
 */
@Repository
public class UsersDaoImpl implements UsersDaoIntf{

    private static final Logger LOG = Logger.getLogger(UsersDaoImpl.class.getName());
 
    JdbcTemplate jdbcTemplate;
    
    @Autowired
    @Override
    public void setDataSource(DataSource ds) {
        jdbcTemplate = new JdbcTemplate(ds);
    }
    

    @Override
    public void save(Users u) {
        String sql = "INSERT INTO users VALUES(null, ?, ?, ?)";
        
        jdbcTemplate.update(sql, new Object[]{
           u.getNume(), u.getPrenume(), Date.valueOf(u.getDataNasterii().toString())
        });
    }

    @Override
    public void update(Users u) {
        String sql = "UPDATE users SET nume=?, premume=?, data_nasterii=? WHERE id=?";
        
        jdbcTemplate.update(sql, new Object[]{
            u.getNume(), u.getPrenume(), Date.valueOf(u.getDataNasterii().toString()), u.getId()
        });
    }

    @Override
    public void delete(Users u) {
        String sql = "DELETE FROM users WHERE id=?";
        
        jdbcTemplate.update(sql, new Object[]{ u.getId()});
    }
    
     @Override
    public List<Users> getAll() {
        String sql = "SELECT * FROM users";
        
        return jdbcTemplate.query(sql, new RowMapper<Users>(){
            @Override
            public Users mapRow(ResultSet rs, int i) throws SQLException {
                return new Users(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
            Date.valueOf(rs.getDate(4).toLocalDate())
                );
            }
        });
    }

    @Override
    public Users getById(int id) {
        String sql = "SELECT * FROM users WHERE id="+id;
        
        return jdbcTemplate.queryForObject(sql, new RowMapper<Users>(){
            @Override
            public Users mapRow(ResultSet rs, int i) throws SQLException {
                return new Users(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
            Date.valueOf(rs.getDate(4).toLocalDate())
                );
            }
        });
    }

}  
