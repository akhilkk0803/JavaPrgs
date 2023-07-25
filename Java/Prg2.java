// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // int n=input.nextInt();
        // int []arr=new int[n];
        // System.out.println("Enter "+n +"Elements");
        // int sum=0;
        //  for(int i=0;i<n;i++)
        // {   
        //     arr[i]=input.nextInt();
        //     sum+=arr[i];
        // }
        // System.out.println("The sum is "+sum);
         System.out.println("Enter number of rows and cols");
        int n=input.nextInt();
        int m=input.nextInt();
        int [][]arr=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
        
    }
}
