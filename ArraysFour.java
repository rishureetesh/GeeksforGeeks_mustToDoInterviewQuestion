/*
*
* Missing number in array
*
*/
import java.util.Scanner;

class ArraysFour
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0)
        {
            int N=sc.nextInt();
            int[] arrayInput=new int[N];
            int sum=0;
            for(int i=0;i<N-1;i++)
            {
                arrayInput[i]=sc.nextInt();
                sum+=arrayInput[i];
            }
            System.out.println((N*(N+1)/2)-sum);
            T--;
        }
        sc.close();
    }
}