package com.aula.ProjetoTeste.Carros;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
@Component
public interface CarRepository extends JpaRepository<CarModels, UUID> {
    CarModels findCarModelsByCarro(String carro);
}
