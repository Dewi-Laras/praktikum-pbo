/*  Nama File    : BangunDatar.java
    Deskripsi    : Kelas abstrak untuk bangun datar dengan method perbandingan luas dan keliling 
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045 
    Tanggal      : Selasa, 25 Maret 2025  
*/
    public abstract class BangunDatar {
        private int jmlSisi;
        private String warna;
        private String border;
        private static int counterBangunDatar = 0;
    
        public BangunDatar() {
            counterBangunDatar++;
        }
    
        public BangunDatar(int jmlSisi, String warna, String border) {
            this.jmlSisi = jmlSisi;
            this.warna = warna;
            this.border = border;
            counterBangunDatar++;
        }

        public int getJmlSisi() {
            return jmlSisi;
        }
    
        public void setJmlSisi(int jmlSisi) {
            this.jmlSisi = jmlSisi;
        }
    
        public String getWarna() {
            return warna;
        }
    
        public void setWarna(String warna) {
            this.warna = warna;
        }
    
        public String getBorder() {
            return border;
        }
    
        public void setBorder(String border) {
            this.border = border;
        }
    
        public abstract double getLuas();
        public abstract double getKeliling();
    
        public boolean isEqualLuas(BangunDatar X) {
            return this.getLuas() == X.getLuas();
        }
    
        public boolean isEqualKeliling(BangunDatar X) {
            return this.getKeliling() == X.getKeliling();
        }
    
        public void printInfo() {
            System.out.println("\n> Jumlah sisi    : " + jmlSisi);
            System.out.println("> Warna    : " + warna);
            System.out.println("> Border    : " + border);
        }
    
        public static void printJumlahObjek() {
            System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
        }
    }