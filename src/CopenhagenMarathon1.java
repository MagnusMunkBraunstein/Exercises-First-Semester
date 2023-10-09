import java.util.Scanner;

public class CopenhagenMarathon1 {
    public static void main(String [] args){;

        printCopenhagenMarathon1("Peter Adams", "1556", "D");
        printCopenhagenMarathon1("Omar Farooq", "778", "p");
        printCopenhagenMarathon1("Lotte Nybo", "244", "k");

    }

    static void printCopenhagenMarathon1(String name, String number, String group) {
        System.out.println("Dear" + name + "!");
        System.out.println("We are happy to recieve you registration ");
        System.out.print("you start number is " + number);
        System.out.println(" You start in the group " + group);
        System.out.println("please check in 10 minutes before start");
        System.out.println();
    }
}