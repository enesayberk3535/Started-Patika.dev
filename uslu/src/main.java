import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int n, k;
        System.out.println("Sayı :");
        n = inp.nextInt();
        System.out.println("Üs");
        k = inp.nextInt();

        int total = 1;
        for (int i = 1; i <= k; i++) {
            total = total * n;

        }
        System.out.println("Sonuç :" + total );
    }
}
