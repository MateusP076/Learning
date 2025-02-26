package com.aula.ProjetoTeste.Carros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/carro")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping("/teste")
    public String retorno(){
        return "Ta Funfando ate aq";
    }

    @PostMapping("/cadastrar")
    public CarModels Cadastrar(@RequestBody CarModels carModels, HttpServletRequest request){
        var salvar=this.carRepository.save(carModels);
        return salvar;
    }
}
