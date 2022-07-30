# Imersão Java - alura-stickers

<p align="center">
<img src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge"/>
</p>

## Sobre o projeto

Este projeto foi desenvolvido juntamente com a Alura na Imersão Java https://www.alura.com.br/imersao-java, com ele pude
aprender novos conceitos de API.

### Aula 01
Construído uma aplicação do zero para consumir a API do IMDb e exibir os filmes mais populares.

API utilizada:
https://raw.githubusercontent.com/alura-cursos/imersao-java/api/TopTVs.json

![Modelo Conceitual](https://github.com/wilson-silva/imersao_java/blob/main/tela1.png)

### Aula 02
Criado um gerador de figurinhas explorando outras bibliotecas nativas do Java, para que possamos enviar por Whatsapp.

![Modelo Conceitual](https://github.com/wilson-silva/imersao_java/blob/main/tela2.png)

### Aula 03
Nesta aula refatoramos o código, usando Programação Orientado a Objetos.

Foi separado as responsibilidades e deixando o código mais coeso e escalável.

Ex: Criação da interface ExtratorDeConteudo onde a partir dela podemos 
consumir dados de outras api, que tenham título e imagem em seu Json.

Usado api da Nasa como exemplo
https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&start_date=2022-06-12&end_date=2022-06-14

### Aula 04
Construído uma API REST para expor nosso próprio conteúdo, utilizando ferramentas profissionais como o Spring Framework e um banco de dados H2.
É possível rodar a aplicação alura-stickers para consumir esta nossa api, gerandando assim as figurinhas das linguagens cadastradas.


![Modelo Conceitual](https://github.com/wilson-silva/imersao_java/blob/main/tela3.png)

### Como executar o projeto

Pré-requisitos:

* Java 17 ou versões superiores.
* Intellj IDEA Community Edition ou sua IDE favorita.
* Controle de versão GIT instalado na sua máquina.
* Banco H2

```bash

# clonar repositório
git clone https://github.com/wilson-silva/imersao_java

# --- Rodar aplicação alura-stickers ---

# entrar na pasta do projeto alura-stickers/src
cd src ou abrir o bash dentro da pasta

# executar o projeto no terminal
javac App.java
java App

#------------------------------------------------------

# --- Rodar aplicação linguagens-api ---

# entrar na pasta do projeto linguagems-api
cd linguagems-api ou abrir o bash dentro da pasta

# executar o projeto
./mvnw spring-boot:run

```

### Técnicas e tecnologias utilizadas
- Java
- Intellij
- Spring Boot
- Maven
- Banco H2
- Flyway


### Autor
Wilson Gimenes da Silva

https://github.com/wilson-silva/imersao_java