package com.mva.taller.contador.mecanicos.controller;


import com.mva.taller.contador.mecanicos.dao.interfaces.ITiemposDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class TiemposController {

    @Autowired
    private ITiemposDao tiemposDao;
    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public String getAll(Model model)
    {
        model.addAttribute("titulo", "Lista de tiempos");
        model.addAttribute("listatiempos", tiemposDao.findAll());
        return "tiempos";
    }
}
