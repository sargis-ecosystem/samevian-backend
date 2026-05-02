package com.samevian.model;

import java.util.List;

public class Organ {
    private String name;
    private String displayNameHy;
    private String displayNameEn;
    private String category;
    private List<String> components;

    public Organ() {}

    public Organ(String name, String displayNameHy, String displayNameEn, String category, List<String> components) {
        this.name = name;
        this.displayNameHy = displayNameHy;
        this.displayNameEn = displayNameEn;
        this.category = category;
        this.components = components;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDisplayNameHy() { return displayNameHy; }
    public void setDisplayNameHy(String v) { this.displayNameHy = v; }
    public String getDisplayNameEn() { return displayNameEn; }
    public void setDisplayNameEn(String v) { this.displayNameEn = v; }
    public String getCategory() { return category; }
    public void setCategory(String v) { this.category = v; }
    public List<String> getComponents() { return components; }
    public void setComponents(List<String> v) { this.components = v; }
}