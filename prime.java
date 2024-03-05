import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = sc.nextInt();
        for(int i=0;i<n/2;i++){
            if(n%2==0){
                System.out.println(n+" is not a prime number.");
            }else{
                System.out.println(n+ " is prime number.");
            }
        }
    }
    
}
