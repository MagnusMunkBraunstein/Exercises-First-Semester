package MatOgFigurer;

public class Sum {
    public static void main(String[] args ){
    int a=3;
    int b=5;
    int c=18;
    int sum;
                     sum=sum(a,b,c);
                     System.out.println("summen er "+sum);
    }

    static int sum(int x, int y, int z){
        int resultat = x+y+z;
        return resultat;
    }
}

