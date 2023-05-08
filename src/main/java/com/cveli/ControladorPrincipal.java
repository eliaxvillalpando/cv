package com.cveli;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ControladorPrincipal {

    
    @GetMapping("/cv")
    private String getIndex(){
    
        return "index";
    
    }
    

    
}
