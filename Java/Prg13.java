  /******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		String []words=s.split(" ");
		String temp=" ";
		for(String x:words){
		    temp=x+" "+temp;
		}
		System.out.println(temp);
	}
}
