/*  Nama File    : Kucing.java
    Deskripsi    : Kelas turunan dari Anabul yang merepresentasikan 
                   hewan peliharaan jenis kucing. 
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : 14 Mei 2025 
*/

public class Kucing extends Anabul {
    public Kucing() {
        super();
    }

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(">> " + nama + " bergerak : melata");
    }

    @Override
    public void suara() {
        System.out.println(">> " + nama + " berbunyi : meong");
    }
}