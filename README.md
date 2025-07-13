# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa merek, model, tahun, harga, topspeed, dan jumlah. Aplikasi ini memberikan output berupa informasi detail dari mobil tersebut seperti yang sudah diinputkan tadi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Mobil`, `MobilSport`, `Datamobil` dan `MobilBeraksi` adalah contoh dari class.

```bash
public class Mobil {
    ...
}

public class MobilSport extends Mobil {
    ...
}

public class Datamobil {
    ...
}

public class MobilBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Mobil m = new Mobil(merk, model, tahun, harga);` adalah contoh pembuatan object.

```bash
Mobil m = new Mobil(merk, model, tahun, harga);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `merk`, `model`, `tahun`, `harga`, `topSpeed` dan `jumlah` adalah contoh atribut.

```bash
String merk;
String model;
int tahun;
int harga;

int topSpeed;

int jumlah;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Mobil` dan `MobilSport`.

```bash
public Mobil(String merk, String model, int tahun, int harga) {
    this.merk = merk;
    this.model = model;
    this.tahun = tahun;
    this.harga = harga;
}

public MobilSport(String merk, String model, int tahun, int harga, int topSpeed) {
    super(merk, model, tahun, harga);
    this.topSpeed = topSpeed;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setMerk`, `setModel`, `setTahun`, `setHarga` dan `setTopSpeed` adalah contoh method mutator.

```bash
public void setMerk(String merk) { this.merk = merk; }
public void setModel(String model) { this.model = model; }
public void setTahun(int tahun) { this.tahun = tahun; }
public void setHarga(int harga) { this.harga = harga; }

public void setTopSpeed(int topSpeed) {
    this.topSpeed = topSpeed;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getMerk`, `getModel`, `getTahun`, `getHarga`, dan `getTopSpeed` adalah contoh method accessor.

```bash
public String getMerk() { return merk; }
public String getModel() { return model; }
public int getTahun() { return tahun; }
public int getHarga() { return harga; }

public int getTopSpeed() {
    return topSpeed;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut  `merk`, `model`, `tahun`, `harga`, `topSpeed` dan `jumlah` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String merk;
private String model;
private int tahun;
private int harga;

private int topSpeed;

private int jumlah;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MobilSport` mewarisi `Mobil` dengan sintaks `extends`.

```bash
public class MobilSport extends Mobil {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilkanInfo` di `MobilSport` merupakan override dari method `tampilkanInfo` di `Mobil`.

```bash
public void tampilInfo() {
    System.out.println("Merk  : " + merk);
    System.out.println("Model : " + model);
    System.out.println("Tahun : " + tahun);
    System.out.println("Harga : Rp" + harga);
}

public MobilSport(String merk, String model, int tahun, int harga, int topSpeed) {
    super(merk, model, tahun, harga);
    this.topSpeed = topSpeed;
}

@Override
public void tampilInfo() {
    super.tampilInfo();
    System.out.println("Top Speed: " + topSpeed + " km/h");
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam method `pilih`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `while` untuk meminta input dan menampilkan data.

```bash
while (lanjut) {
    System.out.println("\n=== MENU ===");
    System.out.println("1. Tambah Mobil Biasa");
    System.out.println("2. Tambah Mobil Sport");
    System.out.println("3. Lihat Semua Mobil");
    System.out.println("4. Keluar");
    System.out.print("Pilih menu: ");
    int pilih = input.nextInt();
    input.nextLine();

    ....
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner input = new Scanner(System.in);

System.out.println("\n=== MENU ===");
System.out.println("1. Tambah Mobil Biasa");
System.out.println("2. Tambah Mobil Sport");
System.out.println("3. Lihat Semua Mobil");
System.out.println("4. Keluar");
System.out.print("Pilih menu: ");
int pilih = input.nextInt();
input.nextLine();

System.out.print("Merk Mobil  : ");
String merk = input.nextLine();
System.out.print("Model Mobil : ");
String model = input.nextLine();
System.out.print("Tahun       : ");
int tahun = input.nextInt();
System.out.print("Harga       : ");
int harga = input.nextInt();

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
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `DataMobil data = new DataMobil(10);` adalah contoh penggunaan array.

```bash
DataMobil data = new DataMobil(10);
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    
} catch (Exception e) {
    System.out.println("Input tidak valid: " + e.getMessage());
    input.nextLine();
}

} catch (Exception e) {
    System.out.println("Input salah: " + e.getMessage());
    input.nextLine();
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Siradjuddin
NPM: 2310010238
