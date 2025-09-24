
// Pacote de testes da aplicação
package br.com.pizzaria;


// Importações para testes com Spring Boot
import org.junit.jupiter.api.Test; // Anotação para marcar métodos de teste
import org.springframework.boot.test.context.SpringBootTest; // Indica que é um teste de contexto Spring Boot


// Classe de teste para verificar se o contexto da aplicação carrega corretamente
@SpringBootTest
class PizzariaApplicationTests {

    // Teste padrão gerado pelo Spring Boot
    @Test
    void contextLoads() {
        // Se o contexto carregar sem erros, o teste passa
    }

}
