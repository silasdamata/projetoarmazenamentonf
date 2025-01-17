package com.equipeturma862.cadastronf.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class AgenciaDTO {

    private Long id;

    private Long numeroDeIdentificacao;

    private String nome;

    private String email;
}
