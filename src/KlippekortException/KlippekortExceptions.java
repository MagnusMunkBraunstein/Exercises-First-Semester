package KlippekortException;

public class KlippekortExceptions {
    public static void main(String[] args) {

        klippeKort k1 = new klippeKort("a123");
        klippeKort k2 = new klippeKort("b123");
        System.out.println(k1);

        while (true) {
            System.out.println(k1);
            try {
                k1.klip();
            } catch (klippekortException exception){
                //exception.printStackTrace(); Denne buges til at se exeptions trace.
                System.out.println(exception);
                break;
            }
        }
        System.out.println("Tak for idag");
    }
}
//----------------------------------------------------------------------------------------------------------------------
class klippeKort {
    int antalKlip = 10; // Resterende klip
    String unkiktID; // specielle nummer som alle klippekort har.

    klippeKort(String unkiktID) {
        this.unkiktID = unkiktID;
    }

    void klip() throws klippekortException {
        if (antalKlip==0) throw new klippekortException(unkiktID);

        antalKlip--;
    }

    @Override
    public String toString() {
        //return super.toString();
            return "Klippekort " + unkiktID + " antalklip " + antalKlip;
        }
    }

//----------------------------------------------------------------------------------------------------------------------
class klippekortException extends Exception{
    String uniktID;
    klippekortException(String uniktID){
    this.uniktID = uniktID;
    }
    @Override
    public String toString() {
        return "KlippekortExeption for kort "+uniktID;
    }
}
