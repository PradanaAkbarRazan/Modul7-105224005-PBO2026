import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<LayananEkspedisi> daftarPengiriman = new ArrayList<>();

        daftarPengiriman.add(new LayananReguler("REG-11", 2, 50, 50, 50));
        daftarPengiriman.add(new LayananExpress("EXP-22", 5, 10, 10, 10));
        daftarPengiriman.add(new LayananInternasional("INT-33", 3, 20, 20, 20, "Korea", 100));

        double totalPendapatanPerusahaan = 0.0;

        for (LayananEkspedisi layanan : daftarPengiriman) {
            layanan.cetakResi();
            totalPendapatanPerusahaan += layanan.hitungOngkir();

            if (layanan instanceof LayananReguler) {
                LayananReguler reg = (LayananReguler) layanan;
                System.out.println("Harga Layanan Reguler (Member + Jarak): Rp" + reg.hitungOngkir(true, 25));
            } 
            else if (layanan instanceof LayananExpress) {
                ((LayananExpress) layanan).klaimAsuransi(1500000);
            } 
            else if (layanan instanceof LayananInternasional) {
                ((LayananInternasional) layanan).cetakManifest();
            }
            System.out.println("                               ");
        }

        System.out.println("Total Pendapatan Perusahaan (Ongkir Dasar): Rp" + totalPendapatanPerusahaan);
    }
}