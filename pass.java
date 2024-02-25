public class pass {
    public static void update(int marks[],int nonchangable){
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i] + 2;
            nonchangable = 10;
        }
    }
    public static void main(String[] args) {
       int marks[] = {23,12,14};
       int nonchangable = 5;
       update(marks, nonchangable);
       System.out.println(nonchangable);
       for(int i=0;i<marks.length;i++){
        System.out.println(marks[i]);
        
        }
       }
    }
