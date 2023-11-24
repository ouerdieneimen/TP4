public class Test {
    public static void main(String[] args) {

        produit prod1 = new produit();
        produit prod2 = new produit(123, "Lait", "Delice" ,8.0);
        produit prod3 = new produit(321, "Yaourt", "Vitalait",9.0);
        produit prod4 = new produit(231, "Tomate", "Sicam", 1.200);


        Magasin.ajoutProduit(prod1);
        Magasin.ajoutProduit(prod2);

        Magasin.afficher();

        System.out.println("le nombre des produits est " + Magasin.nbrProduit);
        prod2.afficher();
        prod3.afficher();
        prod4.afficher();


        prod1.setIdentifiant(456);
        prod1.setLibelle("biscuit");
        prod1.setMarque("prince");
        prod1.setPrix(700);
        prod1.afficher();

        prod2.setPrix(1300);
        prod2.afficher();

        prod3.setPrix(0.550);
        prod3.afficher();


        System.out.println(prod1.toString());
        System.out.println(prod2.toString());
        System.out.println(prod3.toString());
        System.out.println(prod4.toString());

        date d1 = new date(12, 7, 2023);
        prod1.setDate(d1);
        prod2.setDate(new date(25, 11, 2023));
        prod3.setDate(new date(9, 5, 2023));
        prod4.setDate(new date(2, 1, 2024));

        System.out.println("le date d'expiration du Biscuit est");
        prod1.getDate().affDate();
        System.out.println("le date d'expiration de Lait est");
        prod2.getDate().affDate();
        System.out.println("le date d'expiration de Yaourt est");
        prod3.getDate().affDate();
        System.out.println("le date d'expiration de Tomate est");
        prod4.getDate().affDate();

        Magasin carrefour =new Magasin(1234,"centre ville",50);
        Magasin monoprix =new Magasin(4123,"menzah 6",55);

        caissier caissier1=new caissier("imen", 123, "bizerte", 8 ,1 );
        caissier caissier2=new caissier("zak", 321, "sidi bouzid",10, 2 );
        responsable responsable1 =new responsable( "seif", 258, "libya",15,100);
        vendeur vendeur1=new vendeur("firas",485, "tunis",14,10);
        carrefour.ajoutEmployee (caissier1);
        carrefour.ajoutEmployee(caissier2);
        carrefour.ajoutEmployee(responsable1);
        carrefour.ajoutEmployee(vendeur1);

        vendeur vendeur2=new vendeur("najd",495, "sidi bouzid",6,28);
        vendeur vendeur3=new vendeur("hammouda",185, "zaghouan",7,30);
        vendeur vendeur4=new vendeur("amine",487, "beja",5,19);
        responsable responsable2=new responsable( "chadli", 257, "mestir",11,150);
        monoprix.ajoutEmployee (vendeur2);
        monoprix.ajoutEmployee(vendeur3);
        monoprix.ajoutEmployee(vendeur4);
        monoprix.ajoutEmployee(responsable2);

        System.out.println("!!! les données des employees de magasin Carrefour !!! ");
        for (int i = 0; i < carrefour.nbr_employee; i++) {
            carrefour.tab_emp[i].afficher();
        }

        System.out.println("!!! les données des employees de magasin Monoprix !!! ");
        for (int i = 0; i < monoprix.nbr_employee; i++) {
            monoprix.tab_emp[i].afficher();
        }

      produit prod5=new produit( 851 ,"tomate","sicam",50.5);
      produit prod6=new produit(603,"cake","prince",600.1);
      produit prod7=new produit(481,"yaourt","danone",700.2);
      monoprix.ajoutProduit(prod7);
      monoprix.ajoutProduit(prod5);
      monoprix.ajoutProduit(prod6);
      carrefour.ajoutProduit(prod7);
      carrefour.ajoutProduit(prod5);
      carrefour.ajoutProduit(prod6);

      System.out.println("!!! les données de magasin Carrefour !!! " );
      carrefour.afficher();
      System.out.println("!!! les données de Monoprix  !!! " );
      monoprix.afficher();

      System.out.println("___les différentes salaires des employees de Carrefour___");
      System.out.println("les différentes salaires des caissiers");
      System.out.println(caissier1.Calculer_Salaire());
      System.out.println(caissier2.Calculer_Salaire());
      System.out.println("le salaire de responsable");
      System.out.println(responsable1.Calculer_Salaire());
      System.out.println("le salaire de vendeur");
      System.out.println(vendeur1.Calculer_Salaire());


      System.out.println("___les différentes salaires des employees de Monoprix___");
      System.out.println("le salaire des vendeurs");
      System.out.println(vendeur2.Calculer_Salaire());
      System.out.println(vendeur3.Calculer_Salaire());
      System.out.println(vendeur4.Calculer_Salaire());
      System.out.println("le salaire de responsable");
      System.out.println(responsable2.Calculer_Salaire());



    }
}