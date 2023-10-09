public class Polynomier {
    public static void main(String[] args) {
        Polynomium p1 = new Forstegradspolynomium(10,20);
        System.out.println("Resusltatet af p1 = "+p1.f(10));
        Polynomium p2 = new Andengradspolynomium(10,20,30);
        System.out.println("Resultatet af p2 = "+p1.f(10));
    }
}
//----------------------------------------------------------------------------------------------------------------------
abstract class Polynomium{
abstract double f(double x);
}
//----------------------------------------------------------------------------------------------------------------------
class Forstegradspolynomium extends Polynomium {
    double a, b;
    Forstegradspolynomium(double A, double B){
a = A;
b = B;
}
double f(double x){
        return a*x+b;
}
}
//----------------------------------------------------------------------------------------------------------------------
class Andengradspolynomium extends Polynomium{
    double a, b ,c;
    Andengradspolynomium(double A, double B, double C){
        a = A;
        b = B;
        c = C;
    }
    double f(double x){
       return a*x*x+b*x+c;
    }
}