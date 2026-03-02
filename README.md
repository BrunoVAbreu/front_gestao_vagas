[JAVA_BADGE]: https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white
[SPRING_BADGE]: https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white
[THYMELEAF_BADGE]: https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white
[MAVEN_BADGE]: https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white

<h1 align="center" style="font-weight: bold;">Gestão de Vagas — Frontend 🖥️</h1>

![java][JAVA_BADGE]
![spring][SPRING_BADGE]
![thymeleaf][THYMELEAF_BADGE]
![maven][MAVEN_BADGE]

<details open="open">
<summary>Índice</summary>

- [📖 Sobre](#about)
- [🔗 Repositórios do Projeto](#repos)
- [🚀 Como executar](#started)
  - [Pré-requisitos](#prerequisites)
  - [Clonando](#cloning)
  - [Variáveis de Ambiente](#env)
  - [Iniciando](#starting)
- [📍 Páginas da Aplicação](#pages)

</details>

<p align="center">
  <b>Interface web para o sistema de Gestão de Vagas desenvolvida com Spring Boot e Thymeleaf. Consome a API REST do backend e oferece telas de login, cadastro, gerenciamento de vagas e candidaturas para empresas e candidatos.</b>
</p>

<h2 id="about">📖 Sobre</h2>

O **Gestão de Vagas Frontend** é uma aplicação Spring Boot com Thymeleaf que atua como camada de apresentação, consumindo a [API REST do backend](https://github.com/seu-usuario/gestao-vagas). Possui fluxos distintos para dois perfis de usuário:

- **Empresa** — login, cadastro, criação e listagem de vagas.
- **Candidato** — login, cadastro, visualização de perfil, busca e candidatura em vagas.

> ⚠️ **O backend precisa estar rodando** antes de iniciar o frontend. Consulte o [repositório do backend](https://github.com/seu-usuario/gestao-vagas) para instruções de execução.

<h2 id="repos">🔗 Repositórios do Projeto</h2>

| Repositório | Descrição |
|-------------|-----------|
| [**Backend**](https://github.com/seu-usuario/gestao-vagas) | API REST com Spring Boot |
| **Frontend** (este repo) | Interface web com Spring Boot + Thymeleaf |

<h2 id="started">🚀 Como executar</h2>

<h3 id="prerequisites">Pré-requisitos</h3>

- [Java 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven](https://maven.apache.org/)
- [Git](https://git-scm.com/)
- Backend do projeto em execução ([ver instruções](https://github.com/seu-usuario/gestao-vagas))

<h3 id="cloning">Clonando</h3>

```bash
git clone https://github.com/seu-usuario/front-gestao-vagas.git
cd front-gestao-vagas
```

<h3 id="env">Variáveis de Ambiente</h3>

As configurações estão em `src/main/resources/application.properties`:

```properties
server.port=8082

# URL da API do backend
host.api.gestao.vagas=http://localhost:8080
```

Altere `host.api.gestao.vagas` se o backend estiver rodando em outro host ou porta.

<h3 id="starting">▶️ Iniciando</h3>

**1. Certifique-se de que o backend está rodando** em `http://localhost:8080`.

**2. Execute o frontend:**

```bash
./mvnw spring-boot:run
```

A aplicação estará disponível em:

```
http://localhost:8082
```

<h2 id="pages">📍 Páginas da Aplicação</h2>

<h3>🏢 Empresa</h3>

| Rota | Descrição |
|------|-----------|
| `/company/login` | Login da empresa |
| `/company/create` | Cadastro de nova empresa |
| `/company/jobs` | Listagem das vagas cadastradas |
| `/company/jobs/create` | Criação de nova vaga |

<h3>👤 Candidato</h3>

| Rota | Descrição |
|------|-----------|
| `/candidate/login` | Login do candidato |
| `/candidate/create` | Cadastro de novo candidato |
| `/candidate/profile` | Perfil do candidato |
| `/candidate/jobs` | Busca e listagem de vagas disponíveis |
