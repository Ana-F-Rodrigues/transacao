package br.com.zupacademy.ana.transacao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long>{
	
	  List<Transacao> findTop10ByCartaoIdOrderByEfetivadaEmDesc(String idCartao);

}
