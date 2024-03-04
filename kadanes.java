import java.lang.Integer;
public class kadanes {
    public static void kadane(int num[]){
        int ms = Integer.MIN_VALUE;
        int cs =0 ;
        for(int i=0;i<num.length;i++){
            cs = cs+num[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("MAX= "+ms);
    }
    public static void main(String[] args) {
        int num[]={ -1,2,-32,43,-4};
        kadane(num);
    }
}
