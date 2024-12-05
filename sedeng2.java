import java.util.Scanner;
    public class sedeng2 {
        public static double hitung() {
            Scanner m = new Scanner(System.in);
            double r,t,ph,V;
            System.out.println("input jari jari");
            r=m.nextDouble();
            System.out.println("input tinggi");
            t=m.nextDouble();
            ph=Math.PI;

                V=ph*r*r*t;
            System.out.println("ini volumenya= "+ V);
        
            return V;

        }
        public static void main(String []args){
            System.out.println("ini adalah perhitungan Volume tabung");

            hitung();
        }
    }