 - - 
 
 <img src="https://media.discordapp.net/attachments/1091365258335113367/1091796460745543680/minas-in-tech-banner.gif?width=1024&height=256"/>
 

<div align="center">

![Java](https://img.shields.io/badge/java-FFD700.svg?style=for-the-badge&logo=java&logoColor=8B008B)
![SpringBoot](https://img.shields.io/badge/Spring_Boot-FFD700?style=for-the-badge&logo=spring-boot&logoColor=8B008B)
![MySQL](https://img.shields.io/badge/MySQL-FFD700?style=for-the-badge&logo=mysql&logoColor=8B008B)
![JUnit5](https://img.shields.io/badge/Junit5-FFD700?style=for-the-badge&logo=junit5&logoColor=8B008B)
![GIT](https://img.shields.io/badge/GIT-FFD700?style=for-the-badge&logo=git&logoColor=8B008B)
![ECLIPSE](https://img.shields.io/badge/Eclipse-FFD700?style=for-the-badge&logo=eclipse&logoColor=8B008B)

</div>
<br> 
<div id='inicio'/> 

*  Documentação: [Swagger](#publicacao)
* Sobre o projeto: [voltando a era dos Blogs](#sobre-projeto)
* Desenvolvimento: [trabalhando no Back-End](#desenvolvimento)
* Funcionalidades: [O que posso fazer com esta API?](#funcionalidades)
* Próximos passos: [o Front-End vem aí!](#proximos-passos)
* Sobre mim: [Oi, eu sou a Lia!](#sobre-mim)

<div id='publicacao'/> 

## Consultas e Publicações:

![Render](https://img.shields.io/badge/Render-8B008B?style=for-the-badge&logo=render&logoColor=FFD700)
![Swagger](https://img.shields.io/badge/Swagger-8B008B?style=for-the-badge&logo=Swagger&logoColor=FFD700)
[![Run in Insomnia}](https://insomnia.rest/images/run.svg)](https://insomnia.rest/run/?label=Minas%20In%20Tech%20&uri=)

<br>
<div id='sobre-projeto'/> 

##  🗨 Sobre o projeto ##

<p align="justify">
<img align="left" src="https://media.discordapp.net/attachments/1091365258335113367/1092135500887883776/minas-in-tech-forum.png?width=500&height=300"/>
<b> Minas In Tech </b> é um Blog proposto como projeto de conclusão do Bloco II do bootcamp da Generation Brasil. Aqui aplicamos o aprendizado sobre o framework Spring e suas principais funcionalidades na criação de uma <b> API Rest em Java.</b> <br>Para personalizar o tema do projeto, inclui a marca do Minas In Tech como base para a criação da aplicação, de modo que pudesse em conjunto com a parte técnica, pensar em outros detalhes criativos e incluir um propósito que estivesse relacionado a mim e a minha realidade como mulher em tecnologia, por isso este blog foi pensado em transmitir assuntos relacionados a esta jornada. A ideia é um ter um espaço, parecido com um fórum, onde as usuárias pudessem incluir dúvidas reais de carreira e que outras usuárias pudessem contribuir nestas discussões, dentro de uma plataforma segura.
</p>

<br>
<div id='desenvolvimento'/> 

##  🟣 Etapas de Desenvolvimento ##
### Back-End:

- [x] Estrutura do projeto utilizando padrão MVC;
- [x] Banco de dados com MySQL;
- [x] Criação dos métodos HTTP para as operações do CRUD;
- [x] Testes de requisição da API com Insomnia;
- [x] Aplica validação de usuário com Spring Security;
- [x] Testes unitários com JUnit;
- [x] Documentação do projeto com o SpringDoc e Swagger;
- [x] Deploy da aplicação com Render;

<br>

<div id='funcionalidades'/> 

## 🟣 Funcionalidades


| **CAMADA**|                FUNÇÃO              |             AÇÕES            |    ✔   |
| :---: | :---------------------------------: | :------------------------------------------: |:------------------------------------------:|
|  **POSTAGEM** |    CRUD para Cadastrar e manipular postagens no Blog      |       Criar, atualizar ou deletar postagens, assim como listar todas as postagens, buscar postagem pelo ID ou palavra-chave (título).    |<img src="https://media.tenor.com/Gl7uJ6sAIK0AAAAM/darcey-spongebob.gif" width="150"/> |
|  **TEMA**  |   CRUD para categorizar postagens com Temas (relacionamento entre tabelas)  |     Criar, atualizar ou deletar temas, assim como listar todos os temas, buscar tema pelo ID ou palavra-chave (descrição).    |<img src="https://media.discordapp.net/attachments/1091365258335113367/1092135501227643060/UglyEminentEidolonhelvum-size_restricted.gif?width=322&height=225" width="150"/> |
| **USUÁRIO**  |   CRUD para utilizar usuários em Login e incluir limites de acesso na aplicação (Spring Security) |     Criar ou atualizar usuários, assim como listar todos os usuários cadastrados, buscar pelo ID ou nome.  | <img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExZGJiNTA0MjZmNzNhMDAwYmI3MGJjY2EwNGYwZDNhYTNhYzdkYWU3YyZjdD1n/WoWm8YzFQJg5i/giphy.gif" alt="drawing" width="150"/>| 

<br> 

## Diagrama de Classes

```mermaid
classDiagram
class Tema {
  - id : Long
  - descricao : String
  - postagem : List ~Postagem~
  + getAll()
  + getById(Long id)
  + getByDescricao(String descricao)
  + postTema(Tema tema)
  + putTema(Tema tema)
  + deleteTema(Long id)
}
class Postagem {
  - id : Long
  - titulo : String
  - texto: String
  - data: LocalDateTime
  - tema : Tema
  - usuario : Usuario
  + getAll()
  + getById(Long id)
  + getByTitulo(String titulo)
  + postPostagem(Postagem postagem)
  + putPostagem(Postagem postagem)
  + deleteTema(Long id)
}
class Usuario {
  - id : Long
  - nome : String
  - usuario : String
  - senha : String
  - foto : String
  - postagem : List ~Postagem~
  + getAll()
  + getById(Long id)
  + autenticarUsuario(UsuarioLogin usuarioLogin)
  + cadastrarUsuario(Usuario usuario)
  + atualizarUsuario(Usuario usuario)
}
class UsuarioLogin{
  - id : Long
  - nome : String
  - usuario : String
  - senha : String
  - foto : String
  - token : String
}
Tema --> Postagem
Usuario --> Postagem
```

<br>

<div id='proximos-passos'/> 

##  🟣 Próximos Passos ##
### Front-End:
Implementar o Front-End do Blog com React, conforme a grade do Bloco III do bootcamp.

<br>

<div id='sobre-mim'/> 

##  🖤 Sobre mim ##

<div>
<h6> <img align="left" src="https://avatars.githubusercontent.com/u/97362216?v=4" width="150"/> Oi, eu sou a Lia! <br> E acredito que tecnologia é isso: <br> criar possilidades, seja onde for! </h6>
 <div align="left">

 <h6> Software Developer ▪ Back-End</h6>
  <a href="https://www.linkedin.com/in/lialaurindo/" target="_blank"><img src="https://img.shields.io/badge/LinkedIn-000000?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>
  <a href="mailto:liamaralaurindo@gmail.com" target="_blank"><img src="https://img.shields.io/badge/Gmail-000000?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>
</div>
</div>

<br>
<br>
<br>

##
<div>

[🔝 Voltar ao início](#inicio)

</div>

- - 
