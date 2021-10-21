import java.util.Scanner;

public class square {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n ;
        System.out.println("Sınır sayısını giriniz :");
        n = scan.nextInt();

        for (int i = 1 ; i <= n ; i*=4){
            System.out.println(i);
        }
        for (int i = 1 ; i<= n ; i*= 5 ){
            System.out.println(i);
        }
    }
}
