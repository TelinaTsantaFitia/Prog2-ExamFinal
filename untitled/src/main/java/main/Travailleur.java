package main;

import java.util.ArrayList;
import java.util.List;

public class Travailleur {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private List<Pointage> pointages = new ArrayList<>();

    public Travailleur(int id, String nom, String prenom, String email, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
    }
}
