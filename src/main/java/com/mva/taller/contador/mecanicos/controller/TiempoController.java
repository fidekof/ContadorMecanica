/*package com.mva.taller.contador.mecanicos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.mva.taller.contador.mecanicos.dao.ITiempoDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TiempoController {

    @Autowired
    private ITiempoDao tiempoDao;

    @RequestMapping(value="/listar", method= RequestMethod.GET)
    public String listar(Model model){
        model.addAttribute("titulo","Listado de tiempos");
        model.addAttribute("tiempos",tiempoDao.findAll());
        return "listar";
    }
}
*/