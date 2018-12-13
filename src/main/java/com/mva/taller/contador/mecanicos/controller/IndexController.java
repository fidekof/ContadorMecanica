
package com.mva.taller.contador.mecanicos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cronometros")
public class IndexController {

    @GetMapping("/bodega_bahia/{bodega}/{bahia}")
    public String cronometro(Model model,  @PathVariable String bodega, @PathVariable String bahia){
//        model.addAttribute("taller","La bodega es!" + bodega);
//        model.addAttribute("bahia1","La bahia es!" + bahia);
        return "cronometro";
    }


}
