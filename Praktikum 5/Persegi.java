/*  Nama File    : Persegi.java
    Deskripsi    : Kelas untuk menghitung luas dan keliling persegi
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045 
    Tanggal      : Selasa, 25 Maret 2025  
*/
    public class Persegi extends BangunDatar implements IResize {
        private double sisi;
     
        public Persegi() {
          super();
          this.sisi = 0.0;
        }
    
        public Persegi(double sisi) {
          super(4, "Putih", "Hitam"); // Default warna & border
          this.sisi = sisi;
        }
    
        public Persegi(double sisi, String warna, String border) {
          super(4, warna, border);
          this.sisi = sisi;
        }
     
        public double getSisi() {
          return this.sisi;
        }
     
        public void setSisi(double sisi) {
          this.sisi = sisi;
        }
     
        @Override
        public double getLuas() {
          return this.sisi * this.sisi;
        }
     
        @Override
        public double getKeliling() {
          return this.sisi * 4.0;
        }
     
        public double getDiagonal() {
          return this.sisi * Math.sqrt(2.0);
        }
    
        @Override
        public void zoomIn() {
          sisi = sisi * 1.1;
        }
    
        @Override
        public void zoomOut() {
          sisi = sisi * 0.9;
        }
    
        @Override
        public void zoom(int percent) {
          sisi = sisi * percent/100;
        }

        @Override
        public void printInfo() {
          System.out.println("\n===== Informasi Persegi ====");
          System.out.println("> Sisi     : " + getSisi());
          System.out.println("> Warna    : " + getWarna());
          System.out.println("> Border   : " + getBorder());
          System.out.println("> Luas     : " + getLuas());
          System.out.println("> Keliling : " + getKeliling());
          System.out.println("> Diagonal : " + getDiagonal());
        }
      }