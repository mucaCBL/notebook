package com.controle.notebooks.Controller;

import com.controle.notebooks.Service.S_Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_Usuario {

    @GetMapping("/")
    public String getCadastro() {
        return "usuario/cadastro";
    }

    @PostMapping("/cadastro")
    public String cadatrarUsuario(@RequestParam("nome") String nome,
                                  @RequestParam("email") String email,
                                  @RequestParam("matricula") String matricula,
                                  @RequestParam("cargo") String cargo
    ) {
        S_Usuario.cadastrarUsuario(nome, cargo, matricula, email);
        return "usuario/cadastro";
    }

}
