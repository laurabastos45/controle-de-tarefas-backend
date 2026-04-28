# 🔐 Controle de Tarefas — Backend

API REST responsável pela autenticação de usuários e gerenciamento de tarefas do sistema **Controle de Tarefas**.

Este repositório contém exclusivamente o backend da aplicação, desenvolvido com Spring Boot.

---

## 🧠 Visão Geral

O backend é responsável por:

* Cadastro de usuários
* Autenticação (login)
* Persistência de dados em banco relacional
* Fornecimento de endpoints para o frontend

---

## 🏗️ Arquitetura

A aplicação segue uma estrutura em camadas:

* **Controller** → recebe as requisições HTTP
* **Service** → contém as regras de negócio
* **Repository** → acesso ao banco de dados
* **Entity** → representação das tabelas

---

## ⚙️ Tecnologias

* Java 17
* Spring Boot
* Spring Data JPA
* MySQL
* Maven

---

## 🔗 Integração

* 🔹 Backend (deploy):
  👉 https://controle-de-tarefas-backend-1.onrender.com

* 🔹 Frontend:
  👉 https://controle-de-tarefas-sage.vercel.app/

---

## 🔐 Endpoints

### Cadastro

```http
POST /auth/register
```

### Login

```http
POST /auth/login
```

---

## ▶️ Execução local

```bash
git clone https://github.com/laurabastos45/controle-de-tarefas-backend
cd controle-de-tarefas-backend
mvn spring-boot:run
```

A aplicação será iniciada em:

```
http://localhost:8080
```

---

## 📌 Observação

O campo `email` enviado pelo frontend é utilizado como `login` no banco de dados.

---

## 👩‍💻 Autora

Ana Laura Bastos
Estudante de Análise e Desenvolvimento de Sistemas
