import java.util.Scanner;
public class vke {
    public static void main(String args[]){
        Scanner imp = new Scanner(System.in);
        double boy , kilo , endeks ;

        System.out.println("Lütfen boyunuzu giriniz (metre cinsinden )  : ");
        boy = imp.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo = imp.nextDouble();
        endeks = kilo / (boy * boy);
        System.out.println("Vücut kitle endeksiniz : " + endeks );
    }

}
