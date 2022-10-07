package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.*;
import java.util.List;

@AllArgsConstructor //sacola(Long id ......){}
@Builder //SacolaBuidler
@Data //getter and setter
@Entity //conveter em tabela
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) //estudar posteriormente
@NoArgsConstructor //sacola(){}
public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Produto> cardapio;
    @Embedded
    private Endereco endereco;

}
