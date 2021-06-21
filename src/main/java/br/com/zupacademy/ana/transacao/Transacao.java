package br.com.zupacademy.ana.transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Transacao {
	
	    @Id
	    private String id;

	    @NotNull
	    private BigDecimal valor;

	    @ManyToOne(cascade = CascadeType.ALL)
	    private Estabelecimento estabelecimento;

	    @ManyToOne(cascade = CascadeType.ALL)
	    private Cartao cartao;

	    @NotNull
	    private LocalDateTime efetivadaEm;

	    @Deprecated
	    public Transacao() {
	    }

	    public Transacao(String id, BigDecimal valor,
	                     Estabelecimento estabelecimento,
	                     Cartao cartao, LocalDateTime efetivadaEm) {
	        this.id = id;
	        this.valor = valor;
	        this.estabelecimento = estabelecimento;
	        this.cartao = cartao;
	        this.efetivadaEm = efetivadaEm;
	    }
	
	

}
