create table users
(
    id SERIAL PRIMARY KEY,
    firstName TEXT not null,
    lastName TEXT not null,
    email TEXT not null,
    password TEXT not null
);

create table admins
(
    id SERIAL PRIMARY KEY,
    firstName TEXT not null,
    lastName TEXT not null,
    email TEXT not null,
    password TEXT not null
);

create table articles
(
    id SERIAL PRIMARY KEY,
    title TEXT not null,
    content TEXT not null,
    image TEXT not null,
    createdAt TIMESTAMP not null
);

create table countries
(
    id SERIAL PRIMARY KEY,
    name TEXT not null,
    flag TEXT not null
);

create table teams
(
    id SERIAL PRIMARY KEY,
    name TEXT not null,
    shortName TEXT not null,
    crest TEXT not null,
    rank INT not null,
    points INT not null,
    played INT not null,
    won INT not null,
    drawn INT not null,
    lost INT not null,
    diff INT not null
);

create table coachs
(
    id SERIAL PRIMARY KEY,
    firstName TEXT not null,
    lastName TEXT not null,
    dateOfBirth TIMESTAMP not null,
    nationality INT not null,
    FOREIGN KEY (nationality) REFERENCES countries(id),
    crest TEXT not null
);

create table players
(
    id SERIAL PRIMARY KEY,
    firstName TEXT not null,
    lastName TEXT not null,
    position TEXT not null,
    dateOfBirth TIMESTAMP not null,
    shirtNumber INT not null,
    nationality INT not null,
    FOREIGN KEY (nationality) REFERENCES countries(id),
    crest TEXT not null
);

create table matchs
(
    id SERIAL PRIMARY KEY,
    utcDate TIMESTAMP not null,
    status TEXT not null,
    score_home INT,
    score_away INT,
    homeTeamId INT not null,
    awayTeamId INT not null,
    FOREIGN KEY (homeTeamId) REFERENCES teams(id),
    FOREIGN KEY (awayTeamId) REFERENCES teams(id)
);

create table forum
(
    id SERIAL PRIMARY KEY,
    userId INT not null,
    message TEXT not null,
    createdAt TIMESTAMP not null,
    FOREIGN KEY (userId) REFERENCES users(id)
);

create table store
(
    id SERIAL PRIMARY KEY,
    name TEXT not null,
    description TEXT not null,
    image TEXT not null,
    price FLOAT not null
);