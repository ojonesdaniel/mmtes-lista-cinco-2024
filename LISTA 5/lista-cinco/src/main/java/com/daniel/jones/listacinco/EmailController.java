package com.daniel.jones.listacinco;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @RequestMapping("/envio-email")
    public String enviado(){
        return "Email enviado com sucesso.";
    }
        
    
}
