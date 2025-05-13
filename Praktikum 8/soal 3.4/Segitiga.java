/*  Nama File    : Segitiga.java
    Deskripsi    : Kelas turunan dari BangunDatar yang merepresentasikan bangun datar segitiga. 
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : 4 Mei 2025
*/

public class Segitiga extends BangunDatar {
    private double sisi1, sisi2, sisi3;
    private double alas, tinggi;

    public Segitiga(double sisi1, double sisi2, double sisi3, double alas, double tinggi) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}