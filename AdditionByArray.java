public class AdditionByArray {
    public static void main(String arr[])
{
    int a[]=new int [5];
    int i ,s=0;
    for (i=0;i<5;i++){
        a[i]= Integer.parseInt(arr[i]);
}
     for(i=0;i<5;i++){
            s=s+a[i];
     }
     System.out.println("The sum of elements of array are "+ s);
}    
}
