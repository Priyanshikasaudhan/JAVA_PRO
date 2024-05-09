import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        System.out.println("Enter any two number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swapping"+a +" " +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping"+a +"  "+b);
    }
}
