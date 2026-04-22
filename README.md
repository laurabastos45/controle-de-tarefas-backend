🔐 Controle de Tarefas — Backend

API REST responsável pela autenticação de usuários e gerenciamento de tarefas do sistema Controle de Tarefas.

Este repositório contém exclusivamente o backend da aplicação, desenvolvido com Spring Boot.

🧠 Visão Geral

O backend é responsável por:

Cadastro de usuários
Autenticação (login)
Persistência de dados em banco relacional
Fornecimento de endpoints para o frontend
🏗️ Arquitetura

A aplicação segue uma estrutura baseada em camadas:

Controller → recebe as requisições HTTP
Service → contém as regras de negócio
Repository → acesso ao banco de dados
Entity → representação das tabelas
⚙️ Tecnologias
Java 17+
Spring Boot
Spring Data JPA
MySQL
Maven
🔗 Integração com Frontend

O frontend da aplicação está em outro repositório:

👉 https://github.com/laurabastos45/controle-de-tarefas

A comunicação é feita via requisições HTTP (REST API).
