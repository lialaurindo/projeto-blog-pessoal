# Blog Pessoal

![SpringBoot](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot)
![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)
![JUnit5](https://img.shields.io/badge/Junit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![Render](https://img.shields.io/badge/Render-46E3B7?style=for-the-badge&logo=render&logoColor=white)
![Swagger](https://img.shields.io/badge/Swagger-85EA2D?style=for-the-badge&logo=Swagger&logoColor=white)
![Insomnia](https://img.shields.io/badge/Insomnia-5849be?style=for-the-badge&logo=Insomnia&logoColor=white)

<div id='inicio'/> 


## 📖 Sobre o projeto ##

O Blog Pessoal é um projeto guiado proposto pelo bootcamp Pessoa Desenvolvedora Java FullStack da Generation Brasil.
Aqui aplicamos o aprendizado sobre o framework Spring Boot e suas principais funcionalidades na criação de uma API Rest em Java.


##  🧩 Etapas de Desenvolvimento ##
### Back-End:

- Estrutura do projeto utilizando padrão MVC;
- Banco de dados com MySQL;
- Criação dos métodos HTTP para as operações do CRUD;
- Testes de requisição da API com Insomnia;
- Aplica validação de usuário com Spring Security;
- Testes unitários com JUnit;
- Deploy da aplicação com Render;
- Documentação do projeto com o SpringDoc e Swagger;


## Rotas
Métodos para manipulação das postagens do Blog.

| Verbo |                Rota                 |             Descrição da Rota                |    
| :---: | :---------------------------------: | :------------------------------------------: |
|  📖 GET  |      `/postagens`      |       listar todas as postagens do Blog     | 
| 🔍 GET  |   `/postagens/id`    |     consultar postagem específica pelo ID    | 
🔍 GET  |   `postagens/titulo/postagem`    |     listar postagens pelo título    | 
| ➕ POST   |      `/postagens`      | criar uma nova postagem no Blog           | 
| ❌ DELET |    `postagens/id`    | deletar uma postagem                | 
| ✏ PUT| `/postagens` | atualizar uma postagem existente| 



[🔝 Voltar ao início](#inicio)
