package com.aec.cumple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aec.cumple.model.Cumple;
import com.aec.cumple.repository.CumpleRepository;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 *
 * @author acamus
 */
@RestController
@CrossOrigin
@RequestMapping("/cumples")
public class CumpleController {

    @Autowired
    private CumpleRepository cRepo;

    /**
     *
     * @return
     */
    @GetMapping("/hoy")
    public List<Cumple> getCumples() {
        Calendar c = new GregorianCalendar();
//        int m = c.get(Calendar.MONTH+1);
//        int d = c.get(Calendar.DATE);
        return cRepo.buscaCumplesHoy(c.get(Calendar.MONTH) + 1, c.get(Calendar.DATE));
    }

    @GetMapping("/maniana")
    public List<Cumple> getCumplesM() {
        Calendar c = new GregorianCalendar();
        return cRepo.buscaCumplesHoy(c.get(Calendar.MONTH) + 1, c.get(Calendar.DATE) + 1);
    }

//    
//    @GetMapping("/all")
//    public List<Cumple> getAllCumples(){
//        return cRepo.findAll();
//    }
}
