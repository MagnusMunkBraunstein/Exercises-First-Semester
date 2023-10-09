public class Biggestnumberof3 {
    public static void main(String[] args) {
        int a = 94;
        int b = 157;
        int c = 594;
        int d=max(a,max(b,c));

        System.out.println("Det største tal er : "+d);

    }


    static int max(int x, int y){

    if(x>y)
            return x;
    else
            return y;

    }
}
