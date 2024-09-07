# Application de Gestion de Projets de Construction - ConstructionXpert Services

## Contexte du Projet

En tant que développeur full stack freelance, j'ai été sollicité pour créer une application de gestion de projets de construction pour l’entreprise **ConstructionXpert Services**. Afin d'assurer une meilleure évolutivité, maintenabilité, et résilience, l'application est développée en utilisant une **architecture microservices**. Chaque microservice gère une partie distincte des fonctionnalités de l'application, et les services communiquent entre eux via des API RESTful sécurisées.

## Microservices Identifiés

### 1. API Gateway Service

**Fonctionnalités :**
- Route les requêtes entrantes vers les microservices appropriés.
- Gère les aspects de sécurité et de gestion des API.

### 2. Discovery Service

**Fonctionnalités :**
- Permet aux microservices de s'enregistrer et de découvrir d'autres services via Eureka.

### 3. Service de Gestion des Utilisateurs

**Fonctionnalités :**
- Authentification et autorisation des utilisateurs.
- Gestion des rôles et des permissions.

### 4. Service de Gestion des Projets

**Fonctionnalités :**
- Créer, afficher, mettre à jour, et supprimer des projets.
- Gérer les informations liées aux projets comme le nom, la description, les dates et le budget.

### 5. Service de Gestion des Tâches

**Fonctionnalités :**
- Créer, afficher, mettre à jour, et supprimer des tâches.
- Gérer les détails des tâches comme la description, les dates, le statut et les ressources nécessaires.

### 6. Service de Gestion des Ressources

**Fonctionnalités :**
- Ajouter, afficher, mettre à jour, et supprimer des ressources.
- Gérer les détails des ressources telles que le nom, le type, la quantité et les informations du fournisseur.

## Contraintes Techniques

- **Gateway** : Spring Cloud Gateway
- **Communication Interne entre Services** : OpenFeign
- **Découverte de Service** : Eureka
- **Circuit Breaker** : Resilience4j
- **Tests** : Unit Tests (JUnit & Mockito)
- **Déploiement** : Docker

## Base de Données

Chaque service dispose de sa propre base de données qui stocke des informations spécifiques, assurant ainsi une isolation complète des données et facilitant les migrations et les évolutions indépendantes.

## Gestion des Migrations

Flyway est utilisé pour gérer les migrations de schéma de la base de données. Chaque changement de schéma est versionné et appliqué de manière ordonnée lors des déploiements.

## Instructions pour Exécuter le Projet

1. **Cloner le dépôt** :
    ```bash
    git clone https://github.com/Alaa-eddineLarbaoui/ConstructionXpert-Services-Microservices.git
    ```

2. **Configurer les Services** :
   - Configurer chaque microservice dans ses fichiers `application.yml` respectifs.
   - Vérifier les dépendances entre les services dans le registre Eureka.

3. **Lancer les Microservices** :
    - Utiliser Maven ou Gradle pour compiler et exécuter chaque microservice individuellement.
    - Exemple pour le **Service de Gestion des Projets** :
      ```bash
      cd project-management-service
      ./mvnw spring-boot:run
      ```

4. **Déploiement avec Docker** :
   - Assurez-vous d'avoir Docker installé.
   - Utiliser le fichier `docker-compose.yml` pour démarrer tous les services :
     ```bash
     docker-compose up --build
     ```

## Contact

Pour toute question, vous pouvez contacter l'auteur du projet à [alaaeddinelarbaoui1@gmail.com](mailto:alaaeddinelarbaoui1@gmail.com).
