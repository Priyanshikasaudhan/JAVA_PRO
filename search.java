public class search {
    public static int car(String[] c,String key){
        for(int i=0;i<c.length;i++){
            if ( c[i] == key) {
                return i;
            }
        }
     return -1;   
    }

    public static void main(String[] args) {
        String  c[] = {"verna","BMW","volvo","creata","thar"};
        String key = "thar";
        int index = car(c,key);
        if (index==-1)
        {
            System.out.println("Not found");   
        }else{
            System.out.println(index);
        }

    }
}
