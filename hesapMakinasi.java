import java.util.Scanner;
import java.util.logging.SocketHandler;

public class hesapMakinasi {
    static void toplama() {
        Scanner inp = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.println(i++ + ". Sayı");
            number = inp.nextInt();

            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç" + result);
    }

    static void cikarma() {
        Scanner inp = new Scanner(System.in);
        int number, result = 0, sayı;
        System.out.print("Kaç adet sayı gireceksiniz :");
        sayı = inp.nextInt();
        for (int i = 1; i <= sayı; i++) {
            System.out.print(i + ". Sayı");
            number = inp.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
                result-=number;

            }
            System.out.println("Sonuç :" + result);
        }

    static void carpma() {
        Scanner inp = new Scanner(System.in);
        int number, result = 1, i = 1;
        while (true) {
            System.out.println(i++ + ". Sayı");
            number = inp.nextInt();
            if (number == 1)
                break;
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç" + result);
    }
    static void bolme () {
        Scanner inp = new Scanner(System.in);
        double number, result = 0.0;
        int sayı;
        System.out.print("Kaç adet sayı gireceksiniz :");
        sayı = inp.nextInt();
        for (int i = 1; i <= sayı; i++) {
            System.out.print(i + ". Sayı");
            number = inp.nextDouble();
            if (i != 1&& number==0) {
                System.out.println("Böleni Sıfır giremezsinz.");
                continue;
            }
            if (i==1){
            result=number;
            continue;
        }
            result/=number;
    }
        System.out.println("Sonuç :" + result);
    }

    static void ushesap(){
       Scanner inp =new Scanner(System.in);
        System.out.println("Taban değeriniz giriniz :");
        int a= inp.nextInt();
        System.out.println("Üs değerini giriniz :");
        int b= inp.nextInt();
        int result =1;

        for(int i=1;i<=b;i++){
            result*=a;
        }
        System.out.println("Sonuç :"+ result);
            }
    static void fakt(){
        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int a = inp.nextInt();
        int result=1;
        for (int i=1;i<=a;i++){
            result*=i;
        }
        System.out.println("Sonuç : "+result);
    }

    static void mod(){
        Scanner inp =new Scanner(System.in);
        System.out.println("1.sayı:");
        int a= inp.nextInt();
        System.out.println("2.sayı:");
        int b= inp.nextInt();
        int result =0;
        result=a%b;
        System.out.println("Sonuç :"+result);
        }

    static void dikt(){
        Scanner inp =new Scanner(System.in);
        System.out.println("Dikdörtgenin 1.kenarı:");
        int a= inp.nextInt();
        System.out.println("Dikdörtgenin 2.kenarı:");
        int b= inp.nextInt();

        System.out.println("Çevresi :" + (2* (a+b)));
        System.out.println("Alanı :" + a*b);
    }

    public static void main(String[] args) {
        int select;

        Scanner inp =new Scanner(System.in);

        String menu = "1-Toplama işlemi:\n"
                +"2-Çıkarma İşlemi :\n"
                +"3-Çarpma İşlemi :\n"
                +"4-Bölme İşlemi :\n"
                +"5-Üslü sayı Hesaplama :\n"
                +"6-Faktoriyal Hesaplama : \n"
                +"7-Mod Alma : \n"
                +"8-Dikdörtgenin Çevresi ve Alanını Hesaplama :\n"
                +"0-Çıkış yap";

        System.out.println(menu);

        while (true){
            System.out.print("Lütfen bir seçim yapınız :");
            select= inp.nextInt();

            if (select==0) {
                break;
            }



            switch (select){
                case 1:
                    toplama();
                    break;
                    case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;

                case 5:
                    ushesap();
                    break;
                    case 6:
                   fakt();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    dikt();
                    break;
                default:
                    System.out.println("Geçersiz bir sayı girdiniz.");
            }
        }
        System.out.println("Güle güle");


    }
}
