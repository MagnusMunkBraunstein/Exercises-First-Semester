package Portoforbreve;

public class PortoForEtBrev2 {
    public static void main(String[] args){
        java.util.Scanner tastatur = new java.util.Scanner(System.in);
        System.out.println("Undersøg brevets vægt");
        System.out.println("indtast brevets vægt");
        // Vægt er i kg

        double vaegt;
        vaegt = tastatur.nextInt();
        if (vaegt <= 1)
            System.out.println("Prisen er 20 kr");
       else if (vaegt <= 2)
            System.out.println("Prisen er 40 kr");
       else if (vaegt <= 3)
            System.out.println("Prisen er 60 kr");
       else if (vaegt <= 4)
            System.out.println("Prisen er 80 kr");
    }
}
