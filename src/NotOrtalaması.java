import java.util.Scanner;

public class NotOrtalaması {
    public static void main(String[] args) {

  //DEĞİŞKENLERİ OLUŞTUR
       int mat,fizik,kimya,turkce,tarih,muzik;

  //Scanner oluşturalım

        Scanner sc = new Scanner(System.in);

//kullanıcadan değerler al

        System.out.print("Matematik notunuz: ");
        mat = sc.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = sc.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = sc.nextInt();

        System.out.print("Turkce notunuz: ");
        turkce = sc.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = sc.nextInt();


        System.out.print("Muzik notunuz: ");
        muzik = sc.nextInt();

  //Notların ortalamasını bul

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam/ 6;
        System.out.println("Not ortalaması: " + sonuc);














    }
}
