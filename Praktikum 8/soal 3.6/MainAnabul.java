/*  
    Nama File    : MainAnabul.java
    Deskripsi    : Kelas untuk menguji penerapan koleksi pada objek-objek
                   turunan dari kelas Anabul, yaitu Kucing, Anjing, dan Burung.  
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : 14 Mei 2025 
*/

public class MainAnabul {
    public static void main(String[] args) {
        Koleksi<Anabul> A = new Koleksi<>();

        System.out.println("Mengisi 10 koleksi anabul acak");
        A.add(new Kucing("Mumu"));
        A.add(new Anjing("Mochi"));
        A.add(new Burung("Robin"));
        A.add(new Kucing("Toto"));
        A.add(new Anjing("Max"));
        A.add(new Burung("Tutu"));
        A.add(new Kucing("Ciro"));
        A.add(new Anjing("Tamtam"));
        A.add(new Burung("Tweety"));
        A.add(new Kucing("Tupid"));
        A.showAll();
        System.out.println(">> Ukuran koleksi : " + A.getSize());

        System.out.println("\nMengakses anabul pada indeks ke-2");
        Anabul anabulKetiga = A.getIsi(2);
        System.out.println(">> Anabul di indeks ke-2: " + anabulKetiga.getNama());
        anabulKetiga.suara();

        System.out.println("\nMengubah anabul pada indeks ke-1");
        A.setIsi(1, new Anjing("Optimus"));
        System.out.println(">> Anabul di indeks ke-1 setelah diubah: " + A.getIsi(1).getNama());

        System.out.println("\nMengubah ukuran koleksi");
        System.out.println(">> Ukuran sebelum perubahan : " + A.getSize());
        A.setSize(5);
        System.out.println(">> Ukuran setelah perubahan : " + A.getSize());
        System.out.println("\n");
        A.showAll();

        System.out.println("\nMenghapus elemen terakhir");
        Anabul hapus = A.delete();
        System.out.println(">> Anabul yang dihapus     : " + hapus.getNama());
        System.out.println(">> Ukuran koleksi sekarang : " + A.getSize());
        System.out.println("\n");
    }
}
