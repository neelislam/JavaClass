public class Calculate extends Bap{
    String name;

    static int cube(int x){
        return x*x*x;
    }
    static int a = 10;
    static int b = 5;
    static void access(){
        a = 20;
        b =8;

    }

    void methor(String name){
        System.out.println("Ami Methor");
        this.name = name;
    }





}
