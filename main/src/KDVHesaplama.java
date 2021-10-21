import java.util.Scanner;
public class KDVHesaplama {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        System.out.println("Ürün tutarını giriniz : ");
        double tutar = inp.nextInt() ;
        System.out.println("KDV'siz fiyat : " + tutar);
        double kdv = (tutar*18/100);
        double kdvtutar = (tutar*18/100+tutar);
        System.out.println("KDVli tutar : "+ kdvtutar);
        System.out.println("KDV oranı : "+ kdv);
    }
}
