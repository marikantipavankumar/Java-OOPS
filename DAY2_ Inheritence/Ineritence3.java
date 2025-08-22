class Shape{
    void area(){
        System.out.println("This methos is used to print the area of the particular shape:");
    }
}

class Circle extends  Shape{
   float area(int r){
        float pi = 3.14f;

        float area = pi*r*r;
        return  area;
    }
}

class Rectangle extends Shape{
    float area(int l,int b){
        float area = l * b;

        return area;
    }
}


public class Ineritence3 {
    public static void main(String[] args) {
        
     Circle c = new Circle();
     float C_area = c.area(84);
     System.out.println("Circle area is: "+C_area);


     Rectangle r = new Rectangle();
    float R_area = r.area(78,89);
    System.out.println("Rectangle area is:"+R_area);
    }
}
