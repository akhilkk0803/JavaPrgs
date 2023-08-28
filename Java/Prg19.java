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
	    StringBuffer s=new StringBuffer();
	    System.out.println(s.capacity());
	    StringBuffer s1=new StringBuffer("Hello");
	    System.out.println(s1.capacity());
	    s1.reverse();
	    System.out.println(s1);
	    String res=s1.toString().toUpperCase();
	    System.out.println("Enter string to append");
	    String add=input.nextLine();
	    res=res.concat(add);
	    System.out.println(res);
	}
}
