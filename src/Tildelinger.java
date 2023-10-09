//beskriv hvad denne opgave går ud på uden at kører den.
public class Tildelinger {

        public static void main(String[] args){
            int a, b, c, d;
            // linje 0
            a = 5;
            b = 6;
            c = 7;
            d = 8;
            System.out.println("a  " +a+", b er " +b+", c er "+c+" og d er "+d);
            // linje 1
            a = b + d;
            d = c + a;
            System.out.println("a  " +a+", b er " +b+", c er "+c+" og d er "+d);
            // linje 2
            b = a;
            d = c;
            System.out.println("a  " +a+", b er " +b+", c er "+c+" og d er "+d);
            /*denne opgave viser hvordan mankan lagre data. Efter linje 0 kan man se at hhv. a, b ,c og d har fået
            værdier. Efter linje 1 ser vi hvordan man kan indsætte nye værdier i allerede eksistende definitioner.
            Efter linje 1 går a fra at være 5 som først givet til b+d som er 14.
            Ligeledes er d ikke 7 men 12.
            efter linje to kan det samme ses hvor b går fra at være 6 til 14 da a bliver sat ind som b værdi
            c som er 7 går ind, på d's plads og overskriver d til at blive 7 i stedet for 12
             */

    }
}
