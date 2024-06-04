package com.projeto.model;

//import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Table(name = "incidentes")
public class Incidente {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = false)
    private String tipoIncidente;

    @Column(length = 100, nullable = false)
    private String descricao;

    @Column(nullable = false, unique = true)
    private Civil civil;
    
    // procurar anotação SpringBoot para pegar a data automaticamente, ao ines de pedir ao usuario civil
    @Column(nullable = false)
    private String data;

    @Column(nullable = false)
    private String endereco;

    public Incidente(String tipoIncidente, String descricao, Civil civil, String data, String endereco){
        this.tipoIncidente = tipoIncidente;
        this.descricao = descricao; 
        this.civil = civil; 
        this.data = data;
        this.endereco = endereco;
    }
    
/* 
    public void setTipoIncidente(String tipoIncidente){
        this.tipoIncidente = tipoIncidente;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setCivil(Civil civil){
        this.civil = civil;
    }
    public void setData(String data){
        this.data = data;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
*/
}