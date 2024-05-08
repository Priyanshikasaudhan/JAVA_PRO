public class updateith {
    public static int clearprint(int n,int i){
        int bit = ~(1<<i);
        return n & bit;
    }
    public static int updateprint(int n,int i,int nwebit){
        n = clearprint(n, i);
        int bit = nwebit<<i;
        return n|bit;
    }
    public static void main(String[] args) {
        System.out.println(updateprint(10,2,1));
    }
}