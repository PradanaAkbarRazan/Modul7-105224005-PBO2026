import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Soal 3: Deklarasi koleksi menggunakan konsep Upcasting
        ArrayList<PerangkatPintar> daftarPerangkat = new ArrayList<>();

        // Memasukkan objek menggunakan referensi superclass (Upcasting)
        daftarPerangkat.add(new LampuPintar());
        daftarPerangkat.add(new AcPintar());

        System.out.println("Menjalankan Loop Perangkat");
        
        // Soal 3 & 4: Perulangan dan penggunaan instanceof
        for (PerangkatPintar perangkat : daftarPerangkat) {
            perangkat.aktifkan(); // Memanggil metode overriding

            // Soal 4: Modifikasi menggunakan instanceof dan Downcasting
            if (perangkat instanceof AcPintar) {
                AcPintar ac = (AcPintar) perangkat; // Safe Downcasting
                ac.aturSuhu(20);
            }
        }
    }
}