package r.m.k.desafio.remake.Model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
@Getter
@AllArgsConstructor
public class Fatura implements Serializable {
    @Id 
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Long id;
    
    private int mes;
    
    private int ano;
    
    private Double valor;
   
    @Enumerated(EnumType.STRING)
    private Situacao Situacao;
    
    private LocalDate dataVencimento;

    private LocalDateTime dataPagamento;
    
    private LocalDateTime dataGeracao = LocalDateTime.now();

    private Client client;

}
