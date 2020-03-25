import java.util.Scanner;

class ArraysFive
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        short T=sc.nextShort();
        while(T>0)
        {
            int arrayOne=sc.nextInt();
            int arrayTwo=sc.nextInt();
            int[] ArrayOne=new int[arrayOne];
            int[] ArrayTwo=new int[arrayTwo];
            for(int i=0;i<arrayOne;i++)
                ArrayOne[i]=sc.nextInt();
            for(int i=0;i<arrayTwo;i++)
                ArrayTwo[i]=sc.nextInt();
            int i=0,j=0;
            while(i<arrayOne && j<arrayTwo)
            {
                if(ArrayOne[i]<ArrayTwo[j])
                    System.out.print(ArrayOne[i++]+" ");
                System.out.print(ArrayTwo[j++]+" ");
            }
            while(i<arrayOne)
                System.out.print(ArrayOne[i++]+" ");
            while(j<arrayTwo)
                System.out.print(ArrayTwo[j++]+" ");
            T--;
            System.out.println();
        }
        sc.close();
    }
}