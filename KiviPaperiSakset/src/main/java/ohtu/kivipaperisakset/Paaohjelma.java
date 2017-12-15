package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        KPSPelisovellus kpsPelisovellus = new KPSPelisovellus();
        String ohjeteksti = "peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s";
        while (true) {
            System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");

            String vastaus = scanner.nextLine();
            if (vastaus.endsWith("a")) {
                System.out.println(ohjeteksti);
                kpsPelisovellus.luoKaksinpeli();
            } else if (vastaus.endsWith("b")) {
                System.out.println(ohjeteksti);
                kpsPelisovellus.luoTekoalyPeli();
            } else if (vastaus.endsWith("c")) {
                System.out.println(ohjeteksti);
                kpsPelisovellus.luoParempiTekoalyPeli();
            } else {
                break;
            }

        }

    }
}