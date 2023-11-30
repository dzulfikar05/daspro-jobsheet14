import java.util.Scanner;

public class PenjumlahanRekursif_08 {
    static int penjumlahan(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + penjumlahan(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i ++){
            System.out.print(i + " + ");
        }
        int hasil = penjumlahan(n);
        System.out.print("0 = "+hasil);
    }
}
