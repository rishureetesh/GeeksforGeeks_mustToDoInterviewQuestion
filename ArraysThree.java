/*
*
*  Kadane's Algorithm : To print the maximum sum of the contiguous sub-array
*
*/

import java.util.*;
class ArraysThree
{
    public int maximumConsecutiveSum(int[] arrayInput,int N)
    {
        int sum=0,sumToBeReturned=arrayInput[0];
        for(int i=0;i<N;i++)
        {
            sum+=arrayInput[i];
            sumToBeReturned = sumToBeReturned > sum ? sumToBeReturned : sum;
            if(sum<0)
                sum=0;
        }
        return sumToBeReturned;
    }
    public static void main(String []args)
    {
        ArraysThree AT=new ArraysThree();
        Scanner sc=new Scanner(System.in);
        short T=sc.nextShort();
        while(T>0)
        {
            int N=sc.nextInt();
            int[] arrayInput=new int[N];
            for(int i=0;i<N;i++)
                arrayInput[i]=sc.nextInt();
            int sum=AT.maximumConsecutiveSum(arrayInput,N);
            System.out.println(sum);
            T--;
        }
        sc.close();
    }
}