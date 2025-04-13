# ⚙️ A Simple App With Liquibase - POC

Este projeto trata-se de uma **Prova de Conceito (POC)** sobre a integração do **Liquibase** em uma aplicação **Spring
Boot 3.4.4** utilizando **Java 17**.

[![GitHub stars](https://img.shields.io/github/stars/matheuscarv69/a-simple-app-with-liquibase-poc?color=7159)](https://github.com/matheuscarv69/a-simple-app-with-liquibase-poc/stargazers)

---

## 🤔 O que é este projeto?

Esse projeto demonstra de forma simples como utilizar o **Liquibase** para versionamento e gerenciamento de alterações
no banco de dados em uma aplicação Java com Spring Boot.

---

## 🛠 Tecnologias utilizadas

- Java 17
- Spring Boot 3.4.4
    - Spring Web
    - Spring Data JPA
    - Spring Boot DevTools
- Liquibase
- PostgreSQL
- Lombok
- Docker & Docker Compose

---

## 🐳 Executando com Docker

O projeto já possui um arquivo `docker-compose.yml` para subir um banco PostgreSQL configurado com os parâmetros
necessários para rodar a aplicação localmente.

### ✅ Pré-requisitos

- [Docker](https://www.docker.com/products/docker-desktop)
- [Docker Compose](https://docs.docker.com/compose/install/)

### ▶️ Subindo o banco de dados

```bash
docker-compose up -d
```

O banco estará disponível em:

```
jdbc:postgresql://localhost:5432/liquibasedb
```

---

## 🔁 Comandos Liquibase

Abaixo estão alguns exemplos de comandos úteis para executar **rollback** com o Liquibase.

---

### 🔙 Rollback do último changeset

Esse comando desfaz **a última alteração** aplicada ao banco de dados.

```bash
mvn liquibase:rollback   -Dliquibase.changeLogFile=src/main/resources/db/changelog/db.changelog-master.yaml   -Dliquibase.url=jdbc:postgresql://localhost:5432/liquibasedb   -Dliquibase.rollbackCount=1   -Dliquibase.username=user   -Dliquibase.password=password
```

#### 📝 Explicação

- `rollbackCount=1`: reverte apenas o último changeset aplicado.
- `changeLogFile`: arquivo principal de changelog do projeto.
- `url`, `username`, `password`: informações de acesso ao banco.

---

### 🏷️ Rollback até uma tag específica

Esse comando reverte todas as alterações aplicadas **após uma tag específica** definida no changelog.

```bash
mvn liquibase:rollback   -Dliquibase.changeLogFile=src/main/resources/db/changelog/db.changelog-master.yaml   -Dliquibase.url=jdbc:postgresql://localhost:5432/liquibasedb   -Dliquibase.username=user   -Dliquibase.password=password   -Dliquibase.rollbackTag=001-tag-create-teacher
```

#### 📝 Explicação

- `rollbackTag=001-tag-create-teacher`: define até onde o rollback será executado, mantendo as alterações anteriores à
  tag.
- Ideal para desfazer múltiplas mudanças de uma só vez.

---

## 📁 Organização do projeto

```bash
src
└── main
    ├── java
    │   └── com.matheuscarv69.liquibase_poc
    │       ├── application
    │       │   └── controller
    │       └── domain
    │           ├── model
    │           ├── repository
    │           └── service
    └── resources
        ├── application.properties
        ├── liquibase.properties
        └── db
            └── changelog
                ├── db.changelog-master.yaml
                ├── changes
                └── datas

```

---

## 👨🏻‍💻 Autor

<a href="https://github.com/matheuscarv69">
  <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/55814214?s=460&v=4" width="100px;" alt="Matheus Carvalho"/>
  <br />
  <sub><b>Matheus Carvalho</b></sub>
</a>  
<br />
Feito com por Matheus Carvalho, entre em contato:

<p align="left">
  <a href="mailto:matheus9126@gmail.com" target="_blank">
    <img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white"/>
  </a>
  <a href="https://www.linkedin.com/in/matheus-carvalho69/" target="_blank">
    <img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white"/>
  </a>
  <a href="https://www.instagram.com/_mmcarvalho/" target="_blank">
    <img src="https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white"/>
  </a>
</p>