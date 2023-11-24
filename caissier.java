public class caissier extends employee {
    int numcaise;

    public caissier(int numcaise) {
        this.numcaise = numcaise;
    }
    public caissier(String nom,int id,String adresse,int nbr_heure, int numcaise){
        super(nom, id, adresse, nbr_heure);
        this.numcaise=numcaise;
    }
    public double Calculer_Salaire(){
        double salaire=nbr_heure*5;
        if (nbr_heure>180){
            return salaire+(salaire*0.15);
        }else{
            return salaire;
        }
    }
}