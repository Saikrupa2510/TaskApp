package com.accenture.task.model;

public class Item {
    private String name;

    private int image_name;

    private String name1;

    public Item(String name, int image_name, String name1) {
        this.name = name;
        this.image_name = image_name;
        this.name1 = name1;
    }

    public String getName() {
        return name;
    }

    public String getName1() {
        return name1;
    }

    public int getImageName() {
        return image_name;
    }

}
