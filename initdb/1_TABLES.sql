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
    source TEXT not null,
    createdAt TIMESTAMP not null
);

create table countries
(
    id SERIAL PRIMARY KEY,
    name TEXT not null,
    flag TEXT not null
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

create table teams
(
    id SERIAL PRIMARY KEY,
    name TEXT not null,
    shortName TEXT not null,
    crest TEXT not null,
    rank INT not null,
    coachId INT not null,
    FOREIGN KEY (coachId) REFERENCES coachs(id)
);

create table team_players
(
    teamId INT not null,
    playerId INT not null,
    PRIMARY KEY (teamId, playerId),
    FOREIGN KEY (teamId) REFERENCES teams(id),
    FOREIGN KEY (playerId) REFERENCES players(id)
);

create table matchs
(
    id SERIAL PRIMARY KEY,
    utcDate TIMESTAMP not null,
    status TEXT not null,
    venue TEXT not null,
    matchday INT not null,
    lastUpdated TIMESTAMP not null,
    winner TEXT not null,
    winnerCode TEXT not null,
    score_home INT not null,
    score_away INT not null,
    homeTeamId INT not null,
    awayTeamId INT not null,
    FOREIGN KEY (homeTeamId) REFERENCES teams(id),
    FOREIGN KEY (awayTeamId) REFERENCES teams(id)
);