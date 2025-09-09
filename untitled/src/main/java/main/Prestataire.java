package main;

public class Prestataire extends Travailleur {

    private final float tjm; // Taux Journalier Moyen en euros

    public Prestataire(int id, String nom, String prenom, String email, String telephone, float tjm) {
        super(id, nom, prenom, email, telephone);
        this.tjm = tjm;
    }

    public double getTjm() {
        return tjm;
    }
}
