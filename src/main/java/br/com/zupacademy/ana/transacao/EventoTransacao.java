package br.com.zupacademy.ana.transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.zupacademy.ana.cartao.Cartao;
import br.com.zupacademy.ana.cartao.CartaoResponse;
import br.com.zupacademy.ana.estabelecimento.Estabelecimento;
import br.com.zupacademy.ana.estabelecimento.EstabelecimentoResponse;

public class EventoTransacao {
	
//	   @NotBlank
	    private String id;

//	    @NotNull
	    private BigDecimal valor;

//	    @NotNull
	    private EstabelecimentoResponse estabelecimento;

//	    @NotNull
	    private CartaoResponse cartao;

//	    @NotNull
	    private LocalDateTime efetivadaEm;

	    public EventoTransacao() {
	    }

	    public EventoTransacao(String id, BigDecimal valor,
	                             EstabelecimentoResponse estabelecimento,
	                             CartaoResponse cartao, LocalDateTime efetivadaEm) {
	        this.id = id;
	        this.valor = valor;
	        this.estabelecimento = estabelecimento;
	        this.cartao = cartao;
	        this.efetivadaEm = efetivadaEm;
	    }

	    public Transacao toModel() {
	        Cartao cartao = this.cartao.toModel();
	        Estabelecimento estabelecimento = this.estabelecimento.toModel();
	        return new Transacao(id, valor, estabelecimento, cartao, efetivadaEm);
	    }


	    @Override
	    public String toString() {
	        return "EventoDeTransacao{" +
	                "id='" + id + '\'' +
	                ", valor=" + valor +
	                ", estabelecimento=" + estabelecimento +
	                ", cartao=" + cartao +
	                ", efetivadaEm=" + efetivadaEm +
	                '}';
	    }

	    public String getId() {
	        return id;
	    }

	    public BigDecimal getValor() {
	        return valor;
	    }

	    public EstabelecimentoResponse getEstabelecimento() {
	        return estabelecimento;
	    }

	    public CartaoResponse getCartao() {
	        return cartao;
	    }

	    public LocalDateTime getEfetivadaEm() {
	        return efetivadaEm;
	    }

}
