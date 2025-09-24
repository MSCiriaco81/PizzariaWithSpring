# Pasta: src/main/java/br/com/pizzaria

Esta pasta contém o código-fonte principal da aplicação Spring Boot da pizzaria.

## Arquivos e Funções

- **PizzariaApplication.java**: Classe principal que inicializa a aplicação Spring Boot.
  - `main(String[] args)`: Ponto de entrada da aplicação. Executa o Spring Boot.

- **controller/appController.java**: Controlador responsável pelas rotas principais da aplicação web.
  - `index()`: Retorna a página inicial (`index.html`).
  - `cardapio()`: Retorna a página do cardápio (`cardapio.html`).
  - `pedido(...)`: Recebe parâmetros do pedido, processa e envia para a view `pedido.html`.
  - `error()`: Retorna a página de erro (`error.html`).

## Mini revisão do código

O código segue o padrão MVC do Spring Boot. O controlador centraliza as rotas e repassa dados para as views Thymeleaf. Não há lógica de negócio complexa, apenas manipulação de parâmetros e repasse para as páginas HTML.

### Pontos positivos
- Simplicidade e clareza.
- Uso correto de anotações do Spring.
- Separação entre controller e views.

### Pontos de melhoria
- Poderia haver validação dos parâmetros recebidos.
- Possível expansão para incluir serviços e repositórios.
