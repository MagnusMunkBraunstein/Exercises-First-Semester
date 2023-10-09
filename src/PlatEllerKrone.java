import java.util.Random;

public class PlatEllerKrone {
    public static void main(String[] args) {
        Random gen=new Random();
        int tal=gen.nextInt(2);
        System.out.println("tal="+tal);

        if (tal ==0) {
            System.out.println("plat");
System.out.println("Tilykke du vandt");
        }
        else {
            System.out.println("krone");
            System.out.println("Du Tabte");
        }
    }
}
