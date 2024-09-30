class Student{
    public void methodStudent(){
        System.out.println("I am a Student");
    }
}

class Science extends Student{
    public void methodScience(){
        System.out.println("Student of Science");
    }
}

class Commerce extends Student{
    public void methodCommerce(){
        System.out.println("Students of Commerce");
    }
}

class Arts extends Student{
    public void methodArts(){
        System.out.println("Student of Arts");
    }
}

public class Hierarchical {
    public static void main(String [] args){
        Science sci = new Science();
        Commerce com = new Commerce();
        Arts art = new Arts();

        sci.methodScience();
        sci.methodStudent();
        com.methodCommerce();
        art.methodArts();

    }
}