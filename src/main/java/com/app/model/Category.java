package com.app.model;

public class Category {
    private long id;
    private String name;
    private long parent_categoryId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getParent_categoryId() {
        return parent_categoryId;
    }

    public void setParent_categoryId(long parent_categoryId) {
        this.parent_categoryId = parent_categoryId;
    }
}
