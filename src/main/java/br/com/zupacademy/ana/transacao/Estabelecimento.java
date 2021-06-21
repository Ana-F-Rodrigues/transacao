package br.com.zupacademy.ana.transacao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Estabelecimento {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @NotBlank
	    private String nome;

	    @NotBlank
	    private String cidade;

	    @NotBlank
	    private String endereco;

	    public Estabelecimento() {
	    }

	    public Estabelecimento(String nome, String cidade, String endereco) {
	        this.nome = nome;
	        this.cidade = cidade;
	        this.endereco = endereco;
	    }

}
