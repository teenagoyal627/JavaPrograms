public class DDM {
    void show(){
        System.out.print("i am base calss function");
    }
    void show1(){
        System.out.println("i am base class function but not same function name");
    }
    public static void main(String arr[]){
        DDM d1= new pqr();
        d1.show();
        d1.show1();
        // d1.show2();
    }
}

class pqr extends DDM{
    void show(){
        System.out.println("i am derived class function ");
    }
    void show2(){
        System.out.println("i am second funciton of derived calss ");
    }
}