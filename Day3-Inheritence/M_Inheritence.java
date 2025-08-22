class G_Parent{
    float height = 5.5f;
    int n_children = 5;

    void G_children(){
        System.out.println("No. of children Grand parents has is :" +n_children);
    }

}

class Parent extends  G_Parent{

    int p_children = 3;

    void p_children(){
        System.out.println("No. of children parent has is:"+p_children);

        super.G_children();
    }
}

class Child extends  Parent{
    int c_children = 0;

    void c_children(){
        System.out.println("No.of children the child has is: "+c_children);
        super.p_children();
        super.G_children();
    }
}


public class M_Inheritence {
    public static void main(String[] args) {
         
        Child c = new Child();
        c.c_children();

        Parent p = new Parent();
        p.p_children();

        G_Parent gp = new G_Parent();
        gp.G_children();
    }
}
