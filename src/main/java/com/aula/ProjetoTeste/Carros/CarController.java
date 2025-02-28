package com.aula.ProjetoTeste.Carros;

import org.springframework.beans.factory.annotation.Autowired;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carro")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping("/teste")
    public String retorno(){
        return "Ta Funfando ate aq";
    }

//    @PostMapping("/cadastrar")
//    public ResponseEntity Cadastrar(@RequestBody CarModels carModels, HttpServletRequest request){
//        var verifica=this.carRepository.findCarModelsByCarro(carModels.getCarro());
//        if (verifica!=null){
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Carro existente");
//        } else {
//            var salvo=this.carRepository.save(carModels);
//            return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
//        }
//
//    }
}
