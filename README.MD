# 🧡​ FC Lorient Backend API 🧡​

## Installation et Configurations

### 1. Configuration des variables d'environnement
Copiez le fichier `env.example` dans un fichier `.env` et remplissez-le avec vos credentials :
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

<img src="https://www.fclorient.bzh/voy_content/uploads/2023/03/logo.svg" width="100" alt="FC Lorient">