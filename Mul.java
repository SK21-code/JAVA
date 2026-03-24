import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

public class Mul {
    

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int a = obj.nextInt();
        int b = obj.nextInt();
        int Mul = a * b;
        
        System.out.println(Mul);
    }
}
