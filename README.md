# ConstructionXpert Services - Application de Gestion de Projets de Construction

## Contexte du Projet

En tant que développeur full stack freelance, j'ai été sollicité pour créer une application de gestion de projets de construction pour l'entreprise **ConstructionXpert Services**. Pour assurer une meilleure évolutivité, maintenabilité, et résilience, l'application est développée en utilisant une architecture microservices. Chaque microservice gère une partie distincte des fonctionnalités de l'application et les services communiquent entre eux via des API RESTful sécurisées.

## Microservices Identifiés

### 1. Service de Gestion des Projets

**Fonctionnalités :**
- Créer un nouveau projet avec son nom, sa description, sa date de début, sa date de fin, et son budget.
- Afficher la liste des projets existants avec leurs détails.
- Mettre à jour les détails d'un projet existant.
- Supprimer un projet existant.

### 2. Service de Gestion des Tâches

**Fonctionnalités :**
- Créer une nouvelle tâche en spécifiant sa description, sa date de début, sa date de fin, son statut (à faire, en cours, terminé) et les ressources nécessaires.
- Afficher la liste des tâches associées à un projet avec leurs détails.
- Mettre à jour les détails d'une tâche existante.
- Supprimer une tâche existante.

### 3. Service de Gestion des Ressources

**Fonctionnalités :**
- Ajouter de nouvelles ressources avec leurs détails tels que le nom, le type, la quantité, et les informations du fournisseur.
- Afficher la liste des ressources disponibles avec leurs détails.
- Mettre à jour les détails d'une ressource existante.
- Supprimer une ressource existante.

## Base de Données

Chaque service dispose de sa propre base de données qui stocke des informations spécifiques, assurant ainsi une isolation complète des données et facilitant les migrations et les évolutions indépendantes.

## Gestion des Migrations

Flyway est utilisé pour gérer les migrations de schéma de la base de données. Chaque changement de schéma est versionné et appliqué de manière ordonnée lors des déploiements.

## Bonus: Implémentation du Service Registry/Discovery (Eureka)

**Responsabilités :**
Le Service Registry est un composant central qui permet aux microservices de s'enregistrer et de découvrir les autres services au sein de l'application. Cela permet une communication dynamique et flexible entre les microservices, tout en simplifiant la gestion des adresses des services.
