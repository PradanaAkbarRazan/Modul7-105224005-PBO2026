public class LampuPintar extends PerangkatPintar {
    
    // Soal 1: Method Overriding
    @Override
    public void aktifkan() {
        System.out.println("Lampu menyala dengan tingkat kecerahan standar.");
    }

    // Soal 2: Method Overloading (Metode Pertama)
    public void aturKecerahan(int level) {
        System.out.println("Kecerahan lampu diatur ke level " + level + "%.");
    }

    // Soal 2: Method Overloading (Metode Kedua)
    public void aturKecerahan(int level, String warna) {
        System.out.println("Kecerahan lampu diatur ke level " + level + "% dengan warna cahaya " + warna + ".");
    }
}