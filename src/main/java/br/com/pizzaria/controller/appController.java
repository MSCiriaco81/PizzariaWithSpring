package br.com.pizzaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;


@Controller
public class appController {
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/cardapio")
    public String cardapio() {
        return "cardapio";
    }

    @GetMapping("/pedido")
    public String pedido(@RequestParam String sabores,
                         @RequestParam String tamanho,
                         @RequestParam String adicionais,
                         @RequestParam Double total,
                         Model model) {

        List<String> listaSabores = Arrays.asList(sabores.split(","));
        List<String> listaAdicionais = Arrays.asList(adicionais.split(","));

        model.addAttribute("sabores", listaSabores);
        model.addAttribute("tamanho", tamanho);
        model.addAttribute("adicionais", listaAdicionais);
        model.addAttribute("total", total);

        return "pedido";
    }



    @GetMapping("/error")
    public String error() {
        return "error";
    }
}
