// Class untuk representasi Sayuran
class Sayuran {
    String jenis;
    String ukuran;

    public Sayuran(String jenis, String ukuran) {
        this.jenis = jenis;
        this.ukuran = ukuran;
    }

    void dipotong() {
        System.out.println("Memotong sayuran jenis " + jenis);
    }

    void ditumis() {
        System.out.println("Menumis sayuran jenis " + jenis);
    }
}
