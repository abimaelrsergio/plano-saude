<a name="readme-top"></a>


# Olá, eu sou a Abimael Sergio! 👋


## 🚀 Sobre mim
Com mais de 20 anos de experiência em engenharia de software, sou um desenvolvedor Java proativo e responsável com foco em sistemas web. Tenho forte conhecimento técnico e um histórico de entrega de sistemas sólidos que aumentam a receita. Estou fazendo Doutorado em Informática e Gestão do Conhecimento pela Uninove, onde pesquiso dinâmica evolutiva para jogos populacionais baseados em autômatos celulares e algoritmos genéticos.

Trabalho como Java Engineer, utilizo Java (Spring Boot) para criar soluções inovadoras e escaláveis para diversos projetos. Estou constantemente me atualizando com as mais novas tecnologias e conceitos do mercado para oferecer a melhor solução possível para os clientes. Sou apaixonado por aprender novas habilidades e resolver problemas desafiadores.

## 🛠 Habilidades
Hard Skills:\
• Backend: Java, Spring Boot, Spring Data JPA.\
• Frontend: HTML, CSS, Bootstrap, JavaScript, Angular.\
• Aprendendo: AWS, Docker e Kubernetes.\
• Banco de dados: PostgreSQL, MongoDB, MySQL, Oracle, Microsoft SQL Server, DB2.\
• Controle de versão: Git.\
• Sistemas operacionais: Linux, Windows.\
• Mestrado em Informática.\
\
Soft Skills: \
• Curiosidade.\
• trabalho em equipe.\
• proativo.\
• autodidata.



## Outras seções comuns em perfis do GitHub
👩‍💻 Trabalho atualmente na [Turing.com](https://www.turing.com/)

🧠 Estou aprendendo AWS

👯‍♀️ Procuro colaborar no projeto Spring Security

📫 Entre em contato abimaelr.sergio@gmail.com


## 🔗 Links
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/abimaelsergio)

## Feedback

Se você tiver algum feedback, por favor nos deixe saber por meio de abimaelr.sergio@gmail.com


## Autores

- [@abimaelrsergio](https://github.com/abimaelrsergio)


## Licença

[MIT](https://choosealicense.com/licenses/mit/)

### GitHub Stats

![GitHub Stats](https://github-readme-stats.vercel.app/api?username=abimaelrsergio&theme=transparent&bg_color=000&border_color=30A3DC&show_icons=true&icon_color=30A3DC&title_color=E94D5F&text_color=FFF)
![Top Langs](https://github-readme-stats-git-masterrstaa-rickstaa.vercel.app/api/top-langs/?username=abimaelrsergio&layout=compact&bg_color=000&border_color=30A3DC&title_color=E94D5F&text_color=FFF)

# Plano de Saúde
Aplicação criada com Java e Spring Boot para fornecer uma API REST que mantém o cadastro de beneficiários do um plano de saúde.

## 🛠 Tecnologias
As seguintes ferramentas foram usadas na construção do projeto:

- [Java](<https://www.oracle.com/java/technologies/downloads/>)
- [SpringBoot](<https://spring.io/projects/spring-boot/>)
- [H2](<https://www.h2database.com/>)
- [Spring-data-jpa](<https://spring.io/projects/spring-data-jpa/>)
- [OAuth 2.0 Resource Server](<https://docs.spring.io/spring-security/reference/servlet/oauth2/resource-server/index.html>)
- [Spring Security](<https://docs.spring.io/spring-security/reference/index.html>)
- [JPA](<https://spring.io/guides/gs/accessing-data-jpa/>)
- [modelmapper](<https://modelmapper.org/>)
- [Docker](<https://www.docker.com/>)

## 🚀 Como rodar a aplicação
#### Clone este repositório
```bash
$ git clone https://github.com/abimaelrsergio/plano-saude.git
```

#### Acesse a pasta do projeto no terminal/cmd
```bash
$ cd plano-saude
```

##### Instale as dependências
```bash
$ mvn install
```

#### Execute a aplicação
```bash
$ mvnw spring-boot:run
```

#### Execute a aplicação com Docker
```bash
$ mvnw spring-boot:build-image -DskipTests
$ docker run -p 8080:8080 abimael/cadastro:0.0.1-SNAPSHOT
```

#### Checar se está rodando e parar o Docker
```bash
$ docker container ps
$ docker container stop <CONTAINER ID>
```

<p align="right">(<a href="#readme-top">Inicio</a>)</p>

## 📖 Documentation
A documentação dos endpoints pode ser vista no Swagger
```bash
http://localhost:8080/swagger-ui/index.html
````
ou
```bash
http://localhost:8080/v3/api-docs
```
<p align="right">(<a href="#readme-top">Inicio</a>)</p>

## Testando EndPoints

#### Obtenha um token:
```bash
curl --location 'localhost:8080/authenticate' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=26C0617F6B46001891C598D3AF93E20A' \
--data '{
    "username": "admin",
    "password": "admin"
}'
```
<p align="right">(<a href="#readme-top">Inicio</a>)</p>

#### Cadastrar um beneficiário junto com seus documentos;
```bash
curl --location 'localhost:8080/plano-saude/beneficiarios' \
--header 'Content-Type: application/json' \
--header 'Authorization: Bearer eyJraWQiOiJmOTc5YTZjOS0xZjlmLTRjNjItYmE4OC1lZTc4ZDc3MjMxZWUiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJzZWxmIiwic3ViIjoiYWRtaW4iLCJleHAiOjE3MDYxMDkxMjQsImlhdCI6MTcwNjEwMzcyNCwic2NvcGUiOiJST0xFX0FETUlOIFJPTEVfVVNFUiJ9.lamftPbZJUOiNl6kPzkhgOwJwFPYmFFCzI3M0jt5E1ahBA-Bplhm5qKh_UqWHlwJ1m6ICrmagg0Qy9WetYTn8xev0zdg46eq47ZSjaKwTz2f9sy_Q5DP4mFOKAStK5KS_edOcolOcQNQ1GRohpbvM-TvNFn45k7bweHgYYf3IFSYH_iDKcP7s4ENVmUrrIxvoZKZGl1havgv683gnPqpG9QJcyVyCaedKkhcmsAb-ThgYYJWs8x6vbs3XRbP09qVsLdXylyLV7ZQvwsb5FBvfYwWhYbz5qbYeeSJkV4XvZ5xv4r0EGUq49_KuB-KLBv7uhPXSg_CwHZqGesMyXUqxQ' \
--header 'Cookie: JSESSIONID=26C0617F6B46001891C598D3AF93E20A' \
--data '{
    "nome": "Gigi Sergio",
    "telefone": "11996217979",
    "dataNascimento": "2024-01-22",
    "dataInclusao": "2024-01-22",
    "dataAtualizacao": "2024-01-22",
    "documentos": [
        {
            "tipoDocumento": "RG",
            "descricao": "Registro geral",
            "dataInclusao": "2024-01-22",
            "dataAtualizacao": "2024-01-22"
        },
        {
            "tipoDocumento": "CPF",
            "descricao": "Certificado de pessoa física",
            "dataInclusao": "2024-01-22",
            "dataAtualizacao": "2024-01-22"
        },
        {
            "tipoDocumento": "CNH",
            "descricao": "Carteira nacional de habilitação",
            "dataInclusao": "2024-01-22",
            "dataAtualizacao": "2024-01-22"
        }                
    ]
}'
```
<p align="right">(<a href="#readme-top">Inicio</a>)</p>

#### Listar todos os beneficiários cadastrados;
```bash
curl --location 'localhost:8080/plano-saude/beneficiarios' \
--header 'Authorization: Bearer eyJraWQiOiJmOTc5YTZjOS0xZjlmLTRjNjItYmE4OC1lZTc4ZDc3MjMxZWUiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJzZWxmIiwic3ViIjoiYWRtaW4iLCJleHAiOjE3MDYxMDkxMjQsImlhdCI6MTcwNjEwMzcyNCwic2NvcGUiOiJST0xFX0FETUlOIFJPTEVfVVNFUiJ9.lamftPbZJUOiNl6kPzkhgOwJwFPYmFFCzI3M0jt5E1ahBA-Bplhm5qKh_UqWHlwJ1m6ICrmagg0Qy9WetYTn8xev0zdg46eq47ZSjaKwTz2f9sy_Q5DP4mFOKAStK5KS_edOcolOcQNQ1GRohpbvM-TvNFn45k7bweHgYYf3IFSYH_iDKcP7s4ENVmUrrIxvoZKZGl1havgv683gnPqpG9QJcyVyCaedKkhcmsAb-ThgYYJWs8x6vbs3XRbP09qVsLdXylyLV7ZQvwsb5FBvfYwWhYbz5qbYeeSJkV4XvZ5xv4r0EGUq49_KuB-KLBv7uhPXSg_CwHZqGesMyXUqxQ' \
--header 'Cookie: JSESSIONID=26C0617F6B46001891C598D3AF93E20A'
```
<p align="right">(<a href="#readme-top">Inicio</a>)</p>

#### Listar todos os documentos de um beneficiário a partir de seu id;
```bash
curl --location 'localhost:8080/plano-saude/beneficiarios/1/documentos' \
--header 'Authorization: Bearer eyJraWQiOiJmOTc5YTZjOS0xZjlmLTRjNjItYmE4OC1lZTc4ZDc3MjMxZWUiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJzZWxmIiwic3ViIjoiYWRtaW4iLCJleHAiOjE3MDYxMDkxMjQsImlhdCI6MTcwNjEwMzcyNCwic2NvcGUiOiJST0xFX0FETUlOIFJPTEVfVVNFUiJ9.lamftPbZJUOiNl6kPzkhgOwJwFPYmFFCzI3M0jt5E1ahBA-Bplhm5qKh_UqWHlwJ1m6ICrmagg0Qy9WetYTn8xev0zdg46eq47ZSjaKwTz2f9sy_Q5DP4mFOKAStK5KS_edOcolOcQNQ1GRohpbvM-TvNFn45k7bweHgYYf3IFSYH_iDKcP7s4ENVmUrrIxvoZKZGl1havgv683gnPqpG9QJcyVyCaedKkhcmsAb-ThgYYJWs8x6vbs3XRbP09qVsLdXylyLV7ZQvwsb5FBvfYwWhYbz5qbYeeSJkV4XvZ5xv4r0EGUq49_KuB-KLBv7uhPXSg_CwHZqGesMyXUqxQ' \
--header 'Cookie: JSESSIONID=26C0617F6B46001891C598D3AF93E20A'
```
<p align="right">(<a href="#readme-top">Inicio</a>)</p>

#### Atualizar os dados cadastrais de um beneficiário;
```bash
curl --location --request PUT 'localhost:8080/plano-saude/beneficiarios/1' \
--header 'Content-Type: application/json' \
--header 'Authorization: Bearer eyJraWQiOiJmOTc5YTZjOS0xZjlmLTRjNjItYmE4OC1lZTc4ZDc3MjMxZWUiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJzZWxmIiwic3ViIjoiYWRtaW4iLCJleHAiOjE3MDYxMDkxMjQsImlhdCI6MTcwNjEwMzcyNCwic2NvcGUiOiJST0xFX0FETUlOIFJPTEVfVVNFUiJ9.lamftPbZJUOiNl6kPzkhgOwJwFPYmFFCzI3M0jt5E1ahBA-Bplhm5qKh_UqWHlwJ1m6ICrmagg0Qy9WetYTn8xev0zdg46eq47ZSjaKwTz2f9sy_Q5DP4mFOKAStK5KS_edOcolOcQNQ1GRohpbvM-TvNFn45k7bweHgYYf3IFSYH_iDKcP7s4ENVmUrrIxvoZKZGl1havgv683gnPqpG9QJcyVyCaedKkhcmsAb-ThgYYJWs8x6vbs3XRbP09qVsLdXylyLV7ZQvwsb5FBvfYwWhYbz5qbYeeSJkV4XvZ5xv4r0EGUq49_KuB-KLBv7uhPXSg_CwHZqGesMyXUqxQ' \
--header 'Cookie: JSESSIONID=26C0617F6B46001891C598D3AF93E20A' \
--data ' {
        "id": 1,
        "nome": "Gigi Sergio",
        "telefone": "11996217979",
        "dataNascimento": "2024-01-22",
        "dataInclusao": "2024-01-22",
        "dataAtualizacao": "2024-01-22",
        "documentos": [
            {
                "id": 3,
                "tipoDocumento": "CNH",
                "descricao": "2 Carteira nacional de habilitação",
                "dataInclusao": "2024-01-22",
                "dataAtualizacao": "2024-01-22"
            },
            {
                "id": 1,
                "tipoDocumento": "CPF",
                "descricao": "2 Certificado de pessoa física",
                "dataInclusao": "2024-01-22",
                "dataAtualizacao": "2024-01-22"
            },
            {
                "id": 2,
                "tipoDocumento": "RG",
                "descricao": "3 Registro geral",
                "dataInclusao": "2024-01-22",
                "dataAtualizacao": "2024-01-22"
            }
        ]
    }'
```
<p align="right">(<a href="#readme-top">Inicio</a>)</p>

#### Remover um beneficiário.  
```bash
curl --location --request DELETE 'localhost:8080/plano-saude/beneficiarios/99999' \
--header 'Authorization: Bearer eyJraWQiOiJmOTc5YTZjOS0xZjlmLTRjNjItYmE4OC1lZTc4ZDc3MjMxZWUiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJzZWxmIiwic3ViIjoiYWRtaW4iLCJleHAiOjE3MDYxMDkxMjQsImlhdCI6MTcwNjEwMzcyNCwic2NvcGUiOiJST0xFX0FETUlOIFJPTEVfVVNFUiJ9.lamftPbZJUOiNl6kPzkhgOwJwFPYmFFCzI3M0jt5E1ahBA-Bplhm5qKh_UqWHlwJ1m6ICrmagg0Qy9WetYTn8xev0zdg46eq47ZSjaKwTz2f9sy_Q5DP4mFOKAStK5KS_edOcolOcQNQ1GRohpbvM-TvNFn45k7bweHgYYf3IFSYH_iDKcP7s4ENVmUrrIxvoZKZGl1havgv683gnPqpG9QJcyVyCaedKkhcmsAb-ThgYYJWs8x6vbs3XRbP09qVsLdXylyLV7ZQvwsb5FBvfYwWhYbz5qbYeeSJkV4XvZ5xv4r0EGUq49_KuB-KLBv7uhPXSg_CwHZqGesMyXUqxQ' \
--header 'Cookie: JSESSIONID=26C0617F6B46001891C598D3AF93E20A'
```
<p align="right">(<a href="#readme-top">Inicio</a>)</p>

## Contato

Abimael Sergio - [@linkedin](https://www.linkedin.com/in/abimaelsergio/) - abimaelr.sergio@gmail.com

<p align="right">(<a href="#readme-top">Inicio</a>)</p>


