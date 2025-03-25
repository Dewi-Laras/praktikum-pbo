public interface IResize {
    // Menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    // Mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    // Menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
}