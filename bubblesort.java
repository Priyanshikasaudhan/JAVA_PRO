import java.util.Scanner;
import java.util.*;

public class bubblesort {
    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) { //for increasing order.
                    // if(arr[i] < arr[i+1]) for decreasing order.
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void Printbuble(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

    public static void main(String[] args) {
        // int arr[] = { 5,4,1,3,2};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the value of array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        Printbuble(arr);
    }
}
