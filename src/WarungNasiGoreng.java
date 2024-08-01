public class WarungNasiGoreng {
    public static void main(String[] args) {
        /*
        Alur program
                1. Membuat semua object dari class Nasi, Sayuran, Bumbu dan Wajan
                2. Khusus untuk class Nasi memiliki 1 jenis tambahan yaitu nasi goreng seafood
                3. Lalu semua hasil instance object akan dijadikan sebagai atribut class NasiGoreng yang dimana pada class ini akan memulai proses memasaknya
        */

//        Instansiasi objek
//        Membuat Nasi Goreng Seafood
        NasiGorengSeafood nasi = new NasiGorengSeafood("Putih", "Gurih", "Pulen", "Udang");

//        Membuat Nasi Goreng Biasa
//        Nasi nasi = new Nasi("Putih", "Gurih", "Pulen");

        Telur telur = new Telur("Besar", "Kuning Cerah");
        Sayuran sayuran = new Sayuran("Wortel", "Sedang");
        Bumbu bumbu = new Bumbu("Bawang Merah", "Manis");
        Wajan wajan = new Wajan("Besar", "Besi");

//        Membuat nasi goreng menggunakan objek-objek yang telah diinstansiasi
        NasiGoreng nasiGoreng = new NasiGoreng(nasi, telur, sayuran, bumbu, wajan);
        nasiGoreng.masak();
    }
}