package Day1;

public class ex2 {
    static int multiply(int a,int b){
        return a*b;
    }
    static  double multiply(double a,double b,double c){
        return a*b*c;
    }
    public static void main(String[] args) {
        ex2 ex = new ex2();
       int result =  ex.multiply(10, 20);
       System.out.println(result);
       double result1 =  ex.multiply(10.0,909.03,89.9);
       System.out.println(result1);
    }
}
