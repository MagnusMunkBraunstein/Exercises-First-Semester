public class MultiplicationsTabel {
    public static void main(String[] args) {
        for (int j = 1; j <= 10; j++) {

            for (int i = 1; i <= 10; i++) {
                //System.out.print(i * j + " ");
                System.out.printf("%5d", i * j);
// %5d     i denne komando er 5 afstanden. d betyder der kommer et tal

            }
            System.out.println();
        }
    }
}

//int i=1; er at oprette en variabel og sætter i til 1
//i<=10; er at i er mindre eller lig med 10
//i++ betyder at man tæller "i" en op - det betyder at den stiger med en hver gang loopet kører
// hvis ikke der ikke står i++ så fortsætter den for evigt
        /* første gang kører så tager den hele linjen (int i=1; i<=10; i++). og det vil lave tallet 1
        når den så kører igen så tager den kun i<=10; i++). Ud af dette vi tallet 2 komme da der er brugt i++
        som betyder at den går en op for hver gang loopet kører. Loopet vil kører indtil den rammer den
        definerede maksimale værdi som er 10.
         */