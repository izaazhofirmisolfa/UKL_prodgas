import java.util.Scanner;

public class faktorial {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat positif: ");
        int n = Scanner.nextInt(); 
        if (n < 0) {
            System.out.println("Bilangan harus positif!");
        } else {
            long faktorial = 1; 

            for (int i = 1; i <= n; i++) {
                faktorial *= i; 
        } 
        System.out.println("Faktorial dari " + n + " adalah " + faktorial);
    }
    Scanner.close();
    }
}