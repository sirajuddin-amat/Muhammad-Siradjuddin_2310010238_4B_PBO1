package pbo;

// Class induk
public class Mobil {
    // Atribut(dengan enkapsulasi)
    private String merk;
    private String model;
    private int tahun;
    private int harga;

    // Constructor
    public Mobil(String merk, String model, int tahun, int harga) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.harga = harga;
    }

    // Accessor
    public String getMerk() { return merk; }
    public String getModel() { return model; }
    public int getTahun() { return tahun; }
    public int getHarga() { return harga; }

    // Mutator
    public void setMerk(String merk) { this.merk = merk; }
    public void setModel(String model) { this.model = model; }
    public void setTahun(int tahun) { this.tahun = tahun; }
    public void setHarga(int harga) { this.harga = harga; }

    // Polymorphism (method bisa dioverride)
    public void tampilInfo() {
        System.out.println("Merk  : " + merk);
        System.out.println("Model : " + model);
        System.out.println("Tahun : " + tahun);
        System.out.println("Harga : Rp" + harga);
    }
}