import java.util.Scanner;

public class repeatnum {
    public static boolean Reapeatvalue(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i] == arr[j]) {
                    //  System.out.println(true);
                    return true;
            }  
        }
    }
    // System.out.println("Not Match.");
        return false;
    }
    
    public static void main(String[] args){
        // int arr[] = {1,2,4,5};
        // System.out.println(Reapeatvalue(arr));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the value: ");
        for(int i=0;i<n;i++){
         arr[i] = sc.nextInt();
        }
        System.out.println( Reapeatvalue(arr));
    }
}
