package BankApp;
import java.time.LocalDate;
import java.util.ArrayList;

// Bankapp3 laver nye konti
public class Bankapp3 { //bk3 start
    public static void main(String args[]){ // main start

        account a1 = new Indlaan("Joe Pass", 5);
        account a2 = new Hojrente("Jimmy hendricks", 10, 10000, LocalDate.of(2023, 12, 24));

        ArrayList<account>list=new ArrayList<account>();
        list.add(a1);
        list.add(a2);

        for (account a: list) a.printTransactions();
        System.out.println();
        //for (account a: list) a.deposit(100);
        //for (account a: list) a.printTransactions();

    } // main end
} //bk3 end

class Indlaan extends account{ //Indlaan class start
Indlaan(String ow, double ir){
    super (ow,ir);

}//Construktor start

    void withdraw(double amount) {
    if (balance>=amount) {
       super.withdraw(amount);
    }
    else{//else start
        System.out.println("for lav saldo, du kan hæve  "+balance);
        }//else end
    }//withdraw end
}//indlaan class end

class Hojrente extends account{ //start
    LocalDate releaseDate;

    Hojrente(String ow, double ir, double startballance, LocalDate rd){
        super(ow, ir);
        super.deposit(startballance);
        releaseDate=rd;

    }
    void deposit(double amount) {
        System.out.println("Du kan ikke indsætte penge på denne konto");
    }
    void withdraw(double amount){
        if (releaseDate.isAfter(LocalDate.now())) {
            System.out.println("Du kan først hæve efter" + releaseDate);
        }
        else super.withdraw(amount);
    }
}