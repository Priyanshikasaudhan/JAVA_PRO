public class linear1 {
    public static int Search(String menu[],String key){
        for(int i=0;i<menu.length;i++){
            if ( menu[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String[] menu = {"Dosa","momos","chola bhatura","Chilli paneer"};
        String key = "Chilli paneer";
        // int[] number ={1,2,3};
        int index = Search(menu, key);
        if (index==-1) {
            System.out.println("Not found");
        }else{
            System.out.println("Key is at index="+index);
        }


    }
}

