package br.com.zupacademy.ana.transacao;

import javax.validation.constraints.NotBlank;

public class EstabelecimentoResponse {

	   @NotBlank
	    private String nome;

	    @NotBlank
	    private String cidade;

	    @NotBlank
	    private String endereco;

	    public EstabelecimentoResponse() {
	    }

	    public EstabelecimentoResponse(String nome, String cidade,
	                                   String endereco) {
	        this.nome = nome;
	        this.cidade = cidade;
	        this.endereco = endereco;
	    }

	    public Estabelecimento toModel() {
	        return new Estabelecimento(nome, cidade, endereco);
	    }

	    @Override
	    public String toString() {
	        return "EstabelecimentoResponse{" +
	                "nome='" + nome + '\'' +
	                ", cidade='" + cidade + '\'' +
	                ", endereco='" + endereco + '\'' +
	                '}';
	    }

	    public String getNome() {
	        return nome;
	    }

	    public String getCidade() {
	        return cidade;
	    }

	    public String getEndereco() {
	        return endereco;
	    }
}
