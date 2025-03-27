/*  Nama File    : RuangDepartemen.java
    Deskripsi    : berisi atribut dan method dalam class RuangDepartemen
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : Kamis, 27 Maret 2025
*/

public class RuangDepartemen extends Ruang {
    private int jumlahMeja;
    private int jumlahKursi;
    private int jumlahLemari;
    private String namaDepartemen;
    private String ketuaDepartemen;
    private double tarifKebersihan;

    public RuangDepartemen(String kode, double panjang, double lebar, double tinggi, int kapasitas, 
                           int jumlahMeja, int jumlahKursi, int jumlahLemari, String namaDepartemen, 
                           String ketuaDepartemen, double tarifKebersihan) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
        this.jumlahLemari = jumlahLemari;
        this.namaDepartemen = namaDepartemen;
        this.ketuaDepartemen = ketuaDepartemen;
        this.tarifKebersihan = tarifKebersihan;
    }

    public int getJumlahMeja() {
        return jumlahMeja;
    }

    public void setJumlahMeja(int jumlahMeja) {
        this.jumlahMeja = jumlahMeja;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public int getJumlahLemari() {
        return jumlahLemari;
    }

    public void setJumlahLemari(int jumlahLemari) {
        this.jumlahLemari = jumlahLemari;
    }

    public String getNamaDepartemen() {
        return namaDepartemen;
    }

    public void setNamaDepartemen(String namaDepartemen) {
        this.namaDepartemen = namaDepartemen;
    }

    public String getKetuaDepartemen() {
        return ketuaDepartemen;
    }

    public void setKetuaDepartemen(String ketuaDepartemen) {
        this.ketuaDepartemen = ketuaDepartemen;
    }

    @Override
    public double hitungBiayaKebersihan(double tarif) {
        return super.hitungBiayaKebersihan(tarifKebersihan);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("\n==== Informasi Ruang Departmen ====");
        System.out.println("> Nama Departemen  : " + namaDepartemen);
        System.out.println("> Ketua Departemen : " + ketuaDepartemen);
        System.out.println("> Kode Ruang       : " + kode);
        System.out.println("> Dimensi          : " + panjang + " x " + lebar + " x " + tinggi);
        System.out.println("> Kapasitas        : " + kapasitas);
        System.out.println("> Jumlah Meja      : " + jumlahMeja);
        System.out.println("> Jumlah Kursi     : " + jumlahKursi);
        System.out.println("> Jumlah Lemari    : " + jumlahLemari);
        System.out.println("> Biaya Kebersihan : Rp " + hitungBiayaKebersihan(tarifKebersihan));
    }
}