class  CollegeMember{
    String name;
    int id;

     CollegeMember(String n,int id){

        this.name = n;
        this.id = id;
    }

    void displayMember(){
        System.out.println("college member :"+name +" id is:"+id);
    }
    
}

class Student extends CollegeMember{

    String course;

    Student(String course ,String name ,int id){
        super(name,id);
        this.course = course;
    }

    void displayStudent(){
        
      displayMember();
        System.out.println("Course is:"+course);
    }
}

class GraduetStudent extends Student{

    String thesisProject ;

    GraduetStudent(String thesisProject,String name,int id,String course) {
        super(course,name,id);
        this.thesisProject = thesisProject;

    }

    void displayGraduateStudent(){
        displayStudent();
        System.out.println("Student thesis is:"+thesisProject);
    }

    

}
public class Multilevel_Inheritence2 {
    public static void main(String[] args) {
        
    CollegeMember cm = new CollegeMember("pavan",9483);
    cm.displayMember();

    Student st = new Student("CSE", "Kiran", 1240);
    st.displayStudent();

    GraduetStudent gs = new GraduetStudent("machineLearning", "pavan", 12345,"ECE");
    gs.displayGraduateStudent();

}

}