package pbo;

import java.util.Scanner;

public class MobilBeraksi {
    public static void main(String[] args) {
        // IO sederhana
        Scanner input = new Scanner(System.in);
        DataMobil data = new DataMobil(10); // Array

        boolean lanjut = true;
        
        // Perulangan
        while (lanjut) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Mobil Biasa");
            System.out.println("2. Tambah Mobil Sport");
            System.out.println("3. Lihat Semua Mobil");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = input.nextInt();
            input.nextLine();

            // Seleksi
            switch (pilih) {
                case 1:
                    // Error Handling
                    try {
                        System.out.print("Merk Mobil  : ");
                        String merk = input.nextLine();
                        System.out.print("Model Mobil : ");
                        String model = input.nextLine();
                        System.out.print("Tahun       : ");
                        int tahun = input.nextInt();
                        System.out.print("Harga       : ");
                        int harga = input.nextInt();

                        // Objek
                        Mobil m = new Mobil(merk, model, tahun, harga);
                        data.tambahMobil(m);
                    } catch (Exception e) {
                        System.out.println("Input tidak valid: " + e.getMessage());
                        input.nextLine();
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Merk Mobil    : ");
                        String merk = input.nextLine();
                        System.out.print("Model Mobil   : ");
                        String model = input.nextLine();
                        System.out.print("Tahun         : ");
                        int tahun = input.nextInt();
                        System.out.print("Harga         : ");
                        int harga = input.nextInt();
                        System.out.print("Top Speed     : ");
                        int topSpeed = input.nextInt();

                        MobilSport ms = new MobilSport(merk, model, tahun, harga, topSpeed);
                        data.tambahMobil(ms);
                    } catch (Exception e) {
                        System.out.println("Input salah: " + e.getMessage());
                        input.nextLine();
                    }
                    break;

                case 3:
                    data.tampilkanSemua();
                    break;

                case 4:
                    lanjut = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        input.close();
    }
}