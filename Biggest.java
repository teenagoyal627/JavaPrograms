import javax.lang.model.util.ElementScanner6;

public class Biggest {
    public static void main(String arr[]){
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        if(a>b && a>c)
        System.out.println(a);
        else if(b>a && b>c)
        System.out.println(b);
        else
        System.out.println(c);




    }
    
}
