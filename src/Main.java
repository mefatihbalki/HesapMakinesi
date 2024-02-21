import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;
                //Kullanıcıdan Alınan Değerler
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        n1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = input.nextInt();
                //Kullanıcın Select ile işlem Seçimi
        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
        System.out.print("İşlem Seçimini Yapınız: ");
        select = input.nextInt();

                //Switch-Case adımları ile Kullanıcın değerleri seçimine göre değerlenir.
        switch (select) {
            case 1:
                System.out.println("Toplama Sonucu: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma Sonucu: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma Sonucu: " + (n1 * n2));
                break;
            case 4:

                //n1 0 değerlendirmesi durumunda
                if (n2 == 0) {
                    System.out.println("0 Bölünemez!");
                }else {
                    System.out.println("Bölme Sonucu: " + (n1 / n2));
                }break;

                //Yanlış Seçim Yapıldığında Karşılanacak Uyarı
            default:
                System.out.println("Hatalı Bir Seçim Gerçekleştirdiniz!");
                //Program Bitişi
        }
    }
}
