import java.awt.*;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {




        /*//Bilgisayar tarafından rastgele tutulan 10 sayıdan 50′ den büyük olanların ortalamasını bulan program

        Scanner input=new Scanner(System.in);
        int toplam=0,ortalama=0;
        for(int i=1;i<=10;i++)
        {
            System.out.print(i+". Sayıyı Giriniz: ");
            int sayilar=input.nextInt();
            if (sayilar>50)
            {
                toplam=toplam+sayilar;
            }
            ortalama=ortalama+i;
        }
        System.out.println("Ortalama= "+(toplam/ortalama));*/

        /*//Girilen Sayının Asal Olup Olmadığını Bulma

        byte dongu=1;
        while (dongu<2) {
            Scanner input = new Scanner(System.in);
            System.out.print("Bir Sayının Asal Olup olmadığını öğrenmek için sayı Girişi Yapın: ");
            int sayi = input.nextInt();
            boolean bolduMu = false;
            if(sayi>0) {
                for (int i = 2; i < sayi; i++) {
                    if (sayi % i == 0) {
                        bolduMu = true;
                        break;
                    } else {
                        bolduMu = false;
                    }

                }
                if (bolduMu == true) {
                    System.out.println("Girilen Sayı Asal Sayı Değildir.");
                    System.out.println("-------------------------------------------------");
                }
                else {
                    System.out.println("Girilen Sayı Asal Sayıdır.");
                    System.out.println("-------------------------------------------------");
                }
            }
            else
            {
                System.out.println("Pozitif Değerler Girin !!!");
                System.out.println("-------------------------------------------------");
            }
        }*/

       /* //Vize ve Final Notunu kullanıcıdan alarak Not 50 den büyükse Geçti Değilse Kaldı yazan Program (vizenin%40'ı finalın %60'ı alınacak)
        Scanner input=new Scanner(System.in);
        double not;
        System.out.print("Vize Notunuzu Giriniz: ");
        double vize= input.nextDouble();
        System.out.print("Final Notunuzu Giriniz: ");
        double finall= input.nextDouble();
        not=(vize*0.4)+(finall*0.6);
        System.out.println("Notunuz: "+not);
        if (not<50)
        {
            System.out.print("Kaldınız");
        }
        else
        {
            System.out.print("Geçtiniz");
        }*/

      /*  // 3 Müşterinin Yeni Kredi Limitini Belirle. Borç Yeni Limiti Geçiyorsa uyarı ver.
        Scanner input=new Scanner(System.in);
        int musteri1=25463;
        int musteri2=95364;
        int musteri3=36427;
        System.out.println(musteri1);
        System.out.println(musteri2);
        System.out.println(musteri3);
        System.out.print("Öğrenci Numaranızı Giriniz: ");
        int numara= input.nextInt();
        System.out.print("Mevcut Kredi Limitinizi Giriniz: ");
        int limit= input.nextInt();
        System.out.print("Borç Bakiyenizi Giriniz: ");
        int borc= input.nextInt();
        int yenilimit=limit/2;
        if (yenilimit<borc)
        {

            System.out.print("Yeni Limitiniz: "+yenilimit+" Borç Bakiyeniz: "+borc+" Yeni Limitinizi Geçiyor. Lütfen Kısa Zamanda Ödeme yapın.");

        }
        else
        {
            System.out.print("Yeni Limitiniz: "+yenilimit+" Borç Bakiyeniz: "+borc);
        }*/

        /*//Girilen Sayının Rakamlarının Toplamını Bulma
        Scanner input=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int sayi= input.nextInt();
        int toplam=0;
        while(sayi>0)
        {
            toplam=toplam+(sayi%10);
            sayi=sayi/10;
        }
        System.out.println("Sayının Basamaklarının Toplamı: "+toplam);*/

        /*//Yüksekliği girilen bir üçgen oluşturma

        Scanner input=new Scanner(System.in);
        System.out.println("Çizdirmek istediğiniz üçgenin yüksekliğini girin: ");
       int uzunluk= input.nextInt();

       for (int satir=1;satir<=uzunluk;satir++)
       {
           System.out.println("");
           for (int sutun=1;sutun<=satir;sutun++)
           {
               System.out.print("*");
           }
       }*/

        /*//Java While Döngüsü ile Faktöriyel Hesaplama
        Scanner input=new Scanner(System.in);
        System.out.print("Faktöriyelini merak ettiğiniz 'POZİTİF' sayıyı giriniz: " );
        int dongu= input.nextInt();
        int sonuc=1;
        int i=dongu;
        while (i>=1)
        {
            sonuc=sonuc*i;
            i--;

        }
        System.out.println("Faktöriyel Sonucu: "+sonuc);*/

       /* // Random Sistemi
        int toplam=0;
        for (int dongu=1;dongu<=10;dongu++)
        {
            Random sayi1 = new Random();
            int sayilar = sayi1.nextInt(90);
            if(sayilar>=50)
            toplam = toplam + sayilar;
            System.out.println(sayilar);

        }
        System.out.println(toplam);*/

        /*//Taş Kağıt Makas Oyunu

        int dongu=1;
        while (dongu<2) {
            Scanner input = new Scanner(System.in);
            System.out.println("TAŞ >= 1");
            System.out.println("MAKAS >= 2");
            System.out.println("KAĞIT >= 3");
            System.out.print("Seçeneklerden Birini Seçin: ");
            int sayi = input.nextInt();
            Random pcSayi = new Random();
            int pcRandomu = pcSayi.nextInt(1, 4);
            System.out.println("Bilgisayarın Seçtiği: " + pcRandomu);
            System.out.println("Sizin Seçtiğiniz: " + sayi);

            if (pcRandomu == 1 && sayi == 2) {
                System.out.println(" BİLGİSAYAR KAZANDI ");
                System.out.println(" ********************************************************************** ");
            }

            if (pcRandomu == 2 && sayi == 3) {
                System.out.println(" BİLGİSAYAR KAZANDI ");
                System.out.println(" ********************************************************************** ");
            }

            if (pcRandomu == 3 && sayi == 1) {
                System.out.println(" BİLGİSAYAR KAZANDI ");
                System.out.println(" ********************************************************************** ");
            }

            if (pcRandomu == 2 && sayi == 1) {
                System.out.println(" BİLGİSAYAR KAZANDI ");
                System.out.println(" ********************************************************************** ");
            }

            if (pcRandomu == 3 && sayi == 2) {
                System.out.println(" BİLGİSAYAR KAZANDI ");
                System.out.println(" ********************************************************************** ");
            }

            if (pcRandomu == 1 && sayi == 3) {
                System.out.println(" BİLGİSAYAR KAZANDI ");
                System.out.println(" ********************************************************************** ");
            }
            if (pcRandomu == sayi) {
                System.out.println(" BERABERE KALDINIZ ");
                System.out.println(" ********************************************************************** ");
            }

            else
            {
                System.out.println(" Verilen seçenekleri seçin ");
            }
        }*/

        /*//  Kullanıcıdan Girilen Aya göre Mevsimi Bulan Program Switch-Case

        Scanner input=new Scanner(System.in);
        System.out.print("Ay ismini küçük harflerle girin: ");
        String ay= input.next();
        switch (ay)
        {
            case "aralık":
            case "ocak":
            case "şubat": System.out.println("KIŞ MEVSİMİNDESİNİZ");
            break;

            case "mart":
            case "nisan":
            case "mayıs": System.out.println("İLKBAHAR MEVSİMİNDESİNİZ");
                break;

            case "haziran":
            case "temmuz":
            case "ağustos": System.out.println("YAZ MEVSİMİNDESİNİZ");
                break;

            case "eylül":
            case "ekim":
            case "kasım": System.out.println("SONBAHAR MEVSİMİNDESİNİZ");
                break;
        }*/




    }
}
