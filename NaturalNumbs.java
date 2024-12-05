import java.util.*;
public class NaturalNumbs
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=n-1;
        while(i>=0)
        {
            System.out.println(n-i);
            i-=1;
        }
    }
}