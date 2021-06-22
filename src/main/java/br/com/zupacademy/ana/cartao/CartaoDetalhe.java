package br.com.zupacademy.ana.cartao;

public class CartaoDetalhe {
	
	private String id;
    private String email;

    public CartaoDetalhe(Cartao cartao) {
        this.id = cartao.getId();
        this.email = cartao.getEmail();
    }

	public String getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

   
}
