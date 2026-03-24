import java.util.Scanner;

public class Modulus {
    

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int a = obj.nextInt();
        int b = obj.nextInt();
        int Modulus = a % b;

        System.out.println(Modulus);
    }
}    

