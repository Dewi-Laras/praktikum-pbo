/*  Nama File    : Persegi.java
    Deskripsi    : Kelas untuk menghitung luas dan keliling persegi
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : Kamis, 13 Maret 2025
*/

public class Persegi extends BangunDatar {
    private double sisi;


    public Persegi() {
        super();
        this.sisi = 0.0;
      }
  
    // public Persegi(double sisi, String warna, String border) {
    //     super(4, warna, border);
    //     this.sisi = sisi;
    //     this.setWarna(warna);
    //     this.setBorder(border);
    //   }

    //super membuat menjadi lebih ringkas
    public Persegi (double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi (double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        double luas = sisi * sisi;
        return luas;
    }

    public double getKeliling(){
        double keliling = 4 * sisi;
        return keliling;
    }

    public double getDiagonal(){
        double diagonal = Math.sqrt(2);
        return diagonal;
    }

    @Override
    public void printInfo() {
      System.out.println("\n===== Informasi Persegi ====");
      System.out.println("> Sisi    : " + getSisi());
      System.out.println("> Warna   : " + getWarna());
      System.out.println("> Border  : " + getBorder());
      System.out.println("> Luas    : " + getLuas());
      System.out.println("> Keliling: " + getKeliling());
      System.out.println("> Diagonal: " + getDiagonal());
    }
}

/*PERTANYAAN
 *1. Apakah konstruktor berikut dapat direalisasikan? Mengapa?
 *public Persegi(double sisi, String warna, String border) {
 *  this.jmlSisi = 4;
 *  this.warna = warna;
 *  this.border = border;
 *  this.sisi = sisi;
 *}
 * 
 *Jawab :
 *Bisa karena konstruktor bersifat public dan dalam superclass BangunDatar bersifat
 *public juga maka dapat digunakan dalam konstruktur Persegi maupun konstruktur Lingkaran
 *
 *2. Setelah atribut BangunDatar dimodifikasi menjadi protected, apakah konstruktor ini dapat direalisasikan?
 * public Persegi(double sisi, String warna, String border) {
 *  this.jmlSisi = 4;
 *  this.warna = warna;
 *  this.border = border;
 *  this.sisi = sisi;
 *}
 * 
 *Jawab :
 *Bisa karena konstruktor tersebut bisa direalisasikan jika atribut di BangunDatar sudah protected, dan memungkinkan 
 *subclass untuk mengakses atribut superclass langsung.
 */
