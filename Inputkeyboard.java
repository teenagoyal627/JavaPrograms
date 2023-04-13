import java.util.*;

public class Inputkeyboard {
    public static void main(String arr[]){
           Scanner sc = new Scanner(System.in);
           System.out.println("enter 3 number from keyboard");
           int a=sc.nextInt();
           int b= sc.nextInt();
           int c= sc.nextInt();
           if(a>b && a>c)
           System.out.println(a);
           else if (b>a && b>c)
           System.out.println(b);
           else
           System.out.println(c);
    }
}
