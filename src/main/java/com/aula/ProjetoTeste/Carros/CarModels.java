package com.aula.ProjetoTeste.Carros;

import java.util.UUID;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;



@Entity(name="Tabela_carros")
public class CarModels {
    
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID idcarro;
    private String marca;
    private String ano;
    private String valor;
    private String carro;
    private UUID fkuser;
    public UUID getIdcarro() {
        return idcarro;
    }
    public void setIdcarro(UUID idcarro) {
        this.idcarro = idcarro;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public String getCarro() {
        return carro;
    }
    public void setCarro(String carro) {
        this.carro = carro;
    }
    public UUID getFkuser() {
        return fkuser;
    }
    public void setFkuser(UUID fkuser) {
        this.fkuser = fkuser;
    }
    
}
