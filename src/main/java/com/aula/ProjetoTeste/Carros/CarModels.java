package com.aula.ProjetoTeste.Carros;

import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="Tabela_carros")
public class CarModels {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID Id_carro;
    private String Marca;
    private String Ano;
    private Double Valor;
    private String Carro;
    private UUID id_user;

    public UUID getId_carro() {
        return Id_carro;
    }

    public void setId_carro(UUID id_carro) {
        Id_carro = id_carro;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String ano) {
        Ano = ano;
    }

    public Double getValor() {
        return Valor;
    }

    public void setValor(Double valor) {
        Valor = valor;
    }

    public String getCarro() {
        return Carro;
    }

    public void setCarro(String carro) {
        Carro = carro;
    }

    public UUID getId_user() {
        return id_user;
    }

    public void setId_user(UUID id_user) {
        this.id_user = id_user;
    }
}
