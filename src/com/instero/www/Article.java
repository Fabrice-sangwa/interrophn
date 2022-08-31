package com.instero.www;

public class Article {

    protected int code;
    protected  String nom;
    protected double prix;

    public Article(String nom, double prix){
        this.nom = nom; 
        this.prix = prix;
    }

    public Article(int code, String nom, double prix) {
        this.code = code;
        this.nom = nom;
        this.prix = prix;
    }

    public double prixTransport(){
        return prix * 0.5;
    }

    @Override
    public String toString() {
        return this.code + " " + this.nom;
    }
}
