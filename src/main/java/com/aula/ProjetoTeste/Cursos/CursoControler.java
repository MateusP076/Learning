package com.aula.ProjetoTeste.Cursos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/curso")
public class CursoControler {
    @Autowired
    private CursoRepository cursoRepository;
    @PostMapping("/cadastrar")
    public  Cursomodel criar(@RequestBody Cursomodel cursomodel, HttpServletRequest request){
        var curso=this.cursoRepository.save(cursomodel);
        return curso;
    }     
}
