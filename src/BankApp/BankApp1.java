package BankApp;

public class BankApp1 {
    public static void main(String[] args){
        double Konto_1=50.25;
        int Konto_nr_1=1;
        String Name=" Magnus Munk ";

        double Konto_2;
        int Konto_nr_2;
        String Name_2;

        Konto_2=100;
        Konto_nr_2=2;
        Name_2=" Pia Nielsen ";
        System.out.println("før");
        System.out.println("konto_1 "+Konto_nr_1+Name+ + Konto_1);
        System.out.println("konto_2 "+Konto_nr_2+Name_2+ + Konto_2);
        //println kan også bruges.
        // Der er nu to Bank kontoer for at tilføje penge til konto gør følgende
        Konto_1=Konto_1+100;
        // Man kan også gøre det med renter.Dette ser sådan ud hvis renten er 5%
        //Konto_1=Konto_1*1,05
        // Nu er der sat 100 penge ind til Magnus Munk
        System.out.println("Efter");
        System.out.println("konto_1 "+Konto_nr_1+Name+ + Konto_1);
        System.out.println("konto_2 "+Konto_nr_2+Name_2+ + Konto_2);
        //Banken kan finde sine samlede indlaan(de penge kunderne har)
        double samlet_indlaan=Konto_1+Konto_2;
        System.out.println("samlet_indlaan");
        // de kan se gennemsnitligt indlaan således
        double gns_indlaan=samlet_indlaan/2;

        System.out.println("gns indlån er "+gns_indlaan);

    }
}

/* Double er til kommatal
Int er til heltal
String er til navne
 */