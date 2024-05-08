public class setith {
    public static int setithbit(int n,int i){
        int bit=1<<i;
        return n | bit;
    }
    public static void main(String[] args) {
        System.out.println(setithbit(10,2));
    }
}
