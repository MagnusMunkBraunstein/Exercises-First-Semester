import java.util.Scanner;
// computeren generer et nummer du skal gætte :-)
public class GuessANumber {
    public static void main(String[] args) {
        guess();
    }

    static void guess() {
            Scanner sc = new Scanner(System.in);
            int bud = 0;
            int antal = 0;
            int tal = (int) (Math.random()*100+1);

            while (bud != tal){
                antal++;
                System.out.println("Gæt et tal i intervallet [1-100]");
                bud = sc.nextInt();
                if (bud < tal) {
                    System.out.println("for lavt");
                }
                if (bud > tal) {
                    System.out.println("For højt");
                }
            }
            System.out.println("Korrekt");
            System.out.println("Du har brugt "+antal+" forsøg");
        }
    }

