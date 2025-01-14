public class Private {
    private String nama = "John";

    public static void main(String[] args) {
        Contoh obj = new Contoh();
        // System.out.println(obj.nama); // Error, tidak dapat diakses
    }

    public void cetakNama() {
        System.out.println(nama); // Output: John
    }
}
// Pada contoh di atas, variabel nama dideklarasikan sebagai private, 
// sehingga hanya dapat diakses dari dalam kelas itu sendiri melalui 
// metode cetakNama().