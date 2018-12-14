package com.mva.taller.contador.mecanicos.controller;


import com.mva.taller.contador.mecanicos.models.entity.Tiempos;
import com.mva.taller.contador.mecanicos.models.services.ITiemposService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/apirest/times")
public class TiemposRestController {
    @Autowired
    private ITiemposService iTiemposService;

    @RequestMapping(value = "/alltimes" ,method = RequestMethod.GET)
    public List<Tiempos> findAllTimes(){
        return iTiemposService.findAll();
    }
}
