import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Soal 4: Koleksi ArrayList dengan Upcasting
        ArrayList<MetodePembayaran> listBayar = new ArrayList<>();
        listBayar.add(new EWallet());
        listBayar.add(new KartuKredit());

        System.out.println("PROSES PEMBAYARAN GATEWAY");
        
        for (MetodePembayaran p : listBayar) {
            // Memanggil metode bayar standar (Polimorfisme)
            p.bayar(100000);

            // Instruksi Gambar: Downcasting untuk EWallet (memanggil versi overloading)
            if (p instanceof EWallet) {
                EWallet ew = (EWallet) p; 
                ew.bayar(100000, "0812-3456-7890"); 
            } 
            // Instruksi Gambar: Downcasting untuk KartuKredit (memanggil verifikasiPIN)
            else if (p instanceof KartuKredit) {
                KartuKredit kk = (KartuKredit) p;
                kk.verifikasiPIN();
            }
            System.out.println("----------------------------------");
        }

        // NOMOR 5 ANALISIS PERBAIKAN EROR
        /*
           ANALISIS: Jika mencoba memanggil 'p.verifikasiPIN()' tanpa Downcasting, akan 
           muncul error 'cannot find symbol' karena Compiler hanya melihat metode di class 
           MetodePembayaran.
           PERBAIKAN: Gunakan 'instanceof' untuk memastikan objeknya benar, lalu lakukan 
           'Downcasting' ke KartuKredit agar fitur PIN bisa diakses.
        */
        MetodePembayaran m5 = new KartuKredit();
        if (m5 instanceof KartuKredit) {
            ((KartuKredit) m5).verifikasiPIN();
        }
    }
}