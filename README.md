# AltF404EShop

## Lancement du projet

1. Cloner le repo
2. Lancer avec `mvn spring-boot:run` ou depuis l’IDE
3. Accès à l’API :
   - `GET /produits`
   - `POST /produits`
   - `PUT /produits/{id}`
   - `DELETE /produits/{id}`

## Swagger

Visitez [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

## Base de données

Utilise H2 : accessible à [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

- JDBC URL : `jdbc:h2:mem:testdb`
