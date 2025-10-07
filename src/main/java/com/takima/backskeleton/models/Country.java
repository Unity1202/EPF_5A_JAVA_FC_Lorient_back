package com.takima.backskeleton.models;

import jakarta.persistence.*;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String flag;

    public Country() {}

    public Country(String name, String flag) {
        this.name = name;
        this.flag = flag;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getFlag() { return flag; }
    public void setFlag(String flag) { this.flag = flag; }
}
