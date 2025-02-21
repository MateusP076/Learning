package com.aula.ProjetoTeste.User;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserControler {
    @Autowired

    private UserRepository userRepository;
    @GetMapping("/")
    public String retorno(){
        return "Hello noia";
    }
    @PostMapping ("/criar")
    public UserModel criar(@RequestBody UserModel userModel, HttpServletRequest request){

        var criado=this.userRepository.save(userModel);
        return criado;
    }    
    
}
