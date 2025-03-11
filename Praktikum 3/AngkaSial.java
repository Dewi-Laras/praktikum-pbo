 /*Nama File  : AngkaSial.java
 * Deskripsi  : berisi atribut dan method dalam class AngkaSial
 * Pembuat    : Dewi Larasati Mumpuni / 24060123140045
 * Tanggal    : Kamis,6 Maret 2025
 */

public class AngkaSial{
    public void cobaAngka (int angka) throws AngkaSialException{
        if (angka==13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka (13);
            as.cobaAngka (12);
            as.cobaAngka (12);
    } catch (AngkaSialException ase) {
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/* PERTANYAAN
 * 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
 * 
 * Jawab :
 * Tidak dapat dieksekusi, baris 12 (System.out.println(angka+" bukan angka sial");) tidak dieksekusi jika angka == 13. Saat as.cobaAngka(13); dipanggil,
 * program masuk ke metode cobaAngka() dan karena angka == 13, exception dilempar (throw new AngkaSialException();) sehingga eksekusi langsung 
 * berpindah ke blok catch dan baris 12 tidak sempat dijalankan.
 * 
 * 2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi? Jelaskan!
 * 
 * Jawab:
 * Iya dapat dieksekusi, baris 21 (System.out.println("hati-hati memasukkan angka!!!");) dieksekusi karena exception tertangkap di blok catch.
 * Setelah as.cobaAngka(13); melempar exception, eksekusi langsung berpindah ke blok catch, di mana ase.getMessage(); dan System.out.println("hati-hati memasukkan angka!!!"); 
 * dieksekusi sehungga baris ini selalu dijalankan setiap kali eksepsi AngkaSialException tertangkap.*/