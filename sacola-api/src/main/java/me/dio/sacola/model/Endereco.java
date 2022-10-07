package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import javax.persistence.*;
import javax.persistence.Entity;

@AllArgsConstructor
@Builder
@Data
@Embeddable
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor
public class Endereco {
      private String cep;
      private String complemento;
      private String rua;
      private String cidade;
}
