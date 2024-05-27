# Fase 3 Capitulo 8

## Como rodar a aplicacao

### Ferramentas necessarias

- Java 21
- Maven
- Docker, Docker Compose

#### Na raiz do projeto rode


- Define como variable de ambiente da sua maquina as variaveis `USER_NAME` e `USER_PASSWORD`:
  - `export USER_NAME='user'`
  - `export USER_PASSWORD='password'`
- `mvn clean package`
- `docker-compose up --build -d`

Exemplo de curl para fazer uma requisicao:

```shell
curl --location --request POST 'http://localhost:8081/api/waste-collections' \
--header 'Authorization: Basic <user_and_password_encoded_in_base64>' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=8A0551B1DB47808DA731CA28EA9DCBB9' \
--data-raw '{
"type": "recyclable",
"location": "Sector 9"
}'
```# fase3-capitulo8
