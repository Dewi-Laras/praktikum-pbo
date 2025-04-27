/*  Nama File    : MainAnabul.java
    Deskripsi    : Kelas untuk menguji penerapan polimorfisme pada objek-objek turunan dari kelas Anabul, yaitu Kucing, Anjing, dan Burung.  
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : 27 April 2025 
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

        for (Anabul a : peliharaan) {
            a.bersuara();
            a.gerak();
            System.out.println(); 
        }
    }
}