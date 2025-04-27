/*  Nama File    : Programmer.java
    Deskripsi    : Kelas untuk menentukan informasi programmer turunan pegawai
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : 27 April 2025 
*/

class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer() {
        super();
        this.bonus = 0;
    }

    public Programmer(String nama) {
        super(nama, 5000000);
        this.bonus = 450000;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    } 

    public int getBonus() {
        return bonus;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}