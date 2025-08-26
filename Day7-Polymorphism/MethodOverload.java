class Ex1{
    void add(int a,int b){
        int sum = a+b;
        System.out.println(" sum  of integers a and b is :"+sum);
    }

     void add(int a,int b, int c){
        int sum = a+b+c;
        
        System.out.println("sum of three integer numbers is :" +sum);
    }

       void add(float a,float b){
        float sum = a+b;
        System.out.println("sum of the  floating two Numbers is: "+sum);
     }

     void add(float a,float b,float c){
        float sum = a+b+c;
        System.out.println("Sum of three floating  point numbers is :"+sum);

    }
}

public class MethodOverload {
    public static void main(String[] args){

        Ex1 a  = new Ex1();
        a.add(10,20);
        a.add(10,30,40);
        a.add(10.9f,83.9f);
        a.add(94.32f,93.8f,83.4f);
    }
}
