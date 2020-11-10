package br.edu.iftm.os.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cliente {
    private Integer id;
    private String nome_fantasia;
    private Date data_nascimento;
    private Date data_cadastro;
    private String cpf_cnpj;
    private String rg_inscricao;        
    private String email;
    private String sexo;
            
}
