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



    // --- NOMOR 5: ANALISIS DAN PERBAIKAN ERROR ---
/*
   PENJELASAN: Baris 'alat1.aturKecerahan(75, "Putih")' error (cannot find symbol) karena 
   variabel 'alat1' menggunakan referensi PerangkatPintar yang tidak memiliki metode tersebut.
   PERBAIKAN: Menggunakan 'instanceof' untuk mengecek tipe dan 'Downcasting' ke LampuPintar 
   agar metode aturKecerahan dapat diakses oleh Compiler.
*/
//if (alat1 instanceof LampuPintar) {
   // ((LampuPintar) alat1).aturKecerahan(75, "Putih");
// }
}