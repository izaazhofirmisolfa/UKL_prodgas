import java.util.Scanner;
public class ganjilgenap{
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Masukkan Angka");
         int angka = input.nextInt();
      
          if (angka%2==0){
            System.out.println("BILANGAN GENAP");
        }else{
            System.out.println("BILANGAN GANJIL");
        }
         input.close();
    }
}