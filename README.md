# DailyTask API

## Descrição

DailyTask é uma API de gerenciamento de tarefas diárias, desenvolvida em Java com Spring Boot. A aplicação permite a criação, edição, exclusão e conclusão de tarefas para usuários autenticados. A autenticação e autorização dos usuários são gerenciadas utilizando JWT (JSON Web Tokens), garantindo um controle de acesso seguro e eficiente.

## Funcionalidades

- **Autenticação com JWT**: Acesso seguro com JSON Web Tokens para proteger os endpoints da API.
- **Criptografia de Senhas**: Senhas dos usuários são criptografadas utilizando BCrypt.
- **Gestão de Tarefas**: CRUD completo para gerenciamento de tarefas, incluindo criação, edição, exclusão e marcação como concluída.
- **Gestão de Usuários**: CRUD completo para gerenciamento de usuários, incluindo registro e edição de dados.
- **Validação de Dados e Segurança**: Regras de validação e segurança para prevenir vulnerabilidades comuns.

## Tecnologias Utilizadas

- **Java 11**
- **Spring Boot**
- **Spring Security**: Implementação de autenticação e controle de acesso.
- **JWT (JSON Web Tokens)**: Gerenciamento de autenticação e sessões de usuários.
- **BCrypt**: Criptografia de senhas dos usuários.
- **Lombok**: Para reduzir a verbosidade do código.
- **MySQL**: Banco de dados utilizado para armazenar dados de usuários e tarefas.

## Instalação

1. Clone o repositório:
    ```bash
    git clone https://github.com/seu-usuario/dailytask-api.git
    ```

2. Configure o banco de dados no arquivo `application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/dailytask
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
    spring.jpa.hibernate.ddl-auto=update
    ```

3. Configure a chave secreta JWT no arquivo `application.properties`:
    ```properties
    jwt.secret=sua_chave_secreta
    ```

4. Execute a aplicação:
    ```bash
    mvn spring-boot:run
    ```

## Endpoints Principais

### Autenticação

- `POST /auth/register`: Registrar novo usuário.
- `POST /auth/login`: Autenticar usuário e receber o token JWT.

### Usuários

- `GET /users`: Listar todos os usuários (apenas administradores).
- `PUT /users/{id}`: Atualizar dados de um usuário.
- `DELETE /users/{id}`: Excluir um usuário.

### Tarefas

- `GET /tasks`: Listar todas as tarefas do usuário autenticado.
- `POST /tasks`: Criar uma nova tarefa.
- `PUT /tasks/{id}`: Atualizar uma tarefa existente.
- `DELETE /tasks/{id}`: Excluir uma tarefa.
- `PUT /tasks/{id}/complete`: Marcar uma tarefa como concluída.

## Segurança

- Todos os endpoints, exceto `/auth/register` e `/auth/login`, são protegidos e requerem autenticação via JWT.
- O token JWT deve ser incluído no cabeçalho de todas as requisições protegidas:
    ```
    Authorization: Bearer {seu_token_jwt}
    ```

## Contribuição

1. Faça um fork do projeto.
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`).
3. Commit suas mudanças (`git commit -m 'Adiciona nova feature'`).
4. Faça o push para a branch (`git push origin feature/nova-feature`).
5. Abra um Pull Request.

