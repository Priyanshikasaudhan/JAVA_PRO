import java.lang.Integer;

public class sumsubarray {
    public static void Array(int num[]) {
        int sum = 0;
        int tp = 0;
        int maxsub = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                sum = 0; //
                for (int k = start; k <= end; k++) {
                    System.out.print(num[k] + " ");
                    sum += num[k];
                }
                tp++;
                System.out.println("sum= " + sum);
                if (maxsub < sum){
                    maxsub = sum;
                }
            }
            System.out.println();

        }
        System.out.println("Total subarray= " + tp);
        System.out.println("Max vakue of subarray: " + maxsub);
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };
        Array(num);
    }
}
