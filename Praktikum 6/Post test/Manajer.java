/*  Nama File    : Manajer.java
    Deskripsi    : Kelas untuk menentukan informasi manajer turunan pegawai
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : 27 April 2025 
*/

class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer () {
        super();
        this.tunjangan = 0;
    }
 
    public Manajer(String nama) {
        super(nama, 5000000);
        this.tunjangan = 700000;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public int getTunjangan() {
        return tunjangan;
    }
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
