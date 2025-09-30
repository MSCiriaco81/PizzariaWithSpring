

# PizzariaWithSpring

## Sumário
1. [Introdução](#pizzariawithspring)
2. [Tecnologias Utilizadas](#tecnologias-utilizadas)
3. [Estrutura de Pastas](#estrutura-de-pastas)
4. [Funcionalidades](#funcionalidades)
5. [Mini revisão do projeto](#mini-revisão-do-projeto)
6. [Como Rodar o Projeto](#como-rodar-o-projeto)
7. [Exemplos de Código e Explicação](#exemplos-de-código-e-explicação)
8. [Documentação detalhada por pasta](#documentação-detalhada-por-pasta)
9. [Resumo de Conteúdo para Prova](./conteudo.md)

Projeto de pizzaria desenvolvido com **Spring Boot** para a disciplina de Desenvolvimento Web. O sistema permite visualizar o cardápio, montar pedidos e exibir um resumo do pedido.

> **Este projeto é uma evolução do projeto original feito em Node.js:**
> 
> [Pizzaria (Node.js)](https://github.com/MSCiriaco81/Pizzaria)

## Tecnologias Utilizadas
- **Java 21**
- **Spring Boot 3.5.6**
- **Thymeleaf**
- **Maven**

## Estrutura de Pastas

- `src/main/java/br/com/pizzaria/` — Código-fonte principal da aplicação
	- `PizzariaApplication.java`: Inicializa o Spring Boot
	- `controller/appController.java`: Controlador das rotas principais
- `src/main/resources/templates/` — Templates HTML (Thymeleaf)
- `src/main/resources/` — Configurações e recursos
- `src/test/java/br/com/pizzaria/` — Testes automatizados

## Funcionalidades
- Exibir o **cardápio** de pizzas
- Montar e enviar **pedidos**
- Exibir **resumo** do pedido

## Mini revisão do projeto

O projeto segue o padrão MVC do Spring Boot, com separação clara entre controladores e views. O controlador centraliza as rotas e repassa dados para as páginas HTML. Os templates são simples e utilizam Thymeleaf para exibir informações dinâmicas.

### Pontos positivos
- Código limpo e didático
- Uso correto das anotações do Spring
- Estrutura de pastas organizada

## Como Rodar o Projeto

### Pré-requisitos
- Java 21
- Maven

### Passos
1. Clone o repositório
2. Execute `mvn spring-boot:run` na raiz do projeto
3. Acesse `http://localhost:8080/index` no navegador

---


## Exemplos de Código e Explicação

### 1. Classe Principal (PizzariaApplication.java)
```java
@SpringBootApplication
public class PizzariaApplication {
	public static void main(String[] args) {
		SpringApplication.run(PizzariaApplication.class, args);
	}
}
```
**Explicação:**
A anotação `@SpringBootApplication` indica o ponto de entrada da aplicação. O método `main` inicializa o Spring Boot.

### 2. Controlador de Rotas (appController.java)
```java
@Controller
public class appController {

	@GetMapping("/index")
	public String index() {
		return "index"; // Retorna o template index.html
	}

	@GetMapping("/cardapio")
	public String cardapio() {
		return "cardapio"; // Retorna o template cardapio.html
	}

	@PostMapping("/pedido")
	public String pedido(@RequestParam String sabores,
						@RequestParam String tamanho,
						@RequestParam String adicionais,
						@RequestParam String total,
						Model model) {
		model.addAttribute("sabores", sabores);
		model.addAttribute("tamanho", tamanho);
		model.addAttribute("adicionais", adicionais);
		model.addAttribute("total", total);
		return "pedido"; // Retorna o template pedido.html com os dados
	}
}
```
**Explicação:**
O controlador define as rotas principais usando anotações do Spring (`@GetMapping`, `@PostMapping`). Ele recebe dados do formulário, adiciona ao modelo e retorna o template correspondente.

### 3. Exemplo de Template Thymeleaf (pedido.html)
```html
<h2>Resumo do Pedido</h2>
<p>Sabores: <span th:text="${sabores}"></span></p>
<p>Tamanho: <span th:text="${tamanho}"></span></p>
<p>Adicionais: <span th:text="${adicionais}"></span></p>
<p>Total: R$ <span th:text="${total}"></span></p>
```
**Explicação:**
O Thymeleaf permite exibir variáveis do backend diretamente no HTML usando a sintaxe `th:text`. Assim, os dados do pedido aparecem dinamicamente na página.

---

## Documentação detalhada por pasta

- [src/main/java/br/com/pizzaria/README.md](src/main/java/br/com/pizzaria/README.md)
- [src/main/java/br/com/pizzaria/controller/README.md](src/main/java/br/com/pizzaria/controller/README.md)
- [src/main/resources/README.md](src/main/resources/README.md)
- [src/main/resources/templates/README.md](src/main/resources/templates/README.md)
- [src/test/java/br/com/pizzaria/README.md](src/test/java/br/com/pizzaria/README.md)
