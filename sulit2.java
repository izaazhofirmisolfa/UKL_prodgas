public class sulit2 {
    public static void main(String[] args) {
        // Contoh array
        int[] array = {1, 2, 3, 4, 2, 5};
        
        // Memanggil metode untuk mengecek duplikat
        cekDuplikat(array);
    }

    public static void cekDuplikat(int[] array) {
        boolean adaDuplikat = false; // Flag untuk menandai ada tidaknya duplikat
        
        // Looping untuk memeriksa setiap elemen
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                // Jika ada elemen yang sama
                if (array[i] == array[j]) {
                    System.out.println("Array memiliki elemen duplikat: " + array[i]);
                    adaDuplikat = true; // Set flag menjadi true
                    break; // Keluar dari loop dalam
                }
            }
            if (adaDuplikat) {
                break; // Keluar dari loop luar jika sudah ditemukan duplikat
            }
        }

        // Jika tidak ada duplikat
        if (!adaDuplikat) {
            System.out.println("Array tidak memiliki elemen duplikat.");
        }
    }
}
