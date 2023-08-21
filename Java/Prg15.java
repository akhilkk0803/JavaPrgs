import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		String search=input.next();
		int count=0;
		int index=s.indexOf(search);
		while(index!=-1){
			count++;
			index=s.indexOf(search,index+1);
		}
		System.out.println(search+" appeared "+count+" times");
	}
}
