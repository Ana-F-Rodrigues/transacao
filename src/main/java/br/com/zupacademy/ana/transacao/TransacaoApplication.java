package br.com.zupacademy.ana.transacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TransacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransacaoApplication.class, args);
	}



//	@Bean
//	JsonMessageConverter jsonMessageConverter() {
//		return new JsonMessageConverter();
//	}
//
//         @KafkaListener(id = "my.cats", topics = "cats")
//          void cats(Cat cat) {
//	          System.out.println("cat = " + cat);
} 
