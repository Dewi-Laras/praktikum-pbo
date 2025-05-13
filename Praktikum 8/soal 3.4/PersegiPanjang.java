/*  Nama File    : PersegiPanjang.java
    Deskripsi    : Kelas turunan dari BangunDatar yang merepresentasikan bangun datar persegi panjang.
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : 4 Mei 2025
*/

public class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public double hitungLuas() {
        return panjang * lebar;
    }
}