// Class untuk representasi Nasi
public class Nasi {
    String jenis;
    String rasa;
    String tekstur;

    public Nasi(String jenis, String rasa, String tekstur) {
        this.jenis = jenis;
        this.rasa = rasa;
        this.tekstur = tekstur;
    }

    void dipanaskan() {
        System.out.println("Memanaskan nasi " + jenis);
    }
    void dicampur() {
        System.out.println("Mencampur nasi " + jenis);
    }
}
