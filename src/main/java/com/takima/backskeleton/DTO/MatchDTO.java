package com.takima.backskeleton.DTO;

import java.sql.Timestamp;

public class MatchDTO {
    private long id;
    private Timestamp utcDate;
    private String status;
    private Integer score_home;
    private Integer score_away;
    private int homeTeamId;
    private int awayTeamId;

    public MatchDTO() {}

    public MatchDTO(long id, Timestamp utcDate, String status, Integer score_home, Integer score_away, int homeTeamId, int awayTeamId) {
        this.id = id;
        this.utcDate = utcDate;
        this.status = status;
        this.score_home = score_home;
        this.score_away = score_away;
        this.homeTeamId = homeTeamId;
        this.awayTeamId = awayTeamId;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public Timestamp getUtcDate() { return utcDate; }
    public void setUtcDate(Timestamp utcDate) { this.utcDate = utcDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Integer getScore_home() { return score_home; }
    public void setScore_home(Integer score_home) { this.score_home = score_home; }

    public Integer getScore_away() { return score_away; }
    public void setScore_away(Integer score_away) { this.score_away = score_away; }

    public int getHomeTeamId() { return homeTeamId; }
    public void setHomeTeamId(int homeTeamId) { this.homeTeamId = homeTeamId; }

    public int getAwayTeamId() { return awayTeamId; }
    public void setAwayTeamId(int awayTeamId) { this.awayTeamId = awayTeamId; }
}