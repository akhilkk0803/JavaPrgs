import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		String search=input.next();
		int ind=s.indexOf(search);
		System.out.println(ind);
	}
}
