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
