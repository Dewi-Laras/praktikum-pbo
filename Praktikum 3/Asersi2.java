 /*Nama File  : asersi2.java
 * Deskripsi  : berisi atribut dan method dalam class asersi2
 * Pembuat    : Dewi Larasati Mumpuni / 24060123140045
 * Tanggal    : Kamis,6 Maret 2025
 */

 //class lingkaran
 class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2 * Math.PI*jariJari;
        return keliling;
    }
 }
public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari > 0): "jari jari tidak boleh nol!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran =" + kelilingLingkaran);
    }
}

/* PERTANYAAN
 * Secara konsep, ada yang kurang tepat pada program Asersi 2 di atas. Jelaskan!
 * 
 * Jawaban :
 * Program Asersi2 memiliki kesalahan konsep karena menggunakan assertion untuk validasi 
 * input, padahal assert cocok untuk debugging. Dan juga variabel jariJari diinisialisasi dengan 0,
 * sehingga asersi selalu gagal. 
 * */