public class Static {
    
    static{
    System.out.println("i am first  static");
    }
    static
    {
        System.out.println("i am second static");
    }
    public static void main(String arr[]){
        System.out.println("i am main ");
    }
    static{
        System.out.println("i am third  static after main but execute before main ");
    }
    
}
