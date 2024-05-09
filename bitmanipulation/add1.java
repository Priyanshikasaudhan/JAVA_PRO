public class add1 {
    // least significantbit
    // public static int add(int n){
    //     int a= (~n);
    //     int sum = a&1;
    //     return sum;
    // }
    // add with method
    // public static int add(int n){
    //     int m=1;
    //     while ((n&m)>=1) {
    //         n=n^m;
    //         m<<=1;
    //     }
    //     n=n^m;
    //     return n;
    // }
    public static void main(String[] args) {
        int a = -(~13);
         System.out.println(a);
    }
}
