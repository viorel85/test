
package com.iucosoft.maven.webcontroller;

import com.iucosoft.maven.model.Users;
import com.iucosoft.maven.webservice.UsersServiceIntf;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author Viorel
 */
@Controller
public class Home {
    
    @Autowired
    UsersServiceIntf usersService;
    
    @RequestMapping("index")
    String index(){
        return "index";
    }
    
    
    @RequestMapping("home")
    ModelAndView heme(){
        
//        Users lista = usersService.getById(6);
        List<Users> lista = usersService.getAll();
        System.out.println("LISTAAAA "+lista);
        
        ModelAndView mv = new ModelAndView("home");
        mv.addObject("lista", lista);
        
        return mv;
    }
    
}
