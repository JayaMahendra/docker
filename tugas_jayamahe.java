import java.util.Scanner;

public class tugas_jayamahe {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        int angka1;
        System.out.println("Input Bilangan Pertama");
        angka1=sc.nextInt();
        int angka2;
        System.out.println("Input Bilangan Kedua");
        angka2=sc.nextInt();
        
        if (angka1>angka2) {
            System.out.println("Bilangan Terbesar Adalah : " +angka1);   
        }
         else if (angka2>angka1) {
            System.out.println("Bilangan Terbesar Adalah : " +angka2);
        }
    }
}
