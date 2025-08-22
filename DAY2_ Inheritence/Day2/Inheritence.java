package Day2;


class calc{
     public int add(int n1,int n2){
        return n1 + n2;
     }

     public int sub(int n1,int n2){
        return n1 - n2;
     }

     public int mul(int n3,int n4){
        return n3 * n4;
     }
     
     public int div(int n1,int n2){
        return n1/n2;
     }
}


public class Inheritence {
    public static void main(String[] args) {
    calc obj  = new calc();
    int n1 = obj.add(10,30);
    int  n2 = obj.sub(49,70);

    int n3 = obj.mul(59,39);
    int n4 = obj.div(85,93);

    System.out.println(n1+" " + n2);

    System.out.println("Mul :"+n3+",div :"+n4);
}

}