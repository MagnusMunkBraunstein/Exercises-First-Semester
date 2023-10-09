package Dicegame;

public class OneHundred {
    Player p1 = new Player("Bjarke");
    Player p2 = new Player("Martin");
    Player p3 = new Player("Find");
    int Rounds = 0;

    void Play() {
        System.out.println(p1.name + "\t" + p2.name + "\t" + p3.name);
        while (true) {
            Rounds++;
            p1.turn();
            if (p1.points >= 100) {
                System.out.println("Tillykke Bjarke du har " + p1.points + " og har brugt " + Rounds + " ture");
                break;
            }
            p2.turn();
            if (p2.points >= 100) {
                System.out.println("Tillykke Martin du har " + p2.points + " og har brugt " + Rounds + " ture");
                break;
            }
            p3.turn();
            if (p3.points >= 100) {
                System.out.println("Tillykke Find du har " + p3.points + " og har brugt " + Rounds + " ture");
                break;

            }
            System.out.println(p1.points+"\t\t "+p2.points+"\t\t"+p3.points);
        }
    }

    public static void main(String[] args) {
        OneHundred game = new OneHundred();
        game.Play();
    }
}