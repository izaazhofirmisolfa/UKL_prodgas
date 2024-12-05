public class sulit3 {
    public static void main(String[] args) {
        int[] angka = {1, 2, 2, 3, 3, 3, 4};
        
        int[] frekuensi = new int[5];
        
        for (int i = 0; i < angka.length; i++) {
            frekuensi[angka[i]]++;
        }
        
        System.out.println("Frekuensi Elemen:");
        for (int a = 0; a < frekuensi.length; a++) {
            if (frekuensi[a] > 0) {
                System.out.println(a + " muncul " + frekuensi[a] + " kali");
            }
        }
    }
 }