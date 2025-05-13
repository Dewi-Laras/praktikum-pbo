/*  Nama File    : Koleksi.java
    Deskripsi    : Kelas generik yang merepresentasikan struktur data array 
                   sederhana untuk menyimpan objek bertipe generic T. 
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : 14 Mei 2025
*/

public class Koleksi<T> {
    private T[] wadah;
    private int nbelm;

    public Koleksi() {
        wadah = (T[]) new Object[10]; // isinya 10 elemen acak
        nbelm = 0;
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int x) {
        nbelm = x;
    }

    public T getIsi(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            return wadah[indeks];
        }
        return null;
    }

    public void setIsi(int indeks, T e) {
        if (indeks >= 0 && indeks < nbelm) {
            wadah[indeks] = e;
        }
    }

    public void add(T e) {
        if (nbelm < wadah.length) {
            wadah[nbelm] = e;
            nbelm++;
        } else {
            System.out.println("Koleksi penuh.");
        }
    }

    public T delete() {
        if (nbelm > 0) {
            nbelm--;
            T e = wadah[nbelm];
            wadah[nbelm] = null;
            return e;
        } else {
            System.out.println("Koleksi kosong.");
            return null;
        }
    }

    public void showAll() {
        for (int i = 0; i < nbelm; i++) {
            T elemen = wadah[i];
            System.out.println(elemen);
            if (elemen instanceof Anabul) {
                Anabul a = (Anabul) elemen;
                System.out.println(">> Hewan : " + a.getNama());
                a.gerak();
                a.suara();
                System.out.println();
            }
        }
    }
}