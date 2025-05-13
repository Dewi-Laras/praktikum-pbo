/*  Nama File    : Anjing.java
    Deskripsi    : Kelas turunan dari Anabul yang merepresentasikan 
                   hewan peliharaan jenis anjing. 
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : 14 Mei 2025 
*/

public class Anjing extends Anabul {
    public Anjing() {
        super();
    }

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(">> " + nama + " bergerak : melata");
    }

    @Override
    public void suara() {
        System.out.println(">> " + nama + " berbunyi : guk-guk");
    }
}