# AltF404EShop

## Lancement du projet

1. Cloner le repo
2. Lancer avec `mvn spring-boot:run` ou depuis l’IDE en exécutant CatalogueApplication.java
3. Frontend : http://localhost:8080/
4. Accès à l’API :
   - `GET /produits`
   - `POST /produits`
   - `PUT /produits/{id}`
   - `DELETE /produits/{id}`

## Base de données

Utilise H2 : accessible à [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

- JDBC URL : `jdbc:h2:mem:testdb`
- User : sa
- Password : (laisser vide)

## Authentification

La page /admin est protégée par un login.
Utilisez l'identigiant suivant pour vous connecter :
- Username : admin
- Password : motdepasse
