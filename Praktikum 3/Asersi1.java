 /*Nama File  : asersi1.java
 * Deskripsi  : berisi atribut dan method dalam class asersi1
 * Pembuat    : Dewi Larasati Mumpuni / 24060123140045
 * Tanggal    : Kamis,6 Maret 2025
 */

 public class Asersi1{
    public static void main(String[] args){
        int x = 0;
        if (x > 0){
            System.out.println("x bilangan positif");
        }
        else {
            assert (x < 0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
 }