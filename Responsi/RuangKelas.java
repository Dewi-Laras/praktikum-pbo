/*  Nama File    : RuangKelas.java
    Deskripsi    : berisi atribut dan method dalam class RuangKelas
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : Kamis, 27 Maret 2025
*/

class RuangKelas extends Ruang {
    private int jumlahKursi;
    private int jumlahKursiRusak;
    private static double tarifKebersihan = 5000;
    
    public RuangKelas(String kode, double panjang, double lebar, double tinggi, int kapasitas, int kursiTersedia, int kursiRusak) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.jumlahKursi = kursiTersedia;
        this.jumlahKursiRusak = kursiRusak;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public int getJumlahKursiRusak() {
        return jumlahKursiRusak;
    }

    public void setJumlahKursiRusak(int jumlahKursiRusak) {
        this.jumlahKursiRusak = jumlahKursiRusak;
    }

    @Override
    public double hitungBiayaKebersihan(double tarif) {
        return super.hitungBiayaKebersihan(tarifKebersihan);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("\n==== Informasi Ruang Kelas ====");
        System.out.println("> Dimensi            : " + panjang + " x " + lebar + " x " + tinggi);
        System.out.println("> Kapasitas          : " + kapasitas);
        System.out.println("> Jumlah Kursi       : " + jumlahKursi);
        System.out.println("> Jumlah Kursi Rusak : " + jumlahKursiRusak);
        System.out.println("> Biaya Kebersihan   : Rp " + hitungBiayaKebersihan(tarifKebersihan));
    }
}