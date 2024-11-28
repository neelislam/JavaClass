interface Addable{
    int add(int a, int b);}

public class Main {
    public static void main(String[] args) {
        //LE without return Keyword
        Addable ad1 = (a,b) ->(a+b); {
            System.out.println(ad1.add(2,3));
        };
        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad2.add(59, 60));
    }




}
