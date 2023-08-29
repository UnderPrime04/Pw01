package br.com.etechoracio.viagem.repository;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Gastos {
    @Column(name = "ID_GASTO")
    private Long id;

    @Column(name = "TX_DESCRICAO")
    private String Descricao;

    @Column(name = "TX_LOCAL")
    private String Local;

    @Column(name = "TP_CATEGORIA")
    private String Categoria;

    @Column(name = "DT_GASTO")
    private LocalDate gasto;

    @Column(name = "VLR_GASTO")
    private Double valor;

    // HENRIQUE


}
