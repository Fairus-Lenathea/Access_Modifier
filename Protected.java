public class Orang {
    protected String nama = "John";

    public void cetakNama() {
        System.out.println(nama); // Output: John
    }
}

public class Anak extends Orang {
    public void cetakNamaAnak() {
        System.out.println(nama); // Output: John
    }
}

// Pada contoh di atas, variabel nama dideklarasikan sebagai protected di 
// kelas Orang, sehingga dapat diakses dari kelas turunan Anak.