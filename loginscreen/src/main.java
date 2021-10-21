import java.util.Scanner;
public class main {
    public static void main(String args[]){
        String username , password , password2 ;
        Scanner inp = new Scanner(System.in);
        System.out.println("Kullanici adiniz : ");
        username = inp.nextLine();
        System.out.println("Şifre giriniz : ");
        password = inp.nextLine() ;
        if ( username.equals("patika ") && password.equals("java123")){
            System.out.println("Giriş başarılı ! ");

        }
        else{
            System.out.println("Bilgileriniz yanlış ! ");
            System.out.println("Şifreinizi değiştirmek ister misiniz ? ");
        }
        System.out.println("Yeni Şifre : ");
        password2 = inp.nextLine();
        if ( password2.equals("java123")){
            System.out.println("Yeni şifreniz eskisi ile aynı olamaz ! ");
        } else {
            System.out.println("Yeni şifre oluşturuldu ! ");
        }
    }
}
