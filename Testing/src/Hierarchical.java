class Student{
    public void Student() {
        System.out.print("I am a ");
    }
}
class Science extends Student{
    public void Science() {
        System.out.println("Student of Science");
        super.Student();
    }
}
class Commerce extends Student{
    public void Commerce() {
        System.out.println("Students of Commerce");
    }
}
class Arts extends Student{
    public void Art() {
        System.out.println("Student of Arts");
    }
}
public class Hierarchical {
    public static void main(String [] args){
        Science sci = new Science();
        Commerce com = new Commerce();
        Arts art = new Arts();

        art.Art();
        sci.Science();
        com.Commerce();

    }

}