import java.lang.Integer;
public class allminuskadanes {
    public static void Minuskadan(int num[]){
        int currsum=0;
        int maxsum = Integer.MIN_VALUE;
        // maxsum = Math.max(maxsum, currsum);
        for(int i=0;i<num.length;i++){
            currsum = currsum+num[i];}
            if(currsum<0){
                currsum = 0;}
                 maxsum = Math.max(maxsum, currsum);
            if ( maxsum == 0){
                System.out.println(-1);
            }  else{
                System.out.println("Max = "+ maxsum );
            }
        }
    public static void main(String[] args) {
        int num[]={-2,-1,-3,-4,-1,-2,-1,-5,-4};
        Minuskadan(num);
    }
}
