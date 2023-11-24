public class responsable extends employee {
    float prime;
    public responsable(int prime) {
        this.prime = prime;
    }

    public responsable (String nom,int id,String adresse,int nbr_heure, float prime){
        super(nom, id, adresse, nbr_heure);
        this.prime=prime;
    }
    public double Calculer_Salaire(){
        double salaire=nbr_heure*10;
        if (nbr_heure>160){
            return salaire+(salaire*0.2);
        }else{
            return salaire;
        }
    }
}
