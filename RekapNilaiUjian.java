
import java.util.Scanner;

public class RekapNilaiUjian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );

        System.out.println("Masukkan jumlah siswa: ");
        int JumlahSiswa = scanner.nextInt();

        double totalNilai =0;

        for (int i = 1; i<=JumlahSiswa; i++) {
            System.out.println("Masukkan nilai siswa ke-" + i + ":");
            double nilai = scanner.nextDouble();
            totalNilai+= nilai;

        }

        double rataRata = totalNilai / JumlahSiswa;

        System.out.println(" Rata-Rata nilai ujian: " + rataRata);

        scanner.close();
    }
}
