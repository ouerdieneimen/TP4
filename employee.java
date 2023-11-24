import java.util.Scanner;
    public class employee {
        protected String nom;
        protected int id;
        protected String adresse;
        protected int nbr_heure;
        public employee(){
        }
        public employee(String nom,int id,String adresse,int nbr_heure){
            this.id=id;
            this.adresse=adresse;
            this.nbr_heure=nbr_heure;
            this.nom=nom;
        }
        public void afficher() {
            System.out.println("les données d'employee :"
                    + "nom:" + nom
                    + " id: " + id
                    + "adresse:" + adresse
                    + "nombre des heures:" + nbr_heure);
        }


        public abstract double Calculer_Salaire();


    }

