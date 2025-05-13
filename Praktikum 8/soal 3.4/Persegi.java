/*  Nama File    : Persegi.java
    Deskripsi    : Kelas turunan dari BangunDatar yang merepresentasikan bangun datar persegi. 
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : 4 Mei 2025
*/

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungKeliling() {
        return 4 * sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }
}