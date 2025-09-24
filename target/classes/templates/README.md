# Pasta: src/main/resources/templates

Esta pasta contém os arquivos de template HTML utilizados pelo Thymeleaf para renderizar as páginas da aplicação.

## Arquivos e Funções

- **index.html**: Página inicial com botão para acessar o cardápio.
- **cardapio.html**: Formulário para seleção de sabores, tamanhos e adicionais da pizza. Calcula o preço total.
- **pedido.html**: Exibe o resumo do pedido realizado, mostrando sabores, tamanho, adicionais e total.
- **error.html**: Página simples exibida em caso de erro de rota.

## Mini revisão dos templates
- Os arquivos HTML usam marcação clara e são compatíveis com Thymeleaf.
- O formulário do cardápio é bem estruturado e facilita a seleção dos itens.
- O resumo do pedido utiliza iteração de listas e exibição de variáveis do modelo.

### Pontos positivos
- Separação clara entre as páginas.
- Uso correto de variáveis do Thymeleaf.

### Pontos de melhoria
- Poderia haver validação de campos no front-end.
- Melhorar o design visual para maior atratividade.
