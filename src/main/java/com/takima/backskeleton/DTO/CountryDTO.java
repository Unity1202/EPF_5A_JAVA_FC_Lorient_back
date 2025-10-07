package com.takima.backskeleton.DTO;

public class CountryDTO {
    private long id;
    private String name;
    private String flag;

    public CountryDTO() {}

    public CountryDTO(long id, String name, String flag) {
        this.id = id;
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
