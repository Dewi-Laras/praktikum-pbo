/*  Nama File    : MManusia.java  
    Deskripsi    : Program utama untuk menjalankan kelas abstrak Manusia, dan turunannya(PNS, Pengusaha, Petani), serta interface Pajak
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045 
    Tanggal      : Selasa, 25 Maret 2025  
*/
    
    public class MManusia {
        public static void main(String[] args) {
            PNS p1 = new PNS("Satriyo", "01-04-2006", "Jl. Seroja", 15000000, "198302032006041002");
            Pengusaha pe1 = new Pengusaha("Adhy", "01-01-2000", "Jl.Air", 55000000, "000-556-773-212-000-5");
            Petani pt1 = new Petani("Nugraha", "09-01-1977", "Jl. Bunga 9 Tembalang", 5000000, "wonogiri");
            PNS p2 = new PNS("Panji", "01-04-2010", "Jl. Panorama 111 Tembalang", 10000000.0, "198004212010041002");
    
            p2.setAlamat("Jl. Panorama 111 Tembalang");
    
            System.out.println("\n> Jumlah Manusia      = " + Manusia.getCounterMns());
            System.out.println("> Jumlah PNS          = " + PNS.getCounterPNS());
            System.out.println("> Jumlah Pengusaha    = " + Pengusaha.getCounterPengusaha());
            System.out.println("> Jumlah Petani       = " + Petani.getCounterPetani());
    
            System.out.println("> Pajak PNS p1        = " + p1.hitungPajak());
            System.out.println("> Pajak Pengusaha pe1 = " + pe1.hitungPajak());
            System.out.println("> Pajak Petani pt1    = " + pt1.hitungPajak());
    
            System.out.println("> Masa Kerja p1       = " + p1.hitungMasaKerja());
            System.out.println("> Masa Kerja pe1      = " + pe1.hitungMasaKerja());
            System.out.println("> Masa Kerja pt1      = " + pt1.hitungMasaKerja());
    
            p1.cetakInfo();
            pe1.cetakInfo();
            pt1.cetakInfo();
            System.out.println("\n");
        }
    }