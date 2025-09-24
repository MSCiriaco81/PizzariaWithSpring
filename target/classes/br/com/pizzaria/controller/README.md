# Pasta: src/main/java/br/com/pizzaria/controller

Esta pasta contém o controlador principal da aplicação.

## Arquivo: appController.java

### Funções:
- `index()`: Retorna a página inicial (`index.html`).
- `cardapio()`: Retorna a página do cardápio (`cardapio.html`).
- `pedido(sabores, tamanho, adicionais, total, model)`: Recebe os parâmetros do pedido, converte strings em listas, adiciona ao modelo e retorna a página de resumo do pedido (`pedido.html`).
- `error()`: Retorna a página de erro (`error.html`).
