import java.util.Date;

public class produit {
    private int identifiant;
    private String libelle;
    private String marque;
    private double prix;
    public static int cpt;
    private date date;

    public produit  (int identifiant, String libelle, String marque, double prix) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
        cpt++;

    }


    public produit() {

    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }
    public int getIdentifiant() {
        return identifiant;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public String getMarque() {
        return marque;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public double getPrix() {
        return prix;
    }
    public void setDate(date date) {
        this.date = date;
    }
    public date getDate() {
        return date;
    }

    public void afficher (){
        System.out.println("identifiant:"+identifiant+"/"+"libellé:"+libelle+"/"+"marque:"+marque+"/"+"prix:"+prix);
    }




    // tp4, exercice 1
    //1er méthode (méthode comparer prend un seul produit en paramètre.
    public boolean comparer(produit prod1){
        return ((this.identifiant==prod1.identifiant)&&(this.libelle==prod1.libelle)&&(this.prix==prod1.prix));

    }

    //2er méthode (méthode comparer prend 2 produits en paramètre.
    public boolean comparer (produit prod1,produit prod2){
        return ((prod1.getIdentifiant())==(prod2.getIdentifiant())&&(prod1.getLibelle())==(prod2.getLibelle())
                &&(prod1.getPrix())==(prod2.getPrix()));
    }


}