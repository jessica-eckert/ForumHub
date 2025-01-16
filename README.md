# FórumHub - API REST

Este é um projeto desenvolvido como parte do **programa One - Oracle Next Education**, com o objetivo de criar uma API RESTful para um fórum. A aplicação foi construída utilizando o framework **Spring Boot**, **JPA**, **PostgreSQL** e **Swagger**.

## Descrição

O FórumHub é uma aplicação de fórum onde é possível criar, listar, editar e excluir tópicos. Utiliza a arquitetura REST e está configurada com autenticação básica (basic authentication). A API permite realizar operações CRUD para tópicos de forma simples e eficiente.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Security**
- **JPA / Hibernate**
- **PostgreSQL**
- **Swagger 2** (para documentação da API)
- **H2 Database** (para desenvolvimento e testes)

## Funcionalidades

- **Autenticação básica** para acessar a API.
- **CRUD** de tópicos:
  - **Criar**: Adicionar novos tópicos.
  - **Listar**: Obter todos os tópicos.
  - **Buscar por ID**: Encontrar um tópico específico.
  - **Atualizar**: Editar um tópico.
  - **Excluir**: Deletar um tópico.

## Como Rodar

### Pré-requisitos

- Java 17 ou superior.
- IntelliJ IDEA (ou outra IDE de sua preferência).
- Banco de dados **PostgreSQL** configurado e rodando.

### Passo a Passo

```bash
1. Clone o repositório:

   git clone https://github.com/seu-usuario/forumhub.git
   cd forumhub

2. Adicione as variáveis de ambiente no IntelliJ:

   No IntelliJ, vá até **Run > Edit Configurations** e adicione as variáveis de ambiente `DB_USER` e `DB_PASSWORD` com as credenciais do seu banco de dados PostgreSQL.

3. Configure o banco de dados:

   No arquivo `application.properties`, configure as propriedades do banco de dados conforme necessário:

   spring.datasource.url=jdbc:postgresql://localhost:5432/forumhub
   spring.datasource.username=${DB_USER}
   spring.datasource.password=${DB_PASSWORD}
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true

4. Execute o projeto:

   Basta rodar a aplicação como uma aplicação Spring Boot. Você pode fazer isso diretamente no IntelliJ ou através do terminal com o seguinte comando:

   ./mvnw spring-boot:run

5. Acesse a API:

   A API estará disponível em: `http://localhost:8080/api/topicos`.

   Você pode utilizar o **Swagger** para explorar e testar os endpoints da API acessando `http://localhost:8080/swagger-ui/index.html`.´´´´

