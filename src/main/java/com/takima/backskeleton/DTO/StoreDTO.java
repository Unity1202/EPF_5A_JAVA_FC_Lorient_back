package com.takima.backskeleton.DTO;

public class StoreDTO {
    private long id;
    private String name;
    private String description;
    private String image;
    private float price;

    public StoreDTO() {}

    public StoreDTO(long id, String name, String description, String image, float price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

    public float getPrice() { return price; }
    public void setPrice(float price) { this.price = price; }
}
