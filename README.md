
# PizzariaWithSpring

Projeto de pizzaria desenvolvido com **Spring Boot** para a disciplina de Desenvolvimento Web. O sistema permite visualizar o cardápio, montar pedidos e exibir um resumo do pedido.

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

## Documentação detalhada por pasta

- [src/main/java/br/com/pizzaria/README.md](src/main/java/br/com/pizzaria/README.md)
- [src/main/java/br/com/pizzaria/controller/README.md](src/main/java/br/com/pizzaria/controller/README.md)
- [src/main/resources/README.md](src/main/resources/README.md)
- [src/main/resources/templates/README.md](src/main/resources/templates/README.md)
- [src/test/java/br/com/pizzaria/README.md](src/test/java/br/com/pizzaria/README.md)
