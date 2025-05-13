/*  Nama File    : Lingkaran.java
    Deskripsi    : Kelas turunan dari BangunDatar yang merepresentasikan bangun datar lingkaran. 
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : 4 Mei 2025
*/

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        return 2 * jejari * 3.14;
    }

    public double hitungLuas() {
        return 3.14 * jejari * jejari;
    }
}