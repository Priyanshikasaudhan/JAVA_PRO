public class repeatnum {
    public static void Reapeatvalue(int arr[]){
        for(int i=0;i<arr.length;i++){
            if ((arr[i] != arr[i])) {
                 System.out.println(false);
            } 
             if (arr[i] == arr[i]) {
                System.out.println(true);
             }
           else{
            System.out.println("Not match");
           }     
            }
        }
    
    public static void main(String[] args){
        int arr[] = {1,1,2,4,5};
        // System.out.println(Reapeatvalue(arr));
        Reapeatvalue(arr);
    }
}
