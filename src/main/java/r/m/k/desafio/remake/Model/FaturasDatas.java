package r.m.k.desafio.remake.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record FaturasDatas(LocalDate dataVencimento, 
                           LocalDateTime dataPagamento, 
                           LocalDateTime dataGeracao) {}
