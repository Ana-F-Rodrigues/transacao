package br.com.zupacademy.ana.transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.zupacademy.ana.cartao.CartaoDetalhe;
import br.com.zupacademy.ana.estabelecimento.EstabelecimentoDetalhe;

public class TransacaoDetalhe {

	private String id;
	private BigDecimal valor;
	private EstabelecimentoDetalhe estabelecimento;
	private CartaoDetalhe cartao;
	private LocalDateTime efetivadaEm;

	public TransacaoDetalhe(Transacao transacao) {
	        this.id = transacao.getId();
	        this.valor = transacao.getValor();
	        this.estabelecimento = new EstabelecimentoDetalhe(transacao.getEstabelecimento());
	        this.cartao = new CartaoDetalhe(transacao.getCartao());
	        this.efetivadaEm = transacao.getEfetivadaEm();
	    }

	public String getId() {
		return id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public EstabelecimentoDetalhe getEstabelecimento() {
		return estabelecimento;
	}

	public CartaoDetalhe getCartao() {
		return cartao;
	}

	public LocalDateTime getEfetivadaEm() {
		return efetivadaEm;
	}

}
