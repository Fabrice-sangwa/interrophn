package com.instero.www;

public class Fragile extends Article{
    private String emballage;

    public Fragile(String nom, double prix, String emballage) {
        super(nom, prix);
        this.emballage = emballage;
    }

    public Fragile(int code, String nom, double prix, String emballage) {
        super(code, nom, prix);
        this.emballage = emballage;
    }

}
