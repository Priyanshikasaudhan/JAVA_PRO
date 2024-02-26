public class binsearch {
    public static int binary(int number[], int key) {
        int start = 0, end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
if (number[mid]==key) {
    return mid;
}if (number[mid]<key) {
    start=mid+1;
}else{
    start=mid-1;
}
        }
return -1;
    }

    public static void main(String[] args) {
        int number[]={1,2,45,23,90,21,24};
        int Key = 23;
        System.out.println("key is at index: " +binary(number, Key));

    }
}
