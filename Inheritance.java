public class Inheritance {
    
    private int a;
    protected int b;
    public int c;
    int d;
    void show(){
           System.out.println(a);
           System.out.println(b);
           System.out.println(c);

    }
    public static void main(String arr[]){
        pqr p1=new pqr();
        p1.show();
        p1.show2();
    }
}
class pqr extends Inheritance{
    void show2(){
        // System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
   
}
