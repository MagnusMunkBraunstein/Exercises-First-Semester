package DicemanPrograms;

import java.util.Random;

public class Diceman1_M_Switch {
    public static void main(String[]args) {
        Random gen=new Random();
        int dice=gen.nextInt(6)+1;
// man kan istedte for en pil (->) lave kolon (:) dog skal man så i linjen under skirve (break;)
        switch (dice) {
            case 1 -> System.out.println("A");
            case 2 -> System.out.println("B");
            case 3 -> System.out.println("C");
            case 4 -> System.out.println("D");
            case 5 -> System.out.println("E");
            case 6 -> System.out.println("F");
        }
    }
}
