import java.util.Scanner;

public class ithbit {
    public static int ITHBit(int n ,int i){
        int bit = 1<<i;
        if ((n&bit) == 0) {
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(ITHBit(n,i)); 
    }
}
