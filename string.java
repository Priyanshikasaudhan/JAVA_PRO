import java.util.Scanner;
import java.util.*;

public class string {
     public static void main(String args[]){
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Lenght of array=" + marks.length);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("Marks[0]=" +marks[0]);
        System.out.println("Marks[1=" +marks[1]);
        System.out.println("Marks[2]=" +marks[2]);
        marks[1] = marks[1]+1;
        System.out.println("Marks[1]" +marks[1]);
    }


}
