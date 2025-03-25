/*  Nama File    : Pengusaha.java  
    Deskripsi    : Kelas yang merepresentasikan pengusaha sebagai turunan Manusia  
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045 
    Tanggal      : Selasa, 25 Maret 2025  
*/

    import java.util.Date;
    import java.util.concurrent.TimeUnit;
    
    public class Pengusaha extends Manusia implements Pajak {
        private String npwp;
        private static int counterPengusaha = 0;
        private static final int B = 3; 

        public Pengusaha() {
    
        }

        public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
            super(nama, tgl_mulai_kerja, alamat, pendapatan);
            this.npwp = npwp;
            counterPengusaha++;
        }

        public String getNpwp() {
            return npwp;
        }
    
        public void setNpwp(String npwp) {
            this.npwp = npwp;
        }
    
        public static int getCounterPengusaha() {
            return counterPengusaha;
        }
 
        @Override
        public int hitungMasaKerja() {
            Date sekarang = new Date();
            long selisihMiliDetik = sekarang.getTime() - super.gettgl_mulai_kerja().getTime();
            int tahun = (int) TimeUnit.DAYS.convert(selisihMiliDetik, TimeUnit.MILLISECONDS) / 365;
            return tahun + B;
        }
    
        @Override
        public double hitungPajak() {
            return 0.15 * getPendapatan();
        }
    
        @Override
        public void cetakInfo() {
            super.cetakInfo();
            System.out.println("\n==== Informasi Pengusaha ====");
            System.out.println("> NPWP       : " + npwp);
            System.out.println("> Masa Kerja : " + hitungMasaKerja() + " tahun");
            System.out.println("> Pajak      : " + hitungPajak());
        }
    }