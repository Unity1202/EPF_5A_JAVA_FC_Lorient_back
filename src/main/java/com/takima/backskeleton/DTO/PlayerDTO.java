package com.takima.backskeleton.DTO;

import java.sql.Timestamp;

public class PlayerDTO {
    private long id;
    private String firstName;
    private String lastName;
    private String position;
    private Timestamp birthDate;
    private int jerseyNumber;
    private int nationality;
    private String crest;

    public PlayerDTO() {}

    public PlayerDTO(long id, String firstName, String lastName, String position, Timestamp birthDate, int jerseyNumber, int nationality, String crest) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.birthDate = birthDate;
        this.jerseyNumber = jerseyNumber;
        this.nationality = nationality;
        this.crest = crest;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public Timestamp getBirthDate() { return birthDate; }
    public void setBirthDate(Timestamp birthDate) { this.birthDate = birthDate; }

    public int getJerseyNumber() { return jerseyNumber; }
    public void setJerseyNumber(int jerseyNumber) { this.jerseyNumber = jerseyNumber; }

    public int getNationality() { return nationality; }
    public void setNationality(int nationality) { this.nationality = nationality; }

    public String getCrest() { return crest; }
    public void setCrest(String crest) { this.crest = crest; }
}