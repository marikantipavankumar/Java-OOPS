// Mulitiple Inheritence....

// Multiple inheritence is the process of acquiring the methods and properties  from the multiple classes at the same time


class G_Parent1{
    float height = 5.5f;
    int n_children = 5;

    void G_children(){
        System.out.println("No. of children Grand parents has is :" +n_children);
    }

}

class Parent1 extends  G_Parent1{

    int p_children = 3;

    void p_children(){
        System.out.println("No. of children parent has is:"+p_children);

        super.G_children();
    }
}

class Child1 extends G_Parent1{
    int c_children = 0;

    void c_children(){
        System.out.println("No.of children the child has is: "+c_children);
        //super.p_children();
        super.G_children();
    }
}


public class Multiple_Inheritence {
    public static void main(String[] args) {
        
    }
}
