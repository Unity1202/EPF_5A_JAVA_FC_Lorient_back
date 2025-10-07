-- script d'insertion de données pour les tables

-- 1. insertion des administrateurs (admins)
insert into admins (firstName, lastName, email, password) values
('Admin', 'Admin', 'admin@football.fr', 'admin123');

-- 2. insertion des pays (countries)
insert into countries (name, flag) values
('france', 'https://www.fclorient.bzh/voy_content/themes/fclorient_v2/img/flags/fr.png'),
('sénégal', 'https://www.fclorient.bzh/voy_content/themes/fclorient_v2/img/flags/sn.png'),
('suisse', 'https://www.fclorient.bzh/voy_content/themes/fclorient_v2/img/flags/ch.png'),
('brésil', 'https://www.fclorient.bzh/voy_content/themes/fclorient_v2/img/flags/br.png'),
('tunisie', 'https://www.fclorient.bzh/voy_content/themes/fclorient_v2/img/flags/tn.png'),
('côte d''ivoire', 'https://www.fclorient.bzh/voy_content/themes/fclorient_v2/img/flags/ci.png'),
('ghana', 'https://www.fclorient.bzh/voy_content/themes/fclorient_v2/img/flags/gh.png'),
('burkina faso', 'https://www.fclorient.bzh/voy_content/themes/fclorient_v2/img/flags/bf.png'),
('cameroun', 'https://www.fclorient.bzh/voy_content/themes/fclorient_v2/img/flags/cm.png'),
('grèce', 'https://www.fclorient.bzh/voy_content/themes/fclorient_v2/img/flags/gr.png'),
('angleterre', 'https://www.fclorient.bzh/voy_content/themes/fclorient_v2/img/flags/gb.png'),
('togo', 'https://www.fclorient.bzh/voy_content/themes/fclorient_v2/img/flags/tg.png'),
('norvège', 'https://www.fclorient.bzh/voy_content/themes/fclorient_v2/img/flags/no.png'),
('bénin', 'https://www.fclorient.bzh/voy_content/themes/fclorient_v2/img/flags/bj.png');

-- 3. insertion des équipes (teams)
insert into teams (name, shortName, crest, rank, points, played, won, drawn, lost, diff) values
('Paris-SG', 'PSG', 'https://www.fclorient.bzh/voy_content/uploads/2015/11/psg-logo-489x489.png', 1, 16, 7, 5, 1, 1, 8),
('Marseille', 'OM', 'https://www.fclorient.bzh/voy_content/uploads/2015/11/logo_olympique_de_marseille.png', 2, 15, 7, 5, 0, 2, 10),
('Strasbourg', 'Strasbourg', 'https://www.fclorient.bzh/voy_content/uploads/2020/07/1200px-racing_club_de_strasbourg_alsace_rc_strasbourg_-_rcs_-_rcsa_logo_officiel.svg-510x510.png', 3, 15, 7, 5, 0, 2, 7),
('Lyon', 'OL', 'https://www.fclorient.bzh/voy_content/uploads/2015/11/olympique_lyonnais_logo.svg-e1483454405949.png', 4, 15, 7, 5, 0, 2, 4),
('AS Monaco', 'Monaco', 'https://www.fclorient.bzh/voy_content/uploads/2015/11/logo-asm.png', 5, 13, 7, 4, 1, 2, 4),
('RC Lens', 'Lens', 'https://www.fclorient.bzh/voy_content/uploads/2017/06/LOGO_RCLENS_120_ANS-424x600.png', 6, 13, 7, 4, 1, 2, 4),
('Lille', 'LOSC', 'https://www.fclorient.bzh/voy_content/uploads/2015/11/logo-losc-600x571.png', 7, 11, 7, 3, 2, 2, 4),
('Paris FC', 'Paris FC', 'https://www.fclorient.bzh/voy_content/uploads/2017/07/paris-fc-513x600.png', 8, 10, 7, 3, 1, 3, -1),
('Toulouse', 'TFC', 'https://www.fclorient.bzh/voy_content/uploads/2015/11/logo-quadri-489x489.png', 9, 10, 7, 3, 1, 3, -1),
('Rennes', 'Rennes', 'https://www.fclorient.bzh/voy_content/uploads/2016/06/rennes.png', 10, 10, 7, 2, 4, 1, -1),
('Brest', 'Brest', 'https://www.fclorient.bzh/voy_content/uploads/2017/06/396px-logo_stade_brestois.svg.png', 11, 8, 7, 2, 2, 3, 0),
('OGC Nice', 'Nice', 'https://www.fclorient.bzh/voy_content/uploads/2015/11/ogc-nice-e1482340704762.png', 12, 8, 7, 2, 2, 3, -3),
('FC Lorient', 'Lorient', 'https://www.fclorient.bzh/voy_content/uploads/2023/03/logo.svg', 13, 7, 7, 2, 1, 4, -7),
('Le Havre', 'Le Havre', 'https://www.fclorient.bzh/voy_content/uploads/2017/06/le-havre-ac.png', 14, 6, 7, 1, 3, 3, -2),
('FC Nantes', 'Nantes', 'https://www.fclorient.bzh/voy_content/uploads/2015/11/803px-fc_nantes_2019_logo.svg-471x600.png', 15, 6, 7, 1, 3, 3, -2),
('Auxerre', 'Auxerre', 'https://www.fclorient.bzh/voy_content/uploads/2017/06/auxerre_logo-474x600.png', 16, 6, 7, 2, 0, 5, -5),
('Angers', 'Angers', 'https://www.fclorient.bzh/voy_content/uploads/2015/11/logo_angers_sco_-_2021.svg-504x600.png', 17, 5, 7, 1, 2, 4, -8),
('Metz', 'Metz', 'https://www.fclorient.bzh/voy_content/uploads/2016/06/fc_metz_2021_logo.svg-420x600.png', 18, 2, 7, 0, 2, 5, -11);

-- 4. insertion des entraineurs (coachs)
insert into coachs (firstName, lastName, dateOfBirth, nationality, crest) values
('Olivier', 'Pantaloni', '1966-12-13', 1, 'https://www.fclorient.bzh/voy_content/uploads/2024/07/pantaloni-360x600.png');

-- 5. insertion des joueurs (players) - fc lorient
insert into players (firstName, lastName, position, dateOfBirth, shirtNumber, nationality, crest) values
-- gardiens
('Benjamin', 'Leroy', 'gardien', '1989-04-07', 1, 1, 'https://www.fclorient.bzh/voy_content/uploads/2024/07/leroy-360x600.png'),
('Bingourou', 'Kamara', 'gardien', '1996-10-21', 21, 2, 'https://www.fclorient.bzh/voy_content/uploads/2024/07/kamara-360x600.png'),
('Yvon', 'Mvogo', 'gardien', '1994-06-06', 38, 3, 'http://fclorient.bzh/voy_content/uploads/2022/07/Mvogo-2-360x600.png'),

-- défenseurs
('Igor', 'Silva', 'défenseur', '1996-08-21', 2, 4, 'https://www.fclorient.bzh/voy_content/uploads/2024/07/silva-360x600.png'),
('Montassar', 'Talbi', 'défenseur', '1998-05-26', 3, 5, 'https://www.fclorient.bzh/voy_content/uploads/2024/07/talbi-360x600.png'),
('Bamo', 'Meité', 'défenseur', '2001-06-20', 5, 6, 'https://www.fclorient.bzh/voy_content/uploads/2022/07/Bamo-Meite-360x600.png'),
('Faye', 'Abdoulaye', 'défenseur', '2004-09-22', 25, 2, 'https://www.fclorient.bzh/voy_content/uploads/2024/07/Faye-360x600.png'),
('Nathaniel', 'Adjei', 'défenseur', '2002-08-21', 32, 7, 'https://www.fclorient.bzh/voy_content/uploads/2024/07/adjei-360x600.png'),
('Arsène', 'Kouassi', 'défenseur', '2004-09-11', 43, 8, 'https://www.fclorient.bzh/voy_content/uploads/2024/07/kouassi-360x600.png'),
('Darlin', 'Yongwa', 'défenseur', '2000-09-21', 44, 9, 'https://www.fclorient.bzh/voy_content/uploads/2024/07/yongwa-360x600.png'),
('Panos', 'Katseris', 'défenseur', '2001-07-05', 77, 10, 'https://www.fclorient.bzh/voy_content/uploads/2024/07/katseris-360x600.png'),
('Isaak', 'Toure', 'défenseur', '2003-03-28', 95, 1, 'https://www.fclorient.bzh/voy_content/uploads/2022/07/Isaak-Toure-360x600.png'),

-- milieux
('Laurent', 'Abergel', 'milieu', '1993-02-01', 6, 1, 'https://www.fclorient.bzh/voy_content/uploads/2024/07/abergel-360x600.png'),
('Bandiougou', 'Fadiga', 'milieu', '2001-01-15', 7, 1, 'https://www.fclorient.bzh/voy_content/uploads/2024/07/Fadiga-360x600.png'),
('Noah', 'Cadiou', 'milieu', '1998-10-26', 8, 1, 'https://www.fclorient.bzh/voy_content/uploads/2024/07/cadiou-360x600.png'),
('Théo', 'Le Bris', 'milieu', '2002-10-01', 11, 1, 'https://www.fclorient.bzh/voy_content/uploads/2024/07/le-bris-theo-360x600.png'),
('Trevan', 'Sanusi', 'milieu', '2007-04-25', 14, 11, 'https://www.fclorient.bzh/voy_content/uploads/2022/07/trevan-sanusi-360x600.png'),
('Jean-Victor', 'Makengo', 'milieu', '1998-06-12', 17, 1, 'https://www.fclorient.bzh/voy_content/uploads/2024/07/makengo-360x600.png'),
('Dermane', 'Karim', 'milieu', '2003-12-26', 29, 12, 'https://www.fclorient.bzh/voy_content/uploads/2022/07/dermane-karim-360x600.png'),
('Arthur', 'Avom Ebong', 'milieu', '2004-12-15', 62, 9, 'https://www.fclorient.bzh/voy_content/uploads/2024/07/avom-360x600.png'),
('Joel', 'Mvuka', 'milieu', '2002-11-12', 93, 13, 'https://www.fclorient.bzh/voy_content/uploads/2024/07/mvuka-360x600.png'),

-- attaquants
('Mohamed', 'Bamba', 'attaquant', '2001-12-10', 9, 6, 'https://www.fclorient.bzh/voy_content/uploads/2024/07/Mo-Bamba-360x600.png'),
('Pablo', 'Pagis', 'attaquant', '2002-12-29', 10, 1, 'https://www.fclorient.bzh/voy_content/uploads/2024/07/pablo-pagis-360x600.png'),
('Bamba', 'Dieng', 'attaquant', '2000-03-23', 12, 2, 'https://www.fclorient.bzh/voy_content/uploads/2024/07/dieng-360x600.png'),
('Aiyegun', 'Tosin', 'attaquant', '1998-06-26', 15, 14, 'https://www.fclorient.bzh/voy_content/uploads/2024/07/tosin-360x600.png'),
('Sambou', 'Soumano', 'attaquant', '2001-01-03', 28, 1, 'https://www.fclorient.bzh/voy_content/uploads/2024/07/soumano-360x600.png');

-- 6. insertion des matchs (matchs)
insert into matchs (utcDate, status, score_home, score_away, homeTeamId, awayTeamId) values
('2025-10-19 17:15', 'scheduled', null, null, 13, 11),
('2025-10-26 17:15', 'scheduled', null, null, 17, 13),
('2025-10-29 19:00', 'scheduled', null, null, 13, 1),
('2025-09-21 17:15', 'drawn', 1, 1, 14, 13),
('2025-09-27 17:15', 'won', 3, 1, 13, 5),
('2025-10-03 20:45', 'lost', 2, 0, 8, 13);

-- 7. insertion des produits (store)
insert into store (name, description, image, price) values
('MAILLOT HOME 2025/2026', 
'Nous sommes les Damiers, nous sommes les Merlus !

Pour célébrer son centenaire, le FC Lorient arbore cette saison un maillot directement inspiré de ses origines !

On y retrouve ainsi le motif iconique à damier tango et noir, le blason original (un losange avec en son centre un grondin, ancêtre de l’actuel Merlu) et un col vintage comme autant de références à l’histoire du club.

Détail supplémentaire : les mentions "Les Damiers" (1er surnom de nos joueurs) et "Les Merlus" (leur surnom actuel), sont subtilement apposés à l’intérieur des manches.', 
'https://boutique.fclorient.bzh/10477/maillot-home-2025-2026.jpg', 
89.00),
('MAILLOT THIRD 25/26', 
'Le troisième maillot des Merlus pour la saison 2025/2026 !

Une tunique inédite pour une saison particulière, marquée par le retour dans l’élite et la célébration du centenaire du club.

Un maillot noir à l’élégance assumée, orné d’hermines, symboles forts de la Bretagne, embossées en ton sur ton et qui se dévoilent subtilement selon la lumière et l’angle de vue.

Sur la face avant, le logo du centenaire vient inscrire cette saison dans l’histoire du club. Pour valoriser l’ancrage territorial de ce maillot résolument breton, la phrase « N’eus bro all a garan kement barzh ar bed » (« Il n’est d’autre pays au monde que j’aime autant »), empruntée à l’hymne breton, est inscrite à l’arrière du col.', 
'https://boutique.fclorient.bzh/10362/maillot-third-25-26.jpg', 
89.00),
('MAILLOT TRAINING STAFF 25/26', 
'Le maillot d’entraînement porté par Olivier Pantaloni et son staff cette saison.', 
'https://boutique.fclorient.bzh/10437/maillot-training-staff-25-26.jpg', 
49.00),
('ÉCHARPE CENTENAIRE DU FC LORIENT', 
'L''écharpe spécialement conçue pour la saison du centenaire du FC Lorient.', 
'https://boutique.fclorient.bzh/11135/echarpe-hd-lorient.jpg', 
16.90),
('CHAUSSETTES HOME 25/26', 
'Traditionnellement blanches, elles arborent deux bandes à damier tango et noir en hommage au centenaire du club.', 
'https://boutique.fclorient.bzh/10587/chaussettes-home-25-26.jpg', 
19.90),
('SHORT THIRD 25/26', 
'Le short de la tenue « third » des Merlus pour cette saison du centenaire.

A dominante noire, il arbore une élégante bande dorée sur le côté. Les logos Joma et FC Lorient sont également dorés, complétant ainsi parfaitement le maillot third', 
'https://boutique.fclorient.bzh/10377/short-third-25-26.jpg', 
39.00);


-- 8. insertion des articles (articles) - fc lorient
insert into articles (title, content, image, createdAt) values
('Sélections nationales : Quatre Lorientais sur le pont', 
'Quatre Merlus sont sur le pont durant cette trêve internationale. Le point sur les programmes respectifs de nos joueurs :

Aiyegun Tosin (Bénin)

Aiyegun Tosin, le co-meilleur buteur des Merlus cette saison avec trois réalisations (avec Pablo Pagis), va participer à deux rencontres comptant pour les éliminatoires de la Coupe du Monde 2026 avec le Bénin. La première face au Rwanda vendredi soir, la seconde contre le Nigéria mardi prochain. Les Béninois sont actuellement en tête de leur poule avec 14 points, à égalité avec l’Afrique du Sud. C’est donc un rassemblement primordial pour Aiyegun et ses coéquipiers.

Montassar Talbi (Tunisie)

Déjà qualifié pour la prochaine Coupe du Monde, Montassar Talbi, le défenseur central du FC Lorient, va prendre part aux deux dernières rencontres qualificatives. Les Tunisiens vont se rendre à Sao Tomé-et-Principe vendredi soir avant d’accueillir la Namibie lundi après-midi au stade de Radès.

Arthur Avom Ebong (Cameroun)

Deuxièmes de leur poule, avec 15 points, derrière le Cap-Vert, les Lions Indomptables d’Arthur Avom Ebong ont deux nouvelles rencontres pour valider leur ticket pour la prochaine Coupe du Monde. Le milieu de terrain du FC Lorient va affronter successivement l’Ile Maurice de Lindsay Rose (ancien lorientais) mercredi soir avant d’accueillir l’Angola lundi soir.  

Yvon Mvogo (Suisse)

De retour en sélection, Yvon Mvogo, le portier helvète du FCL, va prendre part aussi à deux rencontres comptant pour les éliminatoires de la Coupe du Monde 2026. Les Suisses se déplaceront deux fois : la première en Suède vendredi soir avant de s’envoler pour la Slovénie lundi soir. Yvon et ses coéquipiers occupent actuellement la tête de leur groupe après deux journées.',
'https://www.fclorient.bzh/voy_content/uploads/2025/10/DSC7405-1680x839.jpeg', '2025-10-06'),
('Paris FC – FC Lorient (2-0) : La réaction d’Olivier Pantaloni', 
'https://youtu.be/hC7i5QXGF5M',
'https://www.fclorient.bzh/voy_content/uploads/2025/09/DSC7303-1680x839.jpeg', '2025-10-06'),
('Paris FC – FC Lorient (2-0) : Le résumé de la rencontre',
'https://youtu.be/nT8jIWWasGU', 
'https://www.fclorient.bzh/voy_content/uploads/2025/10/272493_0115-1680x839.jpg', '2025-10-06'),
('Formation : La passe de trois pour la réserve, les U19 enchaînent',
'National 2
FC Lorient – FC Montlouis : 2-1

La réserve lorientaise enchaîne avec une troisième victoire consécutive. Un succès qui lui permet aujourd’hui d’atteindre la barre des dix points et de se placer 9ème au classement. Cette victoire s’est construite en première période grâce à des buts de Maçon et Baldoni avant la demi-heure de jeu. Montlouis a réduit l’écart sur pénalty à cinq minutes de la fin de la rencontre, de quoi donner quelques sueurs froides aux Merlus.

Division 3 – Féminines
Molsheim Ernolsheim – FC Lorient : 3-0

Les Lorientaises se sont inclinées en terres alsaciennes face à Molsheim. Toujours à la recherche de son premier succès en championnat, le FC Lorient, aujourd’hui 12ème de sa poule, devra réagir dès dimanche face à Saint-Denis, classée 10ème à seulement deux unités des Merlu(e)s.

U19 nationaux
FC Lorient – Beaucouzé : 4-1

Les jeunes lorientais enchaînent par un probant succès ce week-end face à Beaucouzé grâce à des réalisations de Raphaël Michel, auteur d’un doublé, de Rayann Trules et de Dorian Guizouarn. Une victoire qui confirme leur succès de la semaine d’avant face à Saint-Renan. Avec 14 points au compteur, ils confortent leur 5ème place au classement et pointent à deux unités du podium. Confirmation attendue ce samedi à Saint-Brieuc, l’actuel avant dernier de la poule.

U17 nationaux
La Roche Vendée – FC Lorient : 4-1

Leaders avant cette journée, le FC Lorient s’est lourdement incliné à La Roche Vendée. Cette rencontre avait pourtant bien commencé pour les Merlus grâce à l’ouverture de score de Kevin Williams à l’heure de jeu. Les Vendées ont su réagir et inverser la tendance pour l’emporter. Suite à cette défaite, les Lorientais glissent à la 4ème place de la poule F. Réaction attendue face à Cholet le week-end prochain, le dauphin de ce championnat.

U18 RÉGIONAUX
Guipavas – FC Lorient : 1-1

FÉMININES U18 Régionaux
EA Guingamp – FC Lorient : 0-3

U17 Régionaux
FC Lorient – AS Vitré : 4-3

FUTSAL
GSI Pontivy – FC Lorient : 4-11

Préformation
U15 : match face au CPB Bréquigny : 1-1

Section féminine
U9F : plateau à Plœmeur, cinq matchs : quatre défaites et un match nul.

U11F : troisième journée de brassage : trois matchs, trois matchs nuls : 2-2 face à l’ESSOR, 2-2 face à Quéven et 0-0 face au CEP Lorient.

U15F : match face à Plœmeur : défaite 3-2.',
'https://www.fclorient.bzh/voy_content/uploads/2025/10/A9309580-1680x839.jpg', '2025-10-06'),
('Entraînement : Le programme de la semaine', 
'Lundi 6 octobre : Repos
Mardi 7 octobre : Entraînement à 16h00
Mercredi 8 octobre : Entraînement à 10h30
Jeudi 9 octobre : Entraînement à 10h30
Vendredi 10 octobre : FC Lorient – EA Guingamp (match amical à huis clos)
Samedi 11 octobre : Repos
Dimanche 12 octobre : Repos',
'https://www.fclorient.bzh/voy_content/uploads/2025/09/A9303672-1920x839.jpg', '2025-10-06'),
('Benjamin Corgnet, le sport avant tout', 
'Cette saison en collaboration avec notre parrain officiel Actual, 5ème acteur sur le marché du travail et de l’emploi en France, nous allons partir à la rencontre d’anciens joueurs du club qui ont effectué une reconversion hors du milieu du football. Pour ce premier épisode, nous avons échangé avec Benjamin Corgnet. L’ancien milieu offensif des Merlus s’est lancé dans le milieu de la distribution d’articles de sport, près de Lyon. Il nous explique les raisons de cette reconversion et revient sur sa carrière de footballeur. Entretien.

Comment vas-tu et où vis-tu aujourd’hui ?
Je vais très bien, merci ! J’habite en région lyonnaise depuis maintenant quatre ans. À la fin de mon aventure à Strasbourg, après le Covid, on s’est installé là-bas avec ma femme et mes enfants. Depuis, on a acheté une maison, les enfants sont scolarisés dans la région et je ne bouge plus.

Tu as donc arrêté à Strasbourg en 2020-2021 ?
Oui. J’étais en fin de contrat en 2020, au moment où le Covid a stoppé la saison. Ça a bouleversé mes plans de fin de carrière, j’avais 32 ou 33 ans. Je n’ai pas retrouvé de club tout de suite, ça a été compliqué. Finalement, j’ai choisi de revenir dans la région lyonnaise et de signer à Bourg-en-Bresse, en National. C’est à ce moment-là que j’ai décidé de me stabiliser, de ne plus faire bouger la famille et d’envisager la suite.

C’est aussi là qu’a commencé à germer ton idée de reconversion ?
Exactement. Après le Covid, ça a été difficile. J’avais même participé à un reportage sur les joueurs en fin de contrat diffusé sur Canal+. J’ai continué à jouer un an et demi en National, mais dans ma tête, j’avais déjà commencé à me projeter vers l’avenir. En arrivant à Bourg-en-Bresse, mon idée était de trouver un club près de chez moi, qui puisse éventuellement m’offrir une opportunité de reconversion après le football.

Jouer à Bourg-en-Bresse, c’était aussi pour faire une transition douce vers la fin de ta carrière ?
Oui, exactement. Après six à huit mois sans jouer, je m’entraînais avec la réserve de Strasbourg. Quand Bourg-en-Bresse m’a contacté, j’avais envie de rejouer, peu importe le niveau. On a même failli monter en Ligue 2, ce qui aurait pu changer mes plans. Mais l’idée de départ était bien de rester dans la région, avec un projet de club et une possible reconversion à la clé.

Pendant que tu jouais à Bourg-en-Bresse, as-tu suivi des formations en parallèle ?
La première année, j’étais concentré à 100 % sur le terrain. Ensuite, c’était prévu que je continue à jouer tout en passant le DUGOS, un diplôme de gestion et organisation sportive proposé par l’UNFP. Finalement, je n’ai pas prolongé comme joueur. Le club a préféré m’intégrer directement à ses structures : un peu de sportif, un peu de communication, de formation, et en parallèle j’ai commencé le DUGOS. Puis, en fin de saison, le coach a été limogé et on m’a demandé d’intégrer le staff comme entraîneur adjoint. Ça m’a donné envie de passer mes diplômes d’entraîneur.

Combien de temps dure le Dugos ?
Deux ans, en correspondance avec l’université de Lyon. Tu valides des modules tous les deux-trois mois, dans différents domaines : informatique, stratégie sportive, comptabilité… Ça donne une vision globale de la gestion d’un club, professionnel ou amateur.

Tu l’as fait entièrement à Bourg-en-Bresse ?
La première année, oui. Mais le projet du club s’est effondré après la descente et le départ du président. Du coup, j’ai fait ma deuxième année dans mon club amateur d’origine, tout en débutant mes diplômes d’entraîneur. Je coachais les U14 en R1, et c’était une belle manière de revenir là où tout avait commencé.

Et aujourd’hui, tu es chez Espace Sport Côtières. Peux-tu nous en parler ?
C’est une entreprise implantée à Beynost, au nord de Lyon, spécialisée dans la distribution de matériel sportif (pas seulement le foot). Je connaissais le gérant, partenaire de mon club d’origine, où j’entraîne. Au départ, j’ai travaillé comme auto-entrepreneur : livraisons, marquages, un peu de commercial. Ça m’a plu, et depuis septembre, je suis en CDI. Je fais un peu de tout : conception de boutiques en ligne pour les clubs, livraisons, SAV… On est une dizaine d’employés, c’est une structure familiale qui existe depuis 30 ans.

Qu’est-ce qui te plaît dans ce poste ?
Déjà, ça reste dans le milieu du sport, mais pas uniquement dans le foot. Les missions sont variées, je rencontre des clubs et des fournisseurs, je découvre d’autres univers. Et puis, après une carrière passée à être en déplacement tous les week-ends, ça me fait du bien d’avoir un rythme plus stable. Ça me manquait aussi d’avoir un environnement d’équipe. Aujourd’hui, je me sens bien dans cette nouvelle dynamique.

Si on revient à ta carrière de joueur, qu’est-ce que tu en retiens avec le recul ?
Beaucoup de fierté. J’ai eu une carrière atypique, j’ai commencé tard, et pourtant j’ai fait près de 300 matchs pros, dont plus de 180 en Ligue 1 et une quinzaine en Coupe d’Europe. Franchement, je n’imaginais pas ça. Bien sûr, on veut toujours faire plus, mais je n’ai aucun regret. J’ai gardé de bonnes relations dans tous mes clubs, et c’est une grande fierté.

Un souvenir marquant à ressortir ?
À Saint-Étienne, les derbies, l’ambiance du stade, la Coupe d’Europe… Un but contre le PSG devant ma famille, ce sont des moments gravés. Mais je garde aussi un grand souvenir de Strasbourg avec la victoire en Coupe de la Ligue, mon seul trophée. Et même mon passage à Lorient, assez court, reste très positif : le jeu, le groupe, le coach Gourcuff… J’ai encore des contacts avec beaucoup de joueurs de cette époque.

Continues-tu à suivre tes anciens clubs ?
Oui, je suis toujours leurs parcours. J’ai moins de coéquipiers que je connais encore en activité, mais je garde un œil. Et quand je peux, je retourne voir des matches.

Et pour la suite, que pouvons-nous te souhaiter ?
De continuer à prendre du plaisir dans ce que je fais, et surtout la santé pour moi et mes proches. Aujourd’hui je suis heureux, bien entouré, et c’est le plus important.',
'https://www.fclorient.bzh/voy_content/uploads/2025/10/Corgnet.jpg',
'2025-10-05'),
('Loïc Fiévet : « Les joueurs doivent être acteur de leur projet »', 
'Après trente ans passés dans le Nord de la France, Loïc Fiévet s’est lancé un nouveau défi. A 37 ans, l’ancien formateur du Valenciennes Football Club a pris cet eté les rênes des U19 Nationaux des Merlus. Entretien avec cet entraineur passionné de football depuis le plus jeune âge.

Loïc, tu es natif de l’Yonne mais pourtant tu es un véritable enfant du Nord

Exactement, je suis né en Bourgogne suite à la mutation à l’époque de mon père. Mais à mes cinq ans, on a retrouvé le Nord de la France, d’où mon papa est originaire.

J’ai tapé mes premiers ballons en débutant à l’US Pont Flers. Le football était une évidence dans ma famille. Mon père y jouait, mes grands frères aussi.

A la maison, c’était foot, foot et encore foot. Et j’aimais vraiment ça. Je ne ratais aucune séance d’entrainement, aucun match. Je jouais toujours avec les copains, à l’école… Dans le Nord, on est vraiment attaché au ballon rond.

Justement, tu as hérité de cette mentalité du Nord de la France ?

Totalement ! L’histoire de la région est vraiment primordiale dans le Nord. Et ça se retranscrit dans les valeurs de nos clubs nordistes, dans la ferveur des supporters aussi.

Et d’une certaine manière, je ressens aussi ça à Lorient. L’attachement au territoire maritime, aux différents ports, à la pêche… On m’en parle énormément au club depuis mon arrivée.

Et je trouve ça hyper positif. Nos jeunes joueurs doivent comprendre leur territoire pour que les supporters s’identifient à eux. On doit permettre la création de valeurs communes.

Peux-tu nous parler de ton parcours de joueur ?

Après mes débuts à Pont Flers, j’ai rejoint le club de Guesnain en poussin. Là-bas, j’ai découvert le foot à 7 puis à 9.

Et en U13, je suis repéré par Valenciennes pour rejoindre leur section sportive. J’y jouerai de U14 jusqu’en équipe réserve à mes 21 ans. Mais en CFA j’ai vu mes limites.

C’est à ce moment-là que tu décides de te lancer vers un parcours de formateur ?

J’étais passionné depuis tout petit par la tactique. J’avais déjà cette fibre de formation. J’étais capitaine chez les jeunes et j’étais du genre à prendre la parole dans la vestiaire. J’aimais profondément le football. Pour dire, dès mes 14 ans j’ai commencé à multiplier les heures sur Football Manager (rires).

Quelle est ta première expérience d’entraineur ?

A mes 21 ans, je ne suis pas conservé par le VAFC et je décide de me rapprocher de mon ancien coach à Guesnain. Et ce dernier me proposer d’assister aux séances, de commencer à apprendre le job.

Et quelques mois plus tard, on m’a confié les benjamins B. Une première expérience où je voulais transmettre ma passion du football. Je souhaitais que les petits prennent du plaisir et que personne n’arrête en cours de saison.

Tes premiers emplois dans le football arrivent quelques années plus tard

Je jouais à Douai en DH et j’intervenais, en parallèle, au sein de leur section sportive. C’est mon tout premier emploi dans le foot.

Puis à mes 25 ans, j’ai commencé en tant qu’adjoint technique au district. Mes missions étaient de développer le foot féminin, le futsal, les formations… Une super expérience où j’ai énormément appris, où j’ai multiplié les contacts avec les clubs, organisé des réunions… Et en parallèle, j’ai validé mon DES (diplôme d’état supérieur).

Et Valenciennes te contacte ensuite pour devenir responsable de leur école de foot

C’est ça. Je coach aussi les U14 et on créer, en parallèle, la section féminine du VAFC.

Et en 2021, je prends les rênes des U19 Nationaux. On réalise trois saisons bien différentes, mais toutes enrichissantes. En centre de formation, c’est ce qui fait la richesse de notre métier. Chaque année on a de nouvelles générations, on doit reconstruire, s’adapter.

Mais j’ai toujours aimé ça. Notre objectif est d’apporter notre maximum aux jeunes pour sortir le plus de joueurs professionnels possibles.

Un objectif que tu poursuis aujourd’hui au FC Lorient

Lorient s’est présenté comme un nouveau challenge. Je souhaitais sortir de ma zone de confort en découvrant de nouvelles méthodes, une nouvelle manière de voir les choses. Et ces premiers mois au club sont extrêmement enrichissant.

Quelles sont tes premières observations sur la recette FC Lorient ?

J’ai très rapidement remarqué une omniprésence de l’utilisation de la vidéo pour accompagner les joueurs. Et on échange beaucoup avec eux.

Ici, les jeunes doivent être acteur de leur projet. On est là pour les accompagner mais c’est aussi à eux de s’exprimer pour progresser.

Enfin, le regard qu’on a ici sur la progression est très intéressant. On cherche à mettre en place des méthodes pour faire progresser nos joueurs. L’importance accordée aux résultats est secondaire et c’est très agréable de travailler dans un tel contexte.',
'https://www.fclorient.bzh/voy_content/uploads/2025/10/loic-fievet.jpg',
'2025-10-04'),
('Formation : La réserve pour enchaîner, les filles en Alsace', 
'National 2
FC Lorient – FC Montlouis, samedi à 18h00 au terrain André Badoil (Espace FCL)

Les hommes d’Arnaud Le Lan vont tenter d’enchaîner un troisième succès d’affilée face au FC Montlouis, actuelle lanterne rouge de la poule A. Avec 7 points au compteur, les Lorientais peuvent prétendre à intégrer la première moitié de tableau en cas de résultat positif ce samedi. De son côté, Montlouis, qui a dominé Locminé le week-end dernier (4-1), tentera de valider leur succès de la semaine dernière pour quitter la dernière place de ce groupe.

Division 3 – Féminines
Molsheim Ernolsheim – FC Lorient, dimanche à 13h00 au Parc des Sports

Après avoir décroché le point du match nul face à La Roche Vendée (1-1) le week-end passé, les Lorientaises prennent la direction du Bas-Rhin pour y affronter Molsheim Ernolsheim, club classé actuellement à la 8ème place, deux points devant le FC Lorient. Les Alsaciennes restent sur une lourde défaite face à Roubaix (4-0). Une belle occasion pour les Merlu(e)s de remporter cette rencontre ?

U19 nationaux
FC Lorient – Beaucouzé, dimanche à 15h00 à l’Espace FCL (T2)

Vainqueurs à Saint-Renan la semaine dernière, les Lorientais accueillent Beaucouzé, l’actuel 8ème du groupe, avec 6 points. Le FC Lorient, 5ème, à l’occasion de se rapprocher du podium en cas de succès ce week-end et d’enchaîner avec une deuxième victoire.

U17 nationaux
La Roche Vendée – FC Lorient, dimanche à 15h00 au stade Henri Desgranges

Leaders de leur poule après la victoire (3-0) face à Saint-Cyr sur Loire la semaine passée, les Merlus se rendent en Vendée pour le compte de cette 7ème journée de championnat. La Roche, 10ème avec 8 points, reste sur une probante victoire face à Vertou. Un beau match en perspective entre deux formations en confiance.

U18 RÉGIONAUX
Guipavas – FC Lorient, samedi à 16h00 au complexe sportif de Kerlaurent

FÉMININES U18 Régionaux
EA Guingamp – FC Lorient, samedi à 16h00 à l’Akademi EAG

U17 Régionaux
FC Lorient – AS Vitré, samedi à 11h00 à l’Espace FCL (T2)',
'https://www.fclorient.bzh/voy_content/uploads/2025/10/DSC0006-1680x839.jpg',
'2025-10-03'),
('Paris FC – FC Lorient : La conférence de presse avant la rencontre', 
'https://youtu.be/Av1jRUsZEH4',
'https://www.fclorient.bzh/voy_content/uploads/2025/09/A9303800-1920x839.jpg',
'2025-10-02');
