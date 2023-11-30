import java.util.Scanner;
public class Percobaan2_17 {
    static int hitungPangkat(int x, int y){
        if (y == 0){
            return (1);
        } else {
            return (x *hitungPangkat(x, y - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Bilangan, Pangkat;

        System.out.print("Bilangan yang dihitung: ");
        Bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        Pangkat =sc.nextInt();
        System.out.println(hitungPangkat(Bilangan, Pangkat));

        for (int i = 1; i <= Pangkat; i++) {
            System.out.print(Bilangan + " x ");
        }
        System.out.print("1 = "+hitungPangkat(Bilangan, Pangkat));
    }
}
