import java.util.Scanner;

public class main {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        double tutar , çocuk , genç , yaşlı , indirimlitutar , gidişdönüş ;
        int yaş , mesafe ,tip ,  toplam;
        boolean isError = true ;

        System.out.print("Mesafeyi km türünden giriniz :");
        mesafe = inp.nextInt();
        System.out.print("Yaşınızı giriniz :");
        yaş = inp.nextInt();
        System.out.print("1 => Tek Yön \n 2 => Gidiş - Dönüş ");
        tip = inp.nextInt();
        tutar = mesafe * 0.10 ;
        switch (tip) {
            case 1:
                if (yaş < 12 && yaş>0) {
                    çocuk = tutar * 0.5;
                    System.out.println("Toplam tutar :" + çocuk);
                }
                else if (yaş < 24 && yaş>12) {
                    genç = tutar * 0.1;
                    indirimlitutar = tutar - genç;
                    System.out.println("Toplam tutar : " + indirimlitutar);
                }
                if (yaş > 65) {
                    yaşlı = tutar * 0.3;
                    indirimlitutar = tutar - yaşlı;
                    System.out.println("Toplam tutar : " + indirimlitutar);
                }
                else {
                    isError = false ;
                    System.out.println("Hata ! " );
                }

                break ;
            case 2 :
                gidişdönüş = tutar * 0.2 ;
                if (yaş < 12 && yaş > 0) {
                    çocuk = tutar * 0.5;
                    gidişdönüş = çocuk * 0.2 ;
                    System.out.println("Toplam tutar :" + gidişdönüş);
                }
                else if (yaş < 24 && yaş>12) {
                    genç = tutar * 0.1;
                    indirimlitutar = tutar - genç ;
                    gidişdönüş = indirimlitutar * 0.2;
                    indirimlitutar = indirimlitutar - gidişdönüş ;
                    System.out.println("Toplam tutar : " + indirimlitutar);
                }
                if (yaş > 65) {
                    yaşlı = tutar * 0.3;
                    indirimlitutar = tutar - yaşlı ;
                    gidişdönüş = indirimlitutar * 0.2 ;
                    System.out.println("Toplam tutar : " + gidişdönüş);
                }
                break ;
            default:
        }

    }
}
