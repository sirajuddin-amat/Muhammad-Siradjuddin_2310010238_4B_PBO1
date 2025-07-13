package pbo;

// Inheritance dari Mobil
public class MobilSport extends Mobil {
    // Atribut(dengan enkapsulasi
    private int topSpeed;

    // Overriding
    public MobilSport(String merk, String model, int tahun, int harga, int topSpeed) {
        super(merk, model, tahun, harga);
        this.topSpeed = topSpeed;
    }

    // Accessor
    public int getTopSpeed() {
        return topSpeed;
    }

    // Mutator
    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    // Polymorphism overriding
    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Top Speed: " + topSpeed + " km/h");
    }
}