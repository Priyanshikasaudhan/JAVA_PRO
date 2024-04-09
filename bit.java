import java.util.Scanner;

public class bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr first value:");
        int n = sc.nextInt();
        System.out.println("Enter second value:");
        int m = sc.nextInt();
        System.out.print("XOR:");
        System.out.println(n^m);
        System.out.print("Complement:");
        System.out.println(~n);
        System.out.println();
    }
}
