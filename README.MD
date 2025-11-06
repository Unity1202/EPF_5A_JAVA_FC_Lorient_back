# 🧡​ FC Lorient Backend API 🧡​

Ce repo est un backend API pour un site de football du FC Lorient.

Il permet de gérer toutes les données du club : joueurs, matchs, actualités, boutique et forum communautaire. Les utilisateurs peuvent se connecter pour écrire des messages dans le forum et les admins peuvent écrire de nouveaux articles.

*Groupe : Grégoire BRUN, Cornel CRISTEA, Quentin DEHARO, Alexis DHERMY*
<br>*EPF - 5ème année - MIN - 2025*

<img src="https://www.fclorient.bzh/voy_content/uploads/2023/03/logo.svg" width="100" alt="FC Lorient">

## Sommaire :
- [Installations et configurations](#installations-et-configurations)
- [Ce qui a été fait](#ce-qui-a-été-fait)

## Installations et configurations

### 1. Configuration des variables d'environnement
Copiez le fichier `.env.example` dans un fichier `.env` et remplissez-le avec vos credentials :
```bash
DATABASE_NAME=your_database_name
DATABASE_USER=your_database_user
DATABASE_PASSWORD=your_database_password
```

### 2. Création et démarrage de la base de données
Lancez la base de données avec docker compose :
```bash
docker compose up
```

### 3. Lancement du backend
Utilisez maven pour démarrer l'application :
```bash
mvn spring-boot:run
```

### 4. URL du backend
```bash
http://localhost:8080
```
Pour tester si la connexion à la base de données est fonctionnelle, vous pouvez utiliser l'url suivante :
```bash
http://localhost:8080/players
```

### 5. Arrêt des services
Pour stopper la base de données :
```bash
docker compose down
```

## Ce qui a été fait

### Base de données
- **10 tables** créées avec des relations appropriées :
  - `users`, `admins` (gestion des utilisateurs)
  - `players`, `coaches` (équipe et staff)
  - `countries` (nationalités avec drapeaux)
  - `teams` (équipes de la ligue 1)
  - `articles` (actualités du club)
  - `matches` (calendrier des matchs)
  - `forum` (espace de discussion)
  - `store` (boutique officielle)
- **scripts SQL** pour la création et l'insertion des données :
  - [TABLES.sql](initdb/1_TABLES.sql)
  - [INSERT_DATA.sql](initdb/2_INSERT_DATA.sql)
- **données réelles** du fc lorient récupérées depuis le site officiel
- **docker compose** pour une base postgresql facilement déployable

### Architecture backend
- **architecture 3-tiers** respectée :
  - **models** : entités jpa avec annotations
  - **services** : logique métier
  - **controllers** : endpoints rest
- **dto et mappers** pour la conversion sécurisée des données
- **bean** pour charger les variables d'environnement

### API REST
- **10 contrôleurs** avec endpoints complets :
  - `/players` - gestion des joueurs
  - `/coaches` - gestion de l'encadrement
  - `/teams` - gestion des équipes
  - `/articles` - actualités du club
  - `/matches` - calendrier des matchs
  - `/countries` - nationalités
  - `/forum` - discussions
  - `/store` - boutique
  - `/users` - utilisateurs
  - `/admins` - administration
- **opérations crud** complètes (create, read, update, delete)
- **spring boot** avec configuration optimisée

### Documentation
- **README complet** avec instructions d'installation et tâches effectuées