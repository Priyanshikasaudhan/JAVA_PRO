import java.util.Scanner;

public class selectionbubble {
    public static void selectSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos] > arr[j]){
                    minpos = j;
                }
            }
            int temp=arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void Printbuble(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
            selectSort(arr);
            Printbuble(arr);
    }
    }
    

