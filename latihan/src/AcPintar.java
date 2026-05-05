public class AcPintar extends PerangkatPintar {
    
    // Soal 1: Method Overriding
    @Override
    public void aktifkan() {
        System.out.println("AC menyala dan mulai mendinginkan ruangan.");
    }

    // Soal 4: Metode unik
    public void aturSuhu(int suhu) {
        System.out.println("Suhu ruangan diatur menjadi " + suhu + " derajat.");
    }
}