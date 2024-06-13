import java.util.*;
public class rotate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n= 2;
       
        for(int i=0;i<n;i++){
            int j,last;
            last = arr[arr.length-1];
            for(j=arr.length-1;j>0;j--){
                 arr[j] =arr[j-1];
            }
            arr[0] = last;
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Left Rotate");
        for(int i=0;i<n;i++){
            int j ,start;
            start = arr[0];
            for(j=0;j<=arr.length;j++){
                arr[j] =arr[j+1];
            }
            arr[j] = start;
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
