public class Constructor {
    
    Constructor()
    {
        System.out.println("i am a constructor");
    }
    void Constructor () {
        System.out.println("i am a funciton ");
    }
    public static void  main(String arr[]){
        Constructor c1=new Constructor(); //isko likhne se constructor call ho jayega
        c1.Constructor();
    }
}
