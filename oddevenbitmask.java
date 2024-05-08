import java.util.Scanner;
public class oddevenbitmask{
    public static void ODDorEVEN(int n)
    {
        int bit=1;
        if ((n & bit) == 0) {
            System.out.println("Even Number");
        }
        // if ((n & bit) == 1) {
            else {
            System.out.println("Odd Number");
        }
    } 
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     ODDorEVEN(n);
    }
}