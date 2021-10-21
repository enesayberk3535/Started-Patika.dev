import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int e;
        int toplam = 0 ;
        do {


            System.out.println("Bir sayı giriniz :");
            e = inp.nextInt();
            if(e %2 == 1  ){
             toplam += e;
            }
        } while(e > 0 );
        System.out.println("Toplam :" + toplam);
    }
}
