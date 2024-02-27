public class binarysearch {
    public static int binary(String[] menu,String key){
        int start=0,end=menu.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if (menu[mid].compareTo(key) < 0)
            {
                start=mid+1;
            
            }if (menu[mid] .compareTo(key)>0) {
                start=mid-1;
            }else{
                return mid;
            }
        }
return -1;

    }
    public static void main(String[] args) {
        String menu[] = {"dosa","tea","coffee","chola bhatura","namkin"};
        String key = "tea";
        System.out.println("key is at index: " + binary(menu, key));
    }
}
