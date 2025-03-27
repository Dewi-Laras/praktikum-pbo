/*  Nama File    : RuangDosen.java
    Deskripsi    : berisi atribut dan method dalam class RuangDosen
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : Kamis, 27 Maret 2025
*/

public class RuangDosen extends Ruang {
    private String namaDosen;
    private int jumlahKursi;
    private int jumlahMeja;
    private double tarifKebersihan;
    
    public RuangDosen(String kode, double panjang, double lebar, double tinggi, int kapasitas,
                      String namaDosen, int jumlahKursi, int jumlahMeja, double tarifKebersihan) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaDosen = namaDosen;
        this.jumlahKursi = jumlahKursi;
        this.jumlahMeja = jumlahMeja;
        this.tarifKebersihan = tarifKebersihan;
    }
    
    public String getNamaDosen() {
        return namaDosen;
    }
    
    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }
    
    public int getJumlahKursi() {
        return jumlahKursi;
    }
    
    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }
    
    public int getJumlahMeja() {
        return jumlahMeja;
    }
    
    public void setJumlahMeja(int jumlahMeja) {
        this.jumlahMeja = jumlahMeja;
    }
    
    public double getTarifKebersihan() {
        return tarifKebersihan;
    }
    
    public void setTarifKebersihan(double tarifKebersihan) {
        this.tarifKebersihan = tarifKebersihan;
    }
    
    @Override
    public double hitungBiayaKebersihan(double tarif) {
        return super.hitungBiayaKebersihan(this.tarifKebersihan);
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("\n==== Informasi Ruang Dosen ====");
        System.out.println("> Nama Dosen       : " + namaDosen);
        System.out.println("> Kode Ruang       : " + kode);
        System.out.println("> Dimensi          : " + panjang + " x " + lebar + " x " + tinggi);
        System.out.println("> Kapasitas        : " + kapasitas);
        System.out.println("> Jumlah Kursi     : " + jumlahKursi);
        System.out.println("> Jumlah Meja      : " + jumlahMeja);
        System.out.println("> Biaya Kebersihan : Rp " + hitungBiayaKebersihan(tarifKebersihan));
    }
}