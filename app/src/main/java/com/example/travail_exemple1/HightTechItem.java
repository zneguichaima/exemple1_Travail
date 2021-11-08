package com.example.travail_exemple1;

public class HightTechItem {
    //les attributs qui cacartérise notre Objet
    private String name;
    private String description;
private String menonic;
    public HightTechItem(String name, String description,String menonic ) {
        this.name = name;
        this.description = description;
        this.menonic =menonic;
    }
    //methode


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getMenonic() {
        return menonic;
    }
}
