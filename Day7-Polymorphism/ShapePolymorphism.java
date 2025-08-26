abstract class Shape{
    abstract void shape();
}

class Circle extends Shape{
    @Override
    void shape(){
        int r =  10;
        float pi = 3.17f;
       float area =  pi*r*r;
       System.out.println("Area of the Circle is :"+area);
    }
}

class Rectangle extends Shape{
    @Override
    void shape(){
        int l = 93;
        int b = 83;
        int area = l * b;

        System.out.println("Area of the Rectangle is:"+area);
    }
}
public class ShapePolymorphism {
    public static void main(String[] args) {
        Shape s;
        s = new Circle();
        s.shape();
        s= new Rectangle();
        s.shape();
    }
}
