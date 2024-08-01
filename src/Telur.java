// Class untuk representasi Telur
class Telur {
    String ukuran;
    String warnaKuningTelur;

    public Telur(String ukuran, String warnaKuningTelur) {
        this.ukuran = ukuran;
        this.warnaKuningTelur = warnaKuningTelur;
    }

    void digoreng() {
        System.out.println("Menggoreng telur ukuran " + ukuran);
    }

    void dikocok() {
        System.out.println("Mengocok telur ukuran " + ukuran);
    }
}