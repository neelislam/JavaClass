
public class Main {


    public static void main(String[] args) {
            Generic d = new Generic();
        System.out.print("Stident Name");
            d.<String> Generic("Neel Islam");
        System.out.print("Stident ID");
            d.<Integer> Generic(96);
        System.out.print("CGPA: ");
            d.<Double> Generic(3.00);
        System.out.print("Full ID: ");
        d.<Long>Generic(182220012101096L);
        System.out.print("Grade: ");
        d.<Character> Generic('C');

        }
    }