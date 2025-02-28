package com.aula.ProjetoTeste.Carros;

import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="Tabela_carros")
public class CarModels {
    @Id
    @GeneratedValue(generator = "UUID")
<<<<<<< HEAD
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
=======
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
>>>>>>> 8028a86520d7e0ae543f0b494016822800bbdb4e
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
<<<<<<< HEAD
        Marca = marca;
=======
        this.marca = marca;
>>>>>>> 8028a86520d7e0ae543f0b494016822800bbdb4e
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
<<<<<<< HEAD
        Ano = ano;
    }

    public Double getValor() {
        return Valor;
    }

    public void setValor(Double valor) {
        Valor = valor;
=======
        this.ano = ano;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
>>>>>>> 8028a86520d7e0ae543f0b494016822800bbdb4e
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
<<<<<<< HEAD
        Carro = carro;
    }

    public UUID getId_user() {
        return id_user;
    }

    public void setId_user(UUID id_user) {
        this.id_user = id_user;
    }
=======
        this.carro = carro;
    }
    public UUID getFkuser() {
        return fkuser;
    }
    public void setFkuser(UUID fkuser) {
        this.fkuser = fkuser;
    }
    
>>>>>>> 8028a86520d7e0ae543f0b494016822800bbdb4e
}
