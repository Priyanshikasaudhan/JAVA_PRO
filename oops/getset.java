public class getset {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.setcolor("yellow");
        System.out.println(p.getcolor());
        p.setTip(3);
        System.out.println(p.gettip());
    }
}
class Pen{
    private String color;
    private int tip;
    String getcolor(){
         return this.color;
    }
    int gettip(){
        return this.tip;
    }
    void setcolor(String newcolor){
        color = newcolor;
    }
    void setTip(int newtip){
        tip = newtip;
    }
}