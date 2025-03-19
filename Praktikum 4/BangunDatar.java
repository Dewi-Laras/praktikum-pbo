/*  Nama File    : BangunDatar.java
    Deskripsi    : Kelas abstrak untuk bangun datar dengan counter jumlah objek
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : Kamis, 13 Maret 2025
*/

public class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;
    private static int CounterBangunDatar = 0;

    public BangunDatar(){
        CounterBangunDatar++;
    }

    public BangunDatar (int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        CounterBangunDatar++;
    }

    public int getJmlSisi(){
        return jmlSisi;
    }

    public String getWarna(){
        return warna;
    } 

    public String getBorder(){
        return border;
    }

    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public void setBorder(String border){
        this.border = border;
    }

    public void printInfo(){
        System.out.println("> Jumlah sisi : " + jmlSisi);
        System.out.println("> Warna       : " + warna);
        System.out.println("> Border      : " + border);
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar : " + CounterBangunDatar);
    }
}

/*PERTANYAAN
 *Coba lakukan overriding pada method printCounterBangunDatar(). Bagaimana hasilnya?
 *
 *Jawab :
 *Jika printCounterBangunDatar() dideklarasikan sebagai static, maka tidak bisa di-override di subclass karena method static bersifat 
 *class-level, bukan instance-level. Overriding hanya berlaku untuk method instance.
 */