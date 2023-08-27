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
	System.out.println("Enter Date in mm/dd/yyyy format");
	String  date=input.nextLine();
	String []months={" ","January","February","March","April","May","June","July","August","September",
	"October","November","December"};
	String temp=date.substring(0,2);
	int month=Integer.parseInt(temp);
	System.out.println(months[month] + " "+date.substring(3,5)+","+date.substring(6,10));
	}
}
