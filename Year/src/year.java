import java.util.Scanner;
public class year {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int yil , artıkyıl , artıkyıl2 ,artıkyıl3;
        System.out.print("Yıl Giriniz : ");
        yil = inp.nextInt();
        artıkyıl = yil%4 ;
        artıkyıl2 = yil%400;
        artıkyıl3 = yil%100 ;
        if(artıkyıl3 == 0 && artıkyıl2 != 0 ){
            System.out.println(yil + "\n Bir artık yıl değildir!");
        }
        else if(artıkyıl==0 || artıkyıl2==0){
            System.out.println(yil+"\n Bir artık yıldır ! ");
        }
        switch (artıkyıl){
            case 1 :
                System.out.println(yil + "\nBir artık yıl değildir !");
                break ;
            case 2 :
                System.out.println(yil + "\n Bir artık yıl değildir !");
                break ;
            case 3 :
                System.out.println(yil + "\nBir artık yıl değildir !");
                break ;
        }
    }
}
