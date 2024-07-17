package com.plataforma.olamundo.controler;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

public class Olamundocontroller {


    @GetMapping("/")   
    public String OlaMundo(){
        return "Ola mundo Vscode SOU O MELHOR - integracao com Spring tools 4 ";
    }
}
