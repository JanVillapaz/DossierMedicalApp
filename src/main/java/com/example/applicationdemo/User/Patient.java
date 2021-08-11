package com.example.applicationdemo.User;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Patient {

    private SimpleStringProperty noAssuranceMaladie = new SimpleStringProperty();
    private SimpleStringProperty nom = new SimpleStringProperty();
    private SimpleStringProperty prenom = new SimpleStringProperty();
    private SimpleStringProperty dateNaissance = new SimpleStringProperty();
    private SimpleStringProperty genre = new SimpleStringProperty();
    private SimpleStringProperty villeDeNaissance = new SimpleStringProperty();
    private SimpleStringProperty nomParent = new SimpleStringProperty();
    private SimpleIntegerProperty telephone = new SimpleIntegerProperty();



    private final static String[] FIELD_NAMES = { "noAssuranceMaladie", "nom", "prenom", "dateNaissance", "genre",
    "villeDeNaissance", "nomParent", "telephone"};

    public Patient(String noA, String n, String p, String dob, String g, String vdnaissance,
                   String nParent, int tel) {

        noAssuranceMaladie.set(noA);
        nom.set(n);
        prenom.set(p);
        dateNaissance.set(dob);
        genre.set(g);
        villeDeNaissance.set(vdnaissance);
        nomParent.set(nParent);
        telephone.set(tel);

    }

    public String getNoAssuranceMaladie() {
        return noAssuranceMaladie.get();
    }

    public String getNom() {
        return nom.get();
    }

    public String getPrenom() {
        return prenom.get();
    }

    public String getDateNaissance() {
        return dateNaissance.get();
    }

    public String getGenre() {
        return genre.get();
    }

    public String getVilleDeNaissance() {
        return villeDeNaissance.get();
    }

    public String getNomParent() {
        return nomParent.get();
    }

    public int getTelephone() {
        return this.telephone.get();
    }

    //what to change
    public void setTelephone(int telephone) {
        this.telephone.set(telephone);
    }

}
