package com.iucosoft.maven.utils;

import com.iucosoft.maven.model.Rezervari;
import com.iucosoft.maven.webcontroller.RezervariWebModel;
import org.springframework.stereotype.Component;

/**
 *
 * @author Viorel
 */
@Component
public class RezervariConvertor {
    
    public Rezervari convert(RezervariWebModel rez){
        Rezervari r = new Rezervari(rez.getNume(), rez.getPrenume(), rez.getOrasul(),
                 rez.getLimbajul(), rez.getLocalitatea(), rez.getGenul());
        return r;
    }
 
}

