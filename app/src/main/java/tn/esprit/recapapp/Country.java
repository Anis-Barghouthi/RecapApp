package tn.esprit.recapapp;

public class Country {
    private int id;
    private String nom;
    private int image;

    public Country(int id) {
    }

    public Country(int id, String nom, int image) {
        this.id = id;
        this.nom = nom;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
