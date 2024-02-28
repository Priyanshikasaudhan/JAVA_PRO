import java.lang.Integer;
public class prefix {
    public static void MaxSubArr(int num[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]= new int[num.length];
        prefix[0]=num[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + num[i];
        }
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                currsum = start==0 ? prefix[end] : prefix[end] - prefix[start - 1];
            if(maxsum<currsum){
        maxsum = currsum;   
             }
            }
        }
        System.out.println("Max Sum: "+maxsum);
    }
    public static void main(String[] args) {
        int num[]={2,3,-1,2,34,-45};
    MaxSubArr(num);

    }
}
