import java.util.Scanner;

public class Percobaan1_17{
    static int faktorialRekursif(int n) {
        if (n == 0) {
            return (1);
        } else {
            return (n * faktorialRekursif(n - 1));
        }
    }

    static int faktoriallteratif(int n) {
        int faktor = 1;
        for (int i = n; i >= 1; i--){
            faktor = faktor * i;
        }
        return faktor ;
    }

    public static void main(String[] args){
        System.out.println(faktorialRekursif(5));
        System.out.println(faktoriallteratif(5));
    }
    
}