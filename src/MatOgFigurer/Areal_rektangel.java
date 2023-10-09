package MatOgFigurer;

//Dette er arealet for et rektangel
public class Areal_rektangel
{
    public static void main(String[] args)
    {
// Rektangel med længden 10 og breden 5
        int Laengde, Areal, Brede;
        Laengde = 5;
        Brede = 10;
        Areal=Laengde*Brede;
        // De to tal "længde og brede" gangens med hinanden, for at finde arealet.
            /*System.out.println("Arealet er" + Laengde * Brede);
            I Linje 11 er L og B indtastet manuelt i modsætning til linja 14,
             hvor den selv regner arealet*/

        System.out.println("Arealet er " + Areal);
    }

}
