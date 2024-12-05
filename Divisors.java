import java.util.*;
public class Divisors {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int x=sc.nextInt();
            for(int j=1;j<=x;j++)
            {
                if((x%j)==0)
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
