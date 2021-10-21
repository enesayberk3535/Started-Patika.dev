import java.util.Scanner;
public class manav {
    public static void main(String args[]){
        Scanner imp = new Scanner(System.in);
        double armut,elma,domates,muz,patlican ;
        System.out.print("Armut kaç kilo : ");
        armut = imp.nextDouble();
        double armutkg = armut*2.14;
        System.out.print("Elma kaç kilo : ");
        elma = imp.nextDouble();
        double elmakg = elma*3.67 ;
        System.out.println("Domates kaç kilo : ");
        domates = imp.nextDouble();
        double domateskg = domates*1.11 ;
        System.out.println("Muz kaç kilo : ");
        muz = imp.nextDouble();
        double muzkg = muz*0.95 ;
        System.out.println("Patlican kaç kilo : ");
        patlican = imp.nextDouble();
        double patlicankg = patlican*5.0 ;
        double toplam = armutkg + elmakg + domateskg + muzkg + patlicankg ;
        System.out.printf("Toplam tutar : " + toplam );



    }
}
