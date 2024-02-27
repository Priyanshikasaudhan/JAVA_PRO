public class pairs {
    public static void Printpairs(int number[]){
        int tp=0;
        for(int i=0;i<number.length;i++){
            int crr = number[i];
            for(int j=i;j<number.length;j++){
                int pair = number[j];
                System.out.print("(" + crr + "," + pair + ")");
                tp++;
            }
            System.out.println();
          
        }
        System.out.println("Nmuber of pairs: "+tp);

    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        Printpairs(number);
    }
}
