import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s="akhil ak";
		System.out.println(s.contains("a"));
		int index=s.indexOf("a");
		while(index!=-1){
		    System.out.println(index);
		    index=s.indexOf("a",index+1);
		}
	    
	}
}
