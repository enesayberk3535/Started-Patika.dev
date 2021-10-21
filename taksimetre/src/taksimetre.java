import java.util.Scanner;
public class taksimetre {
    public static void main(String args[]){

        Scanner inp = new Scanner(System.in);
        int km ;
        double perKm = 2.20, total = 0,startPrice = 10.0 ;
        System.out.println("Gidilen kilometre :");
        km = inp.nextInt();
        total = (km+perKm)+startPrice;
        total = (total < 20 ) ? 20 : total ;
        System.out.println("Toplam tutar : " + total);
    }
}
