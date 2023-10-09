package OpskriftBog;
import java.io.*;
import java.util.*;

public class OpskriftBog2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Velkommen til OpskriftsBog!");

        while (true) {
            // Viser menuen og venter på brugerens valg
            System.out.println("\nVælg en handling:");
            System.out.println("1. Opret ny opskrift");
            System.out.println("2. Gem opskrift til fil");
            System.out.println("3. Indlæs opskrift fra fil");
            System.out.println("4. Afslut");

            int valg = scanner.nextInt();

            switch (valg) {
                case 1:
                    //Bruger valgte at oprette en ny opskrift
                    Opskrift opskrift = opretNyOpskrift(scanner);
                    gemOpskriftTilFil(scanner, opskrift);
                    break;
                case 2:
                    //Gemmer en opskrift til fil
                    System.out.println("Denne handling kræver en opskrift. Vælg først 'Opret ny opskrift'.");
                    break;
                case 3:
                    //Indlæse en opskrift fra fil
                    indlæsOpskrift(scanner);
                    break;
                case 4:
                    //Afslutter programmet
                    System.out.println("På gensyn.");
                    return;
                default:
                    //Håndterer ugyldigt valg
                    System.out.println("Ugyldigt valg. Prøv igen.");
                    break;
            }
        }
    }

    // Metode til at oprette en ny opskrift
    public static Opskrift opretNyOpskrift(Scanner scanner) {
        Opskrift opskrift = new Opskrift();

        scanner.nextLine(); // Ryd bufferen

        // Indtastning af opskriftens navn
        System.out.print("Indtast opskriftens navn: ");
        String opskriftNavn = scanner.nextLine();
        opskrift.setOpskriftNavn(opskriftNavn);

        // Indtastning af ingredienser
        System.out.print("Indtast ingredienser: ");
        String ingredienser = scanner.nextLine();
        opskrift.setIngredienser(ingredienser);

        // Indtastning af instruktioner
        System.out.print("Indtast instruktioner: ");
        String instruktioner = scanner.nextLine();
        opskrift.setInstruktioner(instruktioner);

        // Viser den oprettede opskrift
        System.out.println("\nOpskrift oprettet:\n" + opskrift);
        return opskrift;
    }

    // Metode til at gemme en opskrift til en fil
    public static void gemOpskriftTilFil(Scanner scanner, Opskrift opskrift) {
        scanner.nextLine(); // Ryd bufferen

        // Indtastning af filnavn
        System.out.print("Indtast filnavn: ");
        String filnavn = scanner.nextLine();

        // Gemmer opskriften til filen
        Opskrift1.gemOpskriftTilFil(filnavn, opskrift);
    }

    public static void indlæsOpskrift(Scanner scanner) {
        scanner.nextLine(); // Ryd bufferen

        // Indtastning af filnavn
        System.out.print("Indtast filnavn: ");
        String filnavn = scanner.nextLine();

        // Indlæser opskriften fra filen
        Opskrift indlæstOpskrift = Opskrift1.indlæsOpskrift(filnavn);

        if (indlæstOpskrift != null) {
            // Viser den indlæste opskrift
            System.out.println("Opskrift indlæst:\n" + indlæstOpskrift);
        }
    }
}//Main slutter

// Klassen Opskrift repræsenterer en opskrift med opskriftNavn, ingredienser og instruktioner
class Opskrift {
    private String opskriftNavn;
    private String ingredienser;
    private String instruktioner;

    // Metoder til at skrive eller ændre(set) og hente(get) info til opskriften
    public String getOpskriftNavn() {
        return opskriftNavn;
    }

    public void setOpskriftNavn(String opskriftNavn) {
        this.opskriftNavn = opskriftNavn;
    }

    public String getIngredienser() {
        return ingredienser;
    }

    public void setIngredienser(String ingredienser) {
        this.ingredienser = ingredienser;
    }

    public String getInstruktioner() {
        return instruktioner;
    }

    public void setInstruktioner(String instruktioner) {
        this.instruktioner = instruktioner;
    }

    @Override
    public String toString() {
        return "Opskrift: " + opskriftNavn + "\nIngredienser: " + ingredienser + "\nInstruktioner: " + instruktioner;
    }
}//Opskrift slutter

// Klassen Opskrift1 har metoder til at gemme og indlæse opskrifter fra filer
class Opskrift1 {

    // Gemmer en opskrift til en fil
    public static void gemOpskriftTilFil(String filnavn, Opskrift opskrift) {

        //Opretter en try-catch blok. Som bruges til at håndtere Exceptions, der kan opstå under udførelsen af kode
        try {

            FileWriter writer = new FileWriter(filnavn); //Filewriter bruges til at skrive opskriften i filen
            writer.write("Opskrift: " + opskrift.getOpskriftNavn() + "\nIngredienser: " + opskrift.getIngredienser() + "\nInstruktioner: " + opskrift.getInstruktioner());
            writer.close(); //Filewriter lukkes og derved frigøres som sørger for at filen er gemt korrekt
            System.out.println("Opskrift gemt i filen: " + filnavn);

        } catch (IOException e) {

            e.printStackTrace(); //Fanger exception og udskriver dem som fejlkode
        }
    }

    // Indlæser en opskrift fra en fil
    public static Opskrift indlæsOpskrift(String filnavn) {
        try {

            Scanner scanner = new Scanner(new File(filnavn));
            Opskrift opskrift = new Opskrift();

            // Læs opskriftsoplysninger fra filen
            String opskriftNavn = scanner.nextLine();
            String ingredienser = scanner.nextLine();
            String instruktioner = scanner.nextLine();

            // Sæt opskriftens oplysninger
            opskrift.setOpskriftNavn(opskriftNavn);
            opskrift.setIngredienser(ingredienser);
            opskrift.setInstruktioner(instruktioner);

            return opskrift;

        } catch (FileNotFoundException e) {
            e.printStackTrace(); //Fanger exception og udskriver dem som fejlkode
            return null;
        }
    }
}//Opskrift 1 slutter