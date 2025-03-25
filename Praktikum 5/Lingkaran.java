/*  Nama File    : Lingkaran.java
    Deskripsi    : Kelas untuk menghitung luas dan keliling lingkaran
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045 
    Tanggal      : Selasa, 25 Maret 2025  
*/
    public class Lingkaran extends BangunDatar {
        private double jariJari;
    
        public Lingkaran() {
            super();
            this.jariJari = 0.0;
        }

        public Lingkaran(double jariJari) {
            super(0, "Biru", "Merah"); // Default warna & border
            this.jariJari = jariJari;
        }

        public Lingkaran(double diameter, String warna, String border) {
            super(0, warna, border); 
            this.jariJari = diameter / 2;
        }
    
       public double getJariJari() {
            return this.jariJari;
        }
    
        public void setJariJari(double jariJari) {
            this.jariJari = jariJari;
        }
    
       @Override
        public double getLuas() {
            return Math.PI * jariJari * jariJari;
        }
    
        @Override
        public double getKeliling() {
            return 2 * Math.PI * jariJari;
        }
    
       @Override
        public void printInfo() {
            System.out.println("\n==== Informasi Lingkaran ====");
            System.out.println("> Jari-jari: " + jariJari);
            System.out.println("> Warna    : " + getWarna());
            System.out.println("> Border   : " + getBorder());
            System.out.println("> Luas     : " + String.format("%.2f", getLuas()));
            System.out.println("> Keliling : " + String.format("%.2f", getKeliling()));
        }
    }