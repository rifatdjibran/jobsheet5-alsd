import java.util.Scanner;

public class MainFaktorial18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        Faktorial18 fk = new Faktorial18();

        System.out.println("Nilai faktorial " + nilai + " menggunakan Brute Force: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan Divide and Conquer: " + fk.faktorialDC(nilai));
        
        input.close();
    }
}
