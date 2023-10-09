public class Invitation {
    public static void main(String[] args) {
        printInvitation("Find", "fodbold");
        printInvitation("Per", "kage");
        printInvitation("Egon", "PS5");
    }
    static void printInvitation(String name, String gave){
        System.out.println("Kære "+name);
        System.out.println("Det ville glæde mig at se dig til fødselsdag");
        System.out.println("Onsdag den 09/09/23)");
        System.out.println("Venlig hilsen Magnus");
        System.out.println("ps medbring gaven "+gave);
        System.out.println();
    }

}
