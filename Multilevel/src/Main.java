public class Main {
    public static void main(String[] args) {
        son s = new son();
        System.out.println(s.companyName);
        System.out.println(s.totalWealth);

    }
}

class Father {
    String companyName="Orbitax";
    double totalWealth = 420;

}

class son extends Father{

}