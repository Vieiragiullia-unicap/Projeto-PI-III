package com.projeto.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Table(name = "civis")
public class Civil extends User {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, unique = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String cpf;

    @Column(length = 30, nullable = false, unique = true)
    private String email;

    @Column(length = 11, nullable = false, unique = true)
    private String contato;

    private List<Incidente> incidentes = new ArrayList<>();

/* 
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setContato(String contato){
        this.contato = contato;
    }
*/    

    public Civil(String nome, String cpf, String email, String contato){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.contato = contato;
    }

    // metodo para descrever o incidente
    public void descreverIncidente(){
        Scanner s = new Scanner(System.in);

        System.out.println("Tipo de incidente: ");
        String tipoIncidente = s.nextLine();

        System.out.println("Descreva o incidente: ");
        String descricao = s.nextLine();

        System.out.println("Data do incidente: ");
        String data = s.nextLine();

        System.out.println("Endereço onde ocorreu: ");
        String endereco = s.nextLine();
        s.close();

        Incidente incidente = new Incidente(tipoIncidente, descricao, data,  endereco);
        incidente.setCivil(this); // Associa o incidente ao civil atual
        incidentes.add(incidente);
    }

    // metodo para visualizar o historico de incidentes
    public void visualizarHistorico() {
        if (incidentes.isEmpty()) {
            System.out.println("Não há incidentes registrados.");
        } else {
            System.out.println("Histórico de Incidentes:");
            for (Incidente incidente : incidentes) {
                System.out.println(incidente);
            }
        }
    }
    
}
