

public class Magasin {
    public static int identifiant;
    public static String adresse;
    public static String nom;
    public static int capacite=50;

    public static int nbrProduit=0;
    public produit[]tab_produit=new produit[50];

    public int nbr_employee;
    public employee[]tab_emp=new employee[20];
    public static int cpt;
    public Magasin(){}

    public Magasin(int identifiant, String adresse, int capacite ) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.capacite = capacite;
        nbrProduit++;
        cpt++;

    }
    public void ajoutEmployee(employee e){
        if (nbr_employee<=20){
            tab_emp[nbr_employee]=e;
            nbr_employee++;
        }
        else {
            System.out.println("espace insuffisante");
        }
    }
    public void ajoutProduit(produit prod) {
        if (nbrProduit <= capacite) {
            produit[nbrProduit] = prod;
            nbrProduit++;
        } else {
            System.out.println("espace insuffisante");
        }
    }

    public void afficher(){
        System.out.println("nom :"+nom
                +"\nidentifiant :"+identifiant
                +"\n Adresse :"+adresse
                +"\ncapacite :"+capacite
                +"\nLes produits de magasin sont:"
                +"\nnombre de employes:"+nbr_employee
        );
        if (nbr_employee>0){
            for (int i = 0; i <nbr_employee; i++) {
                tab_emp[i].afficher();
            }
        }
        for (int i = 0; i < nbr_employee; i++) {
               tab_produit[i].afficher();
        }

    }
}

