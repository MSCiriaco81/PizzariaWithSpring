
// Pacote principal da aplicação
package br.com.pizzaria;


// Importações do Spring Boot
import org.springframework.boot.SpringApplication; // Responsável por rodar a aplicação
import org.springframework.boot.autoconfigure.SpringBootApplication; // Marca a classe principal do Spring Boot


// Indica que esta é a classe principal da aplicação Spring Boot
@SpringBootApplication
public class PizzariaApplication {

    // Método principal: ponto de entrada da aplicação
    public static void main(String[] args) {
        // Inicializa a aplicação Spring Boot
        SpringApplication.run(PizzariaApplication.class, args);
    }

}
