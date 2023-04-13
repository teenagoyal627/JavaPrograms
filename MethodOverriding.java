public class MethodOverriding {
    void show(){
        System.out.print("i am function of base class");
    }
          
    public static void main(String arr[]){
        MethodOverriding m1=new derived();
        m1.show();
    }


}
class derived extends MethodOverriding{
    void show(){
        System.out.println("i am function of derived class ");
    }

}
