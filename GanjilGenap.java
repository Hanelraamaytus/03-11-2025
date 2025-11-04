import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("Massukan BIlangan");
         int bilangan = input.nextInt();

         if (bilangan %2 == 0){
            System.out.println("Bilangan Genap");
         }else{
            System.out.println("Bilangan Ganjil");
         }
    }
}
