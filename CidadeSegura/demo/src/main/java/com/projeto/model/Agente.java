package com.projeto.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


@Table(name = "agentes")
public class Agente extends User {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, unique = false)
    private String nome;

    @Column(length = 11, nullable = false, unique = true)
    private String cpf;

    @Column(nullable = false, unique = false)
    private String instituicao;

    @Column(nullable = false, unique = true)
    private String email;

/* 
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setInstituicao(String instituicao){
        this.instituicao = instituicao;
    }
    public void setEmail(String email){
        this.email = email;
    }
*/
}