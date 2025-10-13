package com.takima.backskeleton.models;

import jakarta.persistence.*;

@Entity
@Table(name = "teams")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    @Column(name = "shortname")
    private String shortName;
    private String crest;
    private int rank;
    private int points;
    private int played;
    private int won;
    private int drawn;
    private int lost;
    private int diff;

    public Team() {}

    public Team(String name, String shortName, String crest, int rank, int points, int played, int won, int drawn, int lost, int diff) {
        this.name = name;
        this.shortName = shortName;
        this.crest = crest;
        this.rank = rank;
        this.points = points;
        this.played = played;
        this.won = won;
        this.drawn = drawn;
        this.lost = lost;
        this.diff = diff;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getShortName() { return shortName; }
    public void setShortName(String shortName) { this.shortName = shortName; }

    public String getCrest() { return crest; }
    public void setCrest(String crest) { this.crest = crest; }

    public int getRank() { return rank; }
    public void setRank(int rank) { this.rank = rank; }

    public int getPoints() { return points; }
    public void setPoints(int points) { this.points = points; }

    public int getPlayed() { return played; }
    public void setPlayed(int played) { this.played = played; }

    public int getWon() { return won; }
    public void setWon(int won) { this.won = won; }

    public int getDrawn() { return drawn; }
    public void setDrawn(int drawn) { this.drawn = drawn; }

    public int getLost() { return lost; }
    public void setLost(int lost) { this.lost = lost; }

    public int getDiff() { return diff; }
    public void setDiff(int diff) { this.diff = diff; }
}
