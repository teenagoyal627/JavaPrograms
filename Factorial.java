public class Factorial {
    public static void main(String arr[]){
        int f=1,i,n;
        n=Integer.parseInt(arr[0]);
           for(i=1;i<=n;i++)
           {
            f=f*i;
           }
           System.out.println(f);
    }
    
}
