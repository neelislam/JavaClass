public class Bike extends Honda{
    int a = 1;
    Bike(){ //Default constructor
        System.out.println("Default constructor");
    }
    Bike(String name){ //Parameterized constructor
        System.out.println(name);
    }

    void nanga (){
        System.out.println("Nanga biking");
    }

}
