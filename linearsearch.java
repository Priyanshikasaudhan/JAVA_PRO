public class linearsearch {
    public static int Linear(int[] number,int key){
        for(int i=0;i<number.length;i++){
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] number = {12,13,45,29,10,23,11};
        int key = 45;
        int index=Linear(number, key);
        if (index==-1) {
            System.out.println("Not Found");
        }
        else{
            System.out.println("Key is at index=" + index);
        }
    }
}
