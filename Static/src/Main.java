
public class Main {
    Main(){
        System.out.println("Welcome");

    }
    static int count = 2;
    Main(int n){
        count ++;
        System.out.println(count);

    }
    public static void main(String[] args) {
        Main a = new Main(1);
        Main b = new Main();
        Main c = new Main(5);
    }
}