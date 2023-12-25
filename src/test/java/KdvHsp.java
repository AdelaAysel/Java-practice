package test.java;

import java.util.Scanner;

public class KdvHsp {
    public static void main(String[] args) {

        /*
        Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 0.18;
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Para değerini giriniz: ");
        int fiat = sc.nextInt();
        double kdv = 0.18;
        double kdvFiat = (fiat + fiat*kdv);
        System.out.println("kdvFiat= " + kdvFiat);


    }
}
