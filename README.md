# Application de Gestion des Étudiants

## Introduction
Ce projet est une application de gestion qui permet de gérer des étudiants, des filières, des rôles et des utilisateurs. Les étudiants héritent des attributs d'un utilisateur, et il est possible d'affecter des étudiants à des filières et d'attribuer des rôles à des utilisateurs.

L'application a été développée en utilisant les technologies et outils suivantes :

- **Spring Boot** : Un framework Java qui simplifie le développement d'applications web et facilite la création de services RESTful.
- **Postman** : Un outil de test d'API qui permet de tester les endpoints de l'application et de vérifier leur fonctionnement.
- **JPQL** (Java Persistence Query Language) : Un langage de requête pour interagir avec la base de données de manière orientée objet.
- **Swagger** : Un outil de documentation d'API qui génère une documentation interactive pour les endpoints de l'application.

## Technologies et Outils Utilisées
### Spring Boot
Spring Boot est un framework Java qui simplifie le développement d'applications en fournissant des solutions prêtes à l'emploi pour les tâches courantes. Il facilite la création de services web RESTful, la gestion de la sécurité, la gestion de la base de données, etc. Dans ce projet, Spring Boot est utilisé pour créer un backend robuste pour notre application.

### Postman
Postman est un outil de test d'API qui permet de tester les endpoints de l'application. Il permet de soumettre des requêtes HTTP aux différentes routes de l'API et de vérifier les réponses. Cela garantit que l'API fonctionne correctement et que les données sont échangées de manière appropriée.

### JPQL (Java Persistence Query Language)
JPQL est un langage de requête pour interagir avec la base de données de manière orientée objet. Il est utilisé pour interroger et manipuler les données stockées dans la base de données de l'application. JPQL permet d'effectuer des opérations de lecture, d'écriture et de mise à jour de données de manière efficace.

### Swagger
Swagger est un outil de documentation d'API qui génère une documentation interactive pour les endpoints de l'application. Il permet aux développeurs et aux utilisateurs de l'API de comprendre comment utiliser l'API, quelles sont les routes disponibles et quels sont les paramètres requis.

## Les taches réalisés

#### La base des données

#### Postman

#### Swagger

## Utilisation

### API Endpoints

Vous pouvez utiliser Postman pour tester les endpoints de l'API. Importez la collection de requêtes Postman fournie dans le répertoire `postman`.

### Documentation Swagger

La documentation Swagger de l'API est accessible à l'adresse `http://localhost:8080/swagger-ui.html`. Vous y trouverez une description complète des endpoints et vous pourrez les tester directement depuis l'interface Swagger.

### Exemples d'Endpoints

- Pour créer un nouvel utilisateur : `POST /api/users`
- Pour affecter un rôle à un utilisateur : `POST /api/users/{userId}/roles`
- Pour créer un nouvel étudiant : `POST /api/students`
- Pour affecter une filière à un étudiant : `POST /api/students/{studentId}/filiere`

## Configuration

- La configuration de la base de données se trouve dans `src/main/resources/application.properties`.
- Les entités et les repositories sont définis dans le package `com.votre.package.model` et `com.votre.package.repository`.
- Les contrôleurs pour gérer les requêtes HTTP se trouvent dans `com.votre.package.controller`.
- Les services métier se trouvent dans `com.votre.package.service`.
