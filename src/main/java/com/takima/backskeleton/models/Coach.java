package com.takima.backskeleton.models;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "coachs")
public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="firstname")
    private String firstName;
    @Column(name="lastname")
    private String lastName;
    @Column(name="birthdate")
    private Timestamp dateOfBirth;
    private int nationality;
    private String crest;

    public Coach() {}

    public Coach(String firstName, String lastName, Timestamp dateOfBirth, int nationality, String crest) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.crest = crest;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public Timestamp getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(Timestamp dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public int getNationality() { return nationality; }
    public void setNationality(int nationality) { this.nationality = nationality; }

    public String getCrest() { return crest; }
    public void setCrest(String crest) { this.crest = crest; }
}
