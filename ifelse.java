import java.util.Scanner;

public class ifelse {
    

    public static void main(String[] args) {
        int num ;
        Scanner obj=new Scanner(System.in);
       System.out.println("Enter num");
        num = obj.nextInt();

       if(num%2==0){
        System.out.println("Its even");

       }else{
        System.out.println("it is odd");
       }
    }
}
