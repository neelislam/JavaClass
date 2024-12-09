interface Multiplication {
    int mul(int a, int b, int c);
}

public class Main {
    public static void main(String[] args) {

        Multiplication ml = (a, b, c) -> (a * b * c);
        System.out.println(ml.mul(2, 3, 4));
    }
    Multiplication pass = (int a, int b, int c) -> {
        return (a*b*c);
    };
    System.out.println(pass.mul(59, 60, 70));
}



