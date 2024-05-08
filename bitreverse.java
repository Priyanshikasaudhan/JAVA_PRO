public class bitreverse {
    public static int Reverse(int n){
        int rev = 0;
        while(n>0){
            rev<<=1;
            if((n&1) == 1){
                rev ^= 1;
            }
            rev>>=1;
        }
        return rev;
    }
    public static void main(String args[]){
        System.out.println(Reverse(10));
    }
}
