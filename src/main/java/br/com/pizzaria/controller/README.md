# Pasta: src/main/java/br/com/pizzaria/controller

Esta pasta contém o controlador principal da aplicação.

## Arquivo: appController.java

### Funções:
- `index()`: Retorna a página inicial (`index.html`).
- `cardapio()`: Retorna a página do cardápio (`cardapio.html`).
- `pedido(sabores, tamanho, adicionais, total, model)`: Recebe os parâmetros do pedido, converte strings em listas, adiciona ao modelo e retorna a página de resumo do pedido (`pedido.html`).
- `error()`: Retorna a página de erro (`error.html`).

### Mini revisão do código
- O controlador utiliza anotações do Spring para mapear rotas.
- Não há lógica de negócio, apenas repasse de dados para as views.
- O método `pedido` faz parsing simples dos parâmetros e adiciona ao modelo.
- Código limpo e direto, mas sem validações ou tratamento de exceções.

### Sugestões
- Adicionar validação dos parâmetros.
- Implementar tratamento de erros mais detalhado.
