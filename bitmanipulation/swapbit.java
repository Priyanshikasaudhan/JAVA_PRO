import java.util.Scanner;
public class swapbit {
    public static void main(String args[]){
        System.out.println("Enetr any two number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swapping:"+a+" "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Before swapping:"+a+" "+b);
    }
}
