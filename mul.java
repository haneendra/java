import java.util.*;
class Multiple
{
    public static void main(String...args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a value");
        int a=s.nextInt();
        for(int i=1;i<=10;i++)
        System.out.printf("%d * %d = %d \n", a, i, a * i);
        
    }
}