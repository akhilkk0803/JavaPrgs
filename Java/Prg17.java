public class Main
{
	public static void main(String[] args) {
	String  date="04/25/1995";
	String []months={" ","January","February","March","April","May","June","July","August","September",
	"October","November","December"};
	String temp=date.substring(0,2);
	int month=Integer.parseInt(temp);
	System.out.println(months[month] + " "+date.substring(3,5)+","+date.substring(6,10));
	}
}
