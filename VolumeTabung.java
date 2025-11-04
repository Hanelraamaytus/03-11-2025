
import java.util.Scanner;


public class VolumeTabung {
    //Fungsi untuk menghitung volume tabung
    public static double hitungVolume(double jariJari, double tinggi) {
        return Math.PI * jariJari * jariJari * tinggi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input jari-jari dan tinggi
        System.out.println("Masukkan jari-jari tabung (cm):");
        double jariJari = scanner.nextDouble();
        System.out.println("Masukkan tinggi tabung (cm):");
        double tinggi = scanner.nextDouble();

        //panggil fungsi untuk menghitung volume 
        double volume = hitungVolume(jariJari, tinggi);

        //Output hasil 
        System.out.println("Volume tabung adalah : "+ volume + " cm³");

        scanner.close();
    }
}