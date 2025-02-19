package com.aula.ProjetoTeste.User;

import java.util.UUID;
import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity(name="TabelaUser")
public class UserModel {
    @Id
    @GeneratedValue(generator="UUID")
    private UUID id;
    @Nonnull
    private String nome;
    @Column(unique=true)
    private String username;
    private String telefone;
    private String senha;

    public UserModel() {
        
    }
}
