package DicemanPrograms;

import java.util.Random;

public class Diceman1 {
    public static void main(String[]args) {
        Random gen=new Random();
        //ved brug af denne kode kommer der 6 mulige udfald 0,1,2,3,4 og 5. "6" er altså ikke med
        int dice=gen.nextInt(6)+1;
        // Årsagen til at der i linje 7 står"(6)+1 er fordi man man istedet for [0-5] vil have [1-6]

        String activity="";

        System.out.println("DicemanPrograms.Diceman1");
        if (dice==1) {
            activity="Breakfest";
        } else
        if (dice==2) {
            activity="Study";
        } else
        if (dice==3) {
            activity="Swim";
        } else
        if (dice==4) {
            activity="Go Fishing";
        } else
        if (dice==5) {
            activity="Call MoM";
        }
        if (dice==6) {
            activity="Back to bed";
        }
        System.out.println(activity);
    }
}
