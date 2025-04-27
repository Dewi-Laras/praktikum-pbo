/*  Nama File    : Soal.java
    Deskripsi    :  Kelas untuk mengetes polimorfisme dari pegawai, programmer, dan manajer
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : 27 April 2025 
*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nama : Dewi Larasati Mumpuni");
        System.out.println("NIM  : 24060123140045 \n");

        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}

/* PERTANYAAN:
    2. Polimorfisme pada kasus ini memberikan kemudahan dalam mengelola objek yang berasal 
    dari berbagai jenis pegawai, seperti Programmer dan Manajer, dengan cukup menggunakan 
    referensi dari kelas induk, yaitu Pegawai. Dengan cara ini, program tetap bisa menjalankan 
    fungsi tampilData() sesuai dengan jenis objek yang sebenarnya, tanpa perlu mengetahui atau 
    membedakan tipe objek secara eksplisit. Hal ini membuat kode menjadi lebih ringkas, mudah 
    dibaca, dan lebih fleksibel. Misalnya saat ingin menambahkan tipe pegawai baru tanpa perlu 
    mengubah struktur program yang sudah ada.

    3. Ketika program menambahkan pegawai4 dan pegawai5 tanpa menggunakan konsep polimorfisme 
    inclusion, maka akan muncul beberapa kendala, yaitu tidak bisa mengelompokkan berbagai jenis 
    pegawai seperti Programmer dan Manajer dalam satu daftar yang seragam. Akibatnya, programmer 
    harus membuat daftar atau variabel terpisah untuk setiap jenis objek, bahkan terkadang perlu 
    menggunakan pengecekan tipe secara manual, yang membuat kode menjadi lebih panjang dan rumit. 
    Selain itu, pemanggilan method seperti tampilData() juga harus dilakukan satu per satu sesuai 
    jenis objeknya. Hal ini cukup menyulitkan saat ingin menambahkan jenis pegawai baru karena 
    struktur program harus diubah lagi, berbeda dengan polimorfisme yang cukup menambahkan subclass 
    dan mengoverride method yang dibutuhkan tanpa mengubah logika utama.
 */