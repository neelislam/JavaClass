class wishes{
    void message(){
        System.out.println("Hey Java learner ");
    }
}

class Birthday{
    void message(){
        System.out.println("Happy Birthday Dear Friend");
    }
}


public class Multiple_Inheritance extends wishes,Birthday{ // here is showing error because compiler can't decide which message method is invoked
    public static void main(String [] args){
        Multiple_Inheritance ob = new Multiple_Inheritance();
        ob.message();
    }
}