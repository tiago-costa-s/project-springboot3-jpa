# 🧪 Project Spring Boot 3 + JPA

## 📌 Descrição

Este projeto é uma aplicação RESTful construída com **Spring Boot 3**, **Spring Data JPA** e **MySQL**, implementando as operações básicas de um CRUD (Create, Read, Update, Delete) para gerenciamento de usuários. A aplicação segue as melhores práticas de desenvolvimento e arquitetura, utilizando o padrão de projeto MVC (Model-View-Controller) e tratamento centralizado de exceções.

## 🛠 Tecnologias Utilizadas

- **Backend:** Java 17
- **Framework:** Spring Boot 3
- **Persistência:** Spring Data JPA
- **Banco de Dados:** MySQL
- **Gerenciamento de Dependências:** Maven
- **Tratamento de Exceções:** `@ControllerAdvice` com `@ExceptionHandler`
- **Serialização JSON:** Jackson
- **Ferramentas de Desenvolvimento:** Spring DevTools (para recarga automática)

## 📁 Estrutura do Projeto

```bash
project-springboot3-jpa/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   └── tiagocosta/
│   │   │   │       └── project_jpa_spring/
│   │   │   │           ├── entities/
│   │   │   │           ├── repositories/
│   │   │   │           ├── resources/
│   │   │   │           └── services/
│   │   └── resources/
│   │       └── application.properties
├── pom.xml
└── README.md
🚀 Como Rodar o Projeto
1. Clone o Repositório
bash
Copiar código
git clone https://github.com/tiago-costa-s/project-springboot3-jpa.git
cd project-springboot3-jpa
2. Configure o Banco de Dados
No arquivo src/main/resources/application.properties, adicione suas credenciais do MySQL:

properties
Copiar código
spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
3. Execute a Aplicação
Com o Maven instalado, execute o seguinte comando:

bash
Copiar código
./mvnw spring-boot:run
A aplicação estará disponível em http://localhost:8080.

📚 Endpoints Disponíveis
Usuários
GET /users – Retorna todos os usuários cadastrados.

GET /users/{id} – Retorna os detalhes de um usuário pelo ID.

POST /users – Cria um novo usuário.

PUT /users/{id} – Atualiza os dados de um usuário existente.

DELETE /users/{id} – Remove um usuário pelo ID.

Exemplo de Requisição POST
json
Copiar código
POST /users
Content-Type: application/json

{
  "name": "João Silva",
  "email": "joao.silva@example.com",
  "phone": "+55 31 99999-9999",
  "password": "senha123"
}
Exemplo de Resposta
json
Copiar código
HTTP/1.1 201 Created
Location: http://localhost:8080/users/1

{
  "id": 1,
  "name": "João Silva",
  "email": "joao.silva@example.com",
  "phone": "+55 31 99999-9999"
}
🛡️ Tratamento de Erros
A aplicação utiliza um controlador global de exceções para capturar e retornar erros de forma padronizada. Por exemplo:

404 Not Found – Quando um recurso não é encontrado.

400 Bad Request – Quando há erros de validação de entrada.

🧪 Testes
Os testes unitários e de integração são realizados utilizando o framework JUnit 5, com suporte a mocks e injeção de dependências.

Para rodar os testes:

bash
Copiar código
./mvnw test
🔧 Scripts Úteis
Compilar o projeto: ./mvnw clean install

Executar a aplicação: ./mvnw spring-boot:run

Rodar os testes: ./mvnw test

Gerar o JAR: ./mvnw package

📌 Licença
Este projeto está licenciado sob a MIT License.

