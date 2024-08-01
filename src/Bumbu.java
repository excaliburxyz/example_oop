// Class untuk representasi Bumbu
class Bumbu {
    String jenis;
    String rasa;

    public Bumbu(String jenis, String rasa) {
        this.jenis = jenis;
        this.rasa = rasa;
    }

    void ditumis() {
        System.out.println("Menumis bumbu jenis " + jenis);
    }
}