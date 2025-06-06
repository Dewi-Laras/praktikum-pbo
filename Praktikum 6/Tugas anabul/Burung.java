/*  Nama File    : Burung.java
    Deskripsi    : Kelas turunan dari Anabul yang merepresentasikan hewan peliharaan jenis burung. 
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : 27 April 2025 
*/

public class Burung extends Anabul {
    public Burung() {
        super();
    }

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak : terbang");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi : cuit");
    }
}