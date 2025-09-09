package main;

public class Mensuel extends Travailleur{

    private final float salaireMensuel;

    public Mensuel (int id, String nom, String prenom, String email, String telephone, float salaireMensuel) {
        super(id, nom, prenom, email, telephone);
        this.salaireMensuel = salaireMensuel;
    }


}
