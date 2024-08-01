// Class untuk representasi Wajan
class Wajan {
    String ukuran;
    String bahan;

    public Wajan(String ukuran, String bahan) {
        this.ukuran = ukuran;
        this.bahan = bahan;
    }

    void dipanaskan() {
        System.out.println("Memanaskan wajan ukuran " + ukuran);
    }
}