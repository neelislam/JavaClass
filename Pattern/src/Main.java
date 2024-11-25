//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num = 1;
        for(int n = 1; n<5; n++){
            for(int p = 0;p<n;p++){
                System.out.print(" "+num);
                num++;
            }
            System.out.println();
        }
    }
}