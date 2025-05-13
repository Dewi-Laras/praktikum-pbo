/*  Nama File    : Main.java
    Deskripsi    : Kelas utama untuk menguji penggunaan kelas Koleksi 
                   dengan tipe data Character. 
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : 14 Mei 2025
*/

public class Main {
    public static void main(String[] args) {
        Koleksi<Character> K = new Koleksi<>();

        K.add('L');
        K.add('A');
        K.add('R');
        K.add('A');
        K.add('S');
        K.add('A');
        K.add('T');
        K.add('I');
        K.add('M');
        K.add('M');

        System.out.println("Koleksi awal");
        K.showAll();

        System.out.println("\nMengubah elemen di indeks 7 menjadi U");
        K.setIsi(7, 'U');
        K.showAll();
        System.out.println(">> Ukuran koleksi: " + K.getSize());

        System.out.println("\nMengubah ukuran koleksi");
        System.out.println(">> Ukuran koleksi sebelum perubahan : " + K.getSize());
        K.setSize(5);
        System.out.println(">> Ukuran koleksi setelah perubahan : " + K.getSize());
        K.showAll();

        System.out.println("\nSemua elemen dalam koleksi akhir");
        System.out.println(">> Elemen di indeks 0  : " + K.getIsi(0));
        System.out.println(">> Elemen yang dihapus : " + K.delete());
        K.showAll();
    }
}