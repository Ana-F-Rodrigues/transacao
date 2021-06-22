package br.com.zupacademy.ana.cartao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
public class Cartao {
	
	@Id
    private String id;

    public String getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

//	@Email
//    @NotBlank
    private String email;

    @Deprecated
    public Cartao() {
    }

    public Cartao(String id, String email) {
        this.id = id;
        this.email = email;

    }

   
    
}
