package FigurerHøjdeAreal;
import java.util.ArrayList;

public class Figurer { // class figurer start
    public static void main(String[] args) { // main start
        Figur f1 = new Rektangel(4,3);
        Figur f2 = new Punkt();
        Figur f3 = new Rektangel(3,4);

        ArrayList<Figur> list=new ArrayList<Figur>();
        list.add(f1);
        list.add(f2);
        list.add(new Rektangel(2,5));
        for (Figur f: list){
            System.out.println(f+" 0mkreds="+f.BeregnOmkreds()+" Areal="+f.BeregnAreal());
        }
    } //main end
} // class figuerer end

//---------------------------------------------------------------------------------------------------------------------

abstract class Figur{ // class Figur start
    abstract double BeregnOmkreds();
    abstract double BeregnAreal();
} // class Figur end

//---------------------------------------------------------------------------------------------------------------------
class Punkt extends Figur{
    double BeregnOmkreds(){return 0;}
    double BeregnAreal(){return 0;}
    public String toString(){return "Punkt";}
}
//---------------------------------------------------------------------------------------------------------------------
class Rektangel extends Figur {
    double hojde;
    double brede;

    Rektangel(double h, double b) {
        hojde = h;
        brede = b;
    }

    double BeregnOmkreds(){
        return 2 * (hojde + brede);
    }
    double BeregnAreal(){
        return hojde*brede;
    }
    public String toString(){
        return "Rektangel Højde= "+hojde+" Rektangel Brede= "+brede;
    }
}
//-------------

