// Class utama untuk mengkoordinasikan proses memasak nasi goreng
class NasiGoreng {
    Nasi nasi;
    Telur telur;
    Sayuran sayuran;
    Bumbu bumbu;
    Wajan wajan;

    public NasiGoreng(Nasi nasi, Telur telur, Sayuran sayuran, Bumbu bumbu, Wajan wajan) {
        this.nasi = nasi;
        this.telur = telur;
        this.sayuran = sayuran;
        this.bumbu = bumbu;
        this.wajan = wajan;
    }
    void masak() {
        wajan.dipanaskan();
        telur.digoreng();
        bumbu.ditumis();
        sayuran.ditumis();
        nasi.dipanaskan();
        nasi.dicampur();

//      Mengecek apakah nasi adalah instance object dari class NasiGorengSeafood
        if (nasi instanceof NasiGorengSeafood) {
//      Melakukan downcasting ke class Nai GorengSeafood
            NasiGorengSeafood nasiGorengSeafood = (NasiGorengSeafood) this.nasi;
//      Jika benar maka akan memanggil method tambahkanSeafood dari class NasiGorengSeafood
            nasiGorengSeafood.tambahkanSeafood();
        }
        System.out.println("Nasi goreng siap disajikan!");
    }
}