public class subarr {
    public static void Array(int num[]){
        int tp=0;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(num[k]+" ");
                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarray= "+tp);
    }   
    public static void main(String[] args) {
        int num[]= {2,4,6,8,10};
        Array(num);
    }
}
