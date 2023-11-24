public class vendeur extends employee{
    int tauxvente;
    public vendeur(int tauxvente) {
        this.tauxvente = tauxvente;
    }

    public vendeur(String nom,int id,String adresse,int nbr_heure, int tauxvente){
        super(nom, id, adresse, nbr_heure);
        this.tauxvente=tauxvente;
    }
    public double Calculer_Salaire(){
        return 450*tauxvente;
    }
}
