# Your backend API

## Set up 
1. Copie-colle le `.env.sample` en `.env`
2. Remplis le fichier `.env` avec les credentials de ton choix
3. Fait un `docker compose up`
4. Rajoute le plugin : [env-file](https://plugins.jetbrains.com/plugin/7861-envfile)
5. Ajoute ton fichier `.env` comme ci-dessous (n'oublie pas d'activer les fichiers cachés)
<img src="img-readme/img.png">
<img src="img-readme/img_1.png">
<img src="img-readme/img_2.png">

## commandes pour la base de données

### lancer la base de données
```bash
docker-compose up -d
```

### arrêter la base de données
```bash
docker-compose down
```

### réinitialiser complètement la base de données (supprime toutes les données)
```bash
docker-compose down -v
docker-compose up -d
```
