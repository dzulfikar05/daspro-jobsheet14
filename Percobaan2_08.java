import java.util.Scanner;

public class Percobaan2_08 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.print ("Bilangan yang dihitung: ");
        bilangan = sc.nextInt ();
        System.out.print ("Pangkat: ");
        pangkat = sc.nextInt ();

        for(int i = 1; i <= pangkat; i ++){
            System.out.print(bilangan + " x ");
        }
        System.out.print("1 = "+hitungPangkat(bilangan, pangkat));
    }
}
