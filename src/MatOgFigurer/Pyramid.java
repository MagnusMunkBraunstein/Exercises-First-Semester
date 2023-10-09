package MatOgFigurer;

public class Pyramid { //public class start
   public static void main(String[] args){//main start

       Usepyramid p1 = new Usepyramid(1,2,3,4);
       System.out.println("arealet af pyramide 1 ="+p1);
       Usepyramid p2 = new Usepyramid(2,6,7,4);
       System.out.println("arealet af pyramide 2 ="+p2);
       Usepyramid p3 = new Usepyramid(6,5,9,4);
       System.out.println("arealet af pyramide 3 ="+p3);

    }//main end
}//public class end

class Usepyramid {//Start class
    double side;
    double laengde;
    double hight;
    double dvfac;
    Usepyramid(double sd,double ld, double ht, int df){
        side=sd;
        laengde=ld;
        hight=ht;
        dvfac=df;
    }//end constructor
public String toString(){ //"to string" start
    return" volume = "+side*laengde*hight/dvfac;


    }//tostring end
}// end class


