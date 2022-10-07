package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import me.dio.sacola.enumeration.FormaPagamento;

@AllArgsConstructor //sacola(Long id ......){}
@Builder //SacolaBuidler
@Data //getter and setter
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) //estudar posteriormente
@NoArgsConstructor //sacola(){}
public class Sacola {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JsonIgnore
    private Cliente cliente;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Item> itens;
    private Double valorTotal;

    @Enumerated
    private FormaPagamento FormaPagamento;
    private boolean fechada;
}
