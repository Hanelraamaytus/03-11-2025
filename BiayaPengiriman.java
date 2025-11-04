
import java.util.Scanner;

public class BiayaPengiriman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        // input berat paket (kg)
        System.out.println("Massukkan berat paket (kg)");
        double berat = scanner.nextDouble();

        // input jarak tempubh (km)
        System.out.println("Massukkan jarak tempuh (km)");
        double jarak = scanner.nextDouble();

        // input dimensi paket (cm)
        System.out.println("Masukkan panjang paket (cm)");
        double panjang = scanner.nextDouble();
        System.out.println("Masukkan lebar paket (cm)");
        double lebar = scanner.nextDouble();
        System.out.println("Masukkan tinggi paket (cm)");
        double tinggi =  scanner.nextDouble();

        // Hitung volume (cm³)
        double volume = panjang * lebar * tinggi;

        // Hitung biaya berdasarkan berat jarak 
        double biayaBerat;
        if (jarak <=10){
            biayaBerat = berat * 4250;
        }else {
            biayaBerat = berat * 6000;
        }

        // Hitung biaya volume
        double biayaVolume = 0;
        if ( volume > 100) {
            biayaVolume = 50000;
        }

        //Hitung total biaya
        double totalBiaya = biayaBerat + biayaVolume;

        //Output habis 
        System.out.println("Volume paket: " + volume + "cm³");
        System.out.println("Biaya pengiriman berdasarkan berat: Rp" + biayaBerat);
        System.out.println("Biaya tambahan volume:" + biayaVolume);
        System.out.println("Total biaya pengiriman: Rp " + totalBiaya);
         
        scanner.close();
        }
}
