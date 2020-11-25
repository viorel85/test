
package com.iucosoft.maven.webcontroller;

import com.iucosoft.maven.model.Rezervari;
import com.iucosoft.maven.service.ReservationServiceIntf;
import com.iucosoft.maven.utils.RezervariConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Viorel
 */
@Controller
@RequestMapping("/reservation")
public class MainController {
    
     @Autowired
    ReservationServiceIntf reservationService;
     
     @Autowired
     RezervariConvertor rezervariConvertor;

    @RequestMapping("/bookingForm")
    public String bookingForm(Model model) {

        Rezervari res = new Rezervari();
        model.addAttribute("reservation", res);
        return "reservation";
    }

    @RequestMapping("/submitForm")
    public String submitForm(@ModelAttribute("reservation") RezervariWebModel res) {
//        
        Rezervari rez = rezervariConvertor.convert(res);
            reservationService.save(rez);
System.out.println("O REZERVARE curata: "+res);
System.out.println("O REZERVARE convertata: "+rez);
        return "confirmation-form";
    }
}
