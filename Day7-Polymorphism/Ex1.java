class Calculator{
    int add(int a,int b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }
}

public class Ex1{
    public static void main(String[] args) {
        Calculator c = new Calculator();
       int n1 =  c.add(10, 20);
       int n2 =  c.add(30,60);
       System.out.println("n1 is :"+n1 +" n2 is :"+n2);
        
    }

}