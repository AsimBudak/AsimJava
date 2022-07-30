package Projects.FilmTahmini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmTahmini {
    static List<String> filmler = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON",
            "GODFATHER", "JURASSICPARK", "TITANIC"));
    /*
     TASK :
      yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
      filmin index nosuna göre sectiriniz
      seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
      sağlayan method create ediniz...
      Ahanda TRICK...
      kullanıcının sectiği filmin harf sayısını  console yazdırınız.
      kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
      kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
      kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
      kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

     */
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        //Scanner scan =new Scanner(System.in);

        System.out.println("<<< FILM TAHMIN OYUNUNA HOSGELDINIZ >>>");

        System.out.println("1-" + (filmler.size()) + " arasinda bir sayi giriniz : ");
        int secilenFilmIndex = scan.nextInt();
        filmGetir(filmler, secilenFilmIndex);


    }

    private static void filmGetir(List<String> filmler, int secilenFilmIndex) {

        StringBuilder tahminEdilecekFilm = new StringBuilder(FilmTahmini.filmler.get(secilenFilmIndex).replaceAll("\\w", "-"));//tum harf karakterleri - ile değiştir
        System.out.println(tahminEdilecekFilm);
        System.out.println(filmler.get(secilenFilmIndex).length() + " harfli yabanci film sectiniz. Filmi tahmin etmek icin " + 2 * filmler.get(secilenFilmIndex).length() + " hakkınız var .");

        char harf = ' ';
        int tahminSayisi = 0;
        int dogruTahminSayisi = 0;
        String str = "";

        do {
            System.out.print("yanlıs tahmin sayisi: " + (tahminSayisi - dogruTahminSayisi) + "/" + 2 * filmler.get(secilenFilmIndex).length() + "\ntahmin ettiginiz harfi giriniz : ");//yanlıs girilen tahmin sayisini print edildi
            harf = scan.next().toUpperCase().charAt(0);//film için tahmin edilen harf alındı
            str += harf;//harf str'ye atandı
            if (!tahminEdilecekFilm.toString().contains(str)) {//tahminEdilecekFilm'de kullanıcıdan alınan harf yoksa tahmin sayısı artılıdı
                tahminSayisi++;
            } //else {//tahminEdilecekFilm'de kullanıcıdan alınan harf varsa tekrar uyarısı verildi
            //     System.out.println(str + " harf zaten acıldı");
            // }
            for (int i = 0; i < tahminEdilecekFilm.length(); i++) {
                if (filmler.get(secilenFilmIndex).charAt(i) == harf) {//tahmin listeki edilen harf filmde varsa
                    if (!tahminEdilecekFilm.toString().contains(filmler.get(secilenFilmIndex).substring(i, i + 1))) {
                        //tahmin edien harf listteki filmde var ama tahminedilecek (---)filmde yoksa doğru tahmin ettin
                        dogruTahminSayisi++;
                    }
                    tahminEdilecekFilm.setCharAt(i, harf);//dogru tahmin edilen harf tahmineilcekfilme indexe göre atandı

                }

            }
            if (tahminEdilecekFilm.toString().equalsIgnoreCase(filmler.get(secilenFilmIndex))) {
                System.out.println("tebrikler kazndınız");
                System.out.println("tahmin ettiğiniz film : " + tahminEdilecekFilm);
                break;
            }
            System.out.println(tahminEdilecekFilm);

        } while ((tahminSayisi - dogruTahminSayisi) != 2 * filmler.get(secilenFilmIndex).length());//yanlış sayısı verilen hakka ulaşana kadar do body calışır

        if ((tahminSayisi - dogruTahminSayisi) == 2 * filmler.get(secilenFilmIndex).length()) {
            System.out.println("yanlis tahmin sayisi : " + (tahminSayisi - dogruTahminSayisi));
            System.out.println("agam game over yine bekleriz....tahmin edemedigin film : " + filmler.get(secilenFilmIndex));
        }

    }
}
