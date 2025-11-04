
import java.util.Scanner;

public class Soal2Sulit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         System.out.println("masukkan jumlah baris matriks: ");
        int baris = input.nextInt();

        System.out.println("masukkan jumlah kolom matriks: ");
        int kolom = input.nextInt();

        int[][] matriks1 = new int [baris][kolom];
        int [][] matriks2 = new int [baris][kolom];
        int [][]hasil = new int [baris][kolom];

        System.out.println("masukkan elemen matriks pertama: ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.println("elemen [" + i + "][" + j + "]: ");
                matriks1[i][j] = input.nextInt();
            }
        }
        System.out.println("masukkan elemen matriks kedua: ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.println("elemen [" + i + "][" + j + "]: ");
                matriks2[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }
        System.out.println("hasil penjumlahan matriks: ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.println(hasil[i][j] + "\t");
            }
            System.out.println();
 }

    }
}
