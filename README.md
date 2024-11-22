# Cadastro de Clientes com Swing em Java

Este projeto é um aplicativo simples desenvolvido em Java, utilizando a biblioteca Swing para criar uma interface gráfica que permite o cadastro de clientes. O principal objetivo do exercício é praticar o **tratamento de exceções** no contexto de uma interface gráfica.

---

## 📝 Funcionalidades

### Interface Gráfica:
- **Campos para preenchimento:**
  - **Nome do Cliente:** Campo de texto.
  - **Idade:** Campo de texto (deve conter um número inteiro).
  - **E-mail:** Campo de texto (deve conter um formato válido com o caractere `@`).
- **Botão "Cadastrar":** Realiza a validação e tratamento de erros ao submeter os dados.

---

## ⚙️ Validações e Tratamento de Exceções

1. **Validação dos Campos:**
   - **Nome do Cliente:** Não pode ser vazio. Caso esteja vazio, uma mensagem de erro é exibida usando um `JOptionPane`.
   - **Idade:** Deve conter um valor numérico inteiro.
     - Se o campo estiver vazio ou não contiver um número válido, uma mensagem de erro é exibida.
   - **E-mail:** Deve conter o caractere `@`. Caso contrário:
     - Uma **exceção personalizada** é lançada e tratada.

2. **Tratamento de Exceções:**
   - Utiliza blocos `try-catch` para lidar com erros de conversão e outras exceções.
   - Mensagens claras são exibidas ao usuário quando uma exceção ocorre, ajudando-o a corrigir o erro.

3. **Mensagem de Sucesso:**
   - Se todos os campos forem preenchidos corretamente, uma mensagem de sucesso é exibida ao usuário com os dados cadastrados.

---

## 💻 Tecnologias Utilizadas
- **Java**
- **Swing** (biblioteca gráfica)

---

## 📂 Estrutura do Código

O código está organizado da seguinte forma:
- **Main Class:** Inicia o programa e exibe a interface gráfica.
- **Validações e Tratamento:** Implementados diretamente nos eventos associados ao botão "Cadastrar".
- **Exceção Personalizada:** Uma classe específica criada para validar o e-mail.

---

## 🚀 Como Executar o Projeto

1. Clone este repositório:
   ```bash
   git clone https://github.com/Almile/tratamentoDeExcecoes-Java.git
   ```
2. Abra o projeto em sua IDE Java preferida (Eclipse, IntelliJ, etc.).
3. Compile e execute o arquivo `CadastrarCliente.java`.

---

## 🔧 Exemplo de Uso

1. Preencha os campos com os seguintes dados:
   - Nome: João Silva 
   - Idade: 30
   - E-mail: joao.silva@example.com
2. Clique no botão "Cadastrar".
3. Caso haja algum erro, uma mensagem será exibida.
4. Se todos os dados forem válidos, uma mensagem de sucesso aparecerá.

---


## 🔧 Inserção de erros propositais

1. Preencha os campos com os seguintes dados:
   - Nome:  
   - Idade: 30anos
   - E-mail: joao.silvaexample.com
2. Clique no botão "Cadastrar".






