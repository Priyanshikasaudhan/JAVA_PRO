public class clear {
    public static int clearIBit(int n,int i){
        int bit = (~0)<<i;
        return n&bit;
    }
    public static void main(String args[]){
        System.out.println(clearIBit(15,2));
    }
}
