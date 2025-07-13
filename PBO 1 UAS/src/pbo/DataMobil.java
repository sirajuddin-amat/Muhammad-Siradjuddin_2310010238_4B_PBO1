package pbo;

public class DataMobil {
    private Mobil[] daftarMobil; // Array
    private int jumlah;

    public DataMobil(int kapasitas) {
        daftarMobil = new Mobil[kapasitas];
        jumlah = 0;
    }

    // Untuk menambahkan data mobil
    public void tambahMobil(Mobil mobil) {
        try {
            if (jumlah < daftarMobil.length) {
                daftarMobil[jumlah] = mobil;
                jumlah++;
            } else {
                throw new Exception("Kapasitas penuh!");
            }
        } catch (Exception e) {
            System.out.println("Gagal menambahkan: " + e.getMessage());
        }
    }

    // Untuk menampilkan semua data mobil
    public void tampilkanSemua() {
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMobil ke-" + (i + 1));
            daftarMobil[i].tampilInfo();
        }
    }
}