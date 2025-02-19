package com.aula.ProjetoTeste.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserControler {
    private UserRepository userRepository; 
    @GetMapping("/")
    public String retorno(){
        return "Hello noia";
    }
    @PostMapping ("/criar")
    private UserModel criar( @RequestBody UserModel userModel){
        var criado=this.userRepository.save(userModel);
        return criado;
    }    
}
