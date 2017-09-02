package com.tink.app;

/**
 * Created by temslander on 8/16/17.
 */

class Book {
    private String name;
    private Integer imageId;
    private String description;
    private Number price;

    public Book(String name, Integer imageId, String description, Number price) {
        this.name = name;
        this.imageId = imageId;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getImageId() {
        return imageId;
    }

    public String getDescription() {
        return description;
    }

    public Number getPrice() {
        return price;
    }
}
