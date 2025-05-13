/*  Nama File    : MainAnabul.java
    Deskripsi    : Kelas untuk menguji penerapan polimorfisme dan generik 
                   pada objek-objek turunan dari kelas Anabul, yaitu Kucing, 
                   Anjing, dan Burung.  
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : 13 Mei 2025 
*/

import java.util.ArrayList;

public class MainAnabul {
    public static void main(String[] args) {
        Anabul h1 = new Kucing("Toto");
        Anabul h2 = new Anjing("Shiro");
        Anabul h3 =  new Burung("Sandy");

        ArrayList<Anabul> peliharaan = new ArrayList<>();

        peliharaan.add(h1);
        peliharaan.add(h2);
        peliharaan.add(h3);
        System.out.println("---====Parktikum Lanjutan Polimorfisme====---");

        for (Anabul a : peliharaan) {
            a.suara();
            a.gerak();
            System.out.println(); 
        }

        System.out.println("---====Simulasi dengan Generik====---");
        
        Datum<Anabul> datumKucing = new Datum<>(new Kucing("Tobi"));
        Datum<Anabul> datumAnjing = new Datum<>(new Anjing("Choco"));
        Datum<Anabul> datumBurung = new Datum<>(new Burung("Robi"));
    
        ContohMetodeGenerik util = new ContohMetodeGenerik();

        util.tampilkanDatum(datumKucing);
        util.tampilkanPerilakuAnabul(datumKucing);
        System.out.println();

        util.tampilkanDatum(datumAnjing);
        util.tampilkanPerilakuAnabul(datumAnjing);
        System.out.println();

        util.tampilkanDatum(datumBurung);
        util.tampilkanPerilakuAnabul(datumBurung);
        System.out.println();

        util.ubahIsi(datumBurung, new Burung("Rio"));
        System.out.println();

        Datum<Anabul> datumKucingLain = new Datum<>(new Kucing("Mimi"));
        boolean hasilBanding = util.samaDatum(datumKucing, datumKucingLain);
        System.out.println("Apakah datumKucing dan datumKucingLain sama? " + "\njawab : " + hasilBanding + "\n");    

    }
}