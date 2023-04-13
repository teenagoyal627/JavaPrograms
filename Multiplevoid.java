
public class Multiplevoid {

    static void main(){
        System.out.println("static wala main");
    }
    void main(int a,int b)
    {
        System.out.println(a+ " "+b);
    }
    void main(int a)
    {
        System.out.println(a);
    }
    public static void main(String arr[]){
        Multiplevoid a1=new Multiplevoid();
        a1.main();
        a1.main(3,4);
        a1.main(3);

    }
}
