
// Pacote do controlador da aplicação
package br.com.pizzaria.controller;


// Importações das anotações e classes do Spring e Java
import org.springframework.stereotype.Controller; // Marca a classe como um controlador Spring MVC
import org.springframework.web.bind.annotation.GetMapping; // Mapeia requisições GET
import org.springframework.ui.Model; // Permite passar dados para a view
import org.springframework.web.bind.annotation.RequestParam; // Captura parâmetros da URL

import java.util.Arrays;
import java.util.List;


// Indica que esta classe é um controlador Spring MVC
@Controller
public class appController {

    // Rota para a página inicial
    @GetMapping("/index")
    public String index() {
        // Retorna o template index.html
        return "index";
    }

    // Rota para a página do cardápio
    @GetMapping("/cardapio")
    public String cardapio() {
        // Retorna o template cardapio.html
        return "cardapio";
    }

    // Rota para a página de resumo do pedido
    @GetMapping("/pedido")
    public String pedido(
            @RequestParam String sabores,      // Recebe os sabores selecionados (string separada por vírgula)
            @RequestParam String tamanho,      // Recebe o tamanho da pizza
            @RequestParam String adicionais,   // Recebe os adicionais selecionados (string separada por vírgula)
            @RequestParam Double total,        // Recebe o valor total do pedido
            Model model) {                     // Objeto para passar dados para a view

        // Converte a string de sabores e adicionais em listas
        List<String> listaSabores = Arrays.asList(sabores.split(","));
        List<String> listaAdicionais = Arrays.asList(adicionais.split(","));

        // Adiciona os dados ao modelo para serem exibidos na view
        model.addAttribute("sabores", listaSabores);
        model.addAttribute("tamanho", tamanho);
        model.addAttribute("adicionais", listaAdicionais);
        model.addAttribute("total", total);

        // Retorna o template pedido.html
        return "pedido";
    }

    // Rota para página de erro
    @GetMapping("/error")
    public String error() {
        // Retorna o template error.html
        return "error";
    }
}
