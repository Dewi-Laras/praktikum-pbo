/*  Nama File    : BangunDatarGeneric.java
    Deskripsi    : Kelas generic yang membungkus objek turunan BangunDatar. 
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : 4 Mei 2025
*/

public class BangunDatarGeneric <T extends BangunDatar>{
    private T bangunDatar;
    
    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}
