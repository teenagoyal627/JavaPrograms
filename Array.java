import java.util.Scanner;

public class Array {
    public static void main(String arr[]){
        int a[]=new int [5];
        int i;
        System.out.println("enter values in array ");
        Scanner sc= new Scanner(System.in);
        for(i=0;i<5;i++){
                  a[i]=sc.nextInt();
        }
        for(i=0;i<5;i++){
            System.out.println("the values of array are " +  a[i]);
        }
    }
}
