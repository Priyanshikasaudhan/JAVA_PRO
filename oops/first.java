import java.util.Scanner;

public class first {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the color: ");
        String color = sc.nextLine();
        System.err.println(color);
        //  Pen p = new Pen();
        //  p.setcolor("blue");
        //  System.out.println(p.color);
        //  p.setTip(5);
        //  System.out.println(p.tip);
        System.out.print("Enter tip of pen: ");
        int tip = sc.nextInt();
        System.out.println(tip);
    }
}
class Pen{
    private String color;
    private int tip;
    void setcolor(String newcolor){
        color = newcolor;
    }
    void setTip(int newtip){
        tip = newtip;
    }
}
 
