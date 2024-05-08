public class clearith { 
    public static int clearprint(int n,int i){
        int bit = ~(1<<i);
        return n & bit;
    }
    public static void main(String[] args) {
        System.out.println(clearprint(10,1));
    }
    
}
