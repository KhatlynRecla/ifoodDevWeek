package me.dio.sacola.resource;

import lombok.*;
import javax.persistence.Embeddable;

@AllArgsConstructor
@Builder
@Data
@Embeddable
@NoArgsConstructor
public class ItemDto {
    private  Long produtoId;
    private int quantidade;
    private Long idSacola;
}
