// Class untuk Nasi Goreng Seafood sebagai turunan dari Nasi
public class NasiGorengSeafood extends Nasi {
    String jenisSeafood;

    public NasiGorengSeafood(String jenis, String rasa, String tekstur, String jenisSeafood) {
        super(jenis, rasa, tekstur);
        this.jenisSeafood = jenisSeafood;
    }

    void tambahkanSeafood() {
        System.out.println("Menambahkan seafood: " + jenisSeafood);
    }
}