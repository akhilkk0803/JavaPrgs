import java.util.Scanner;
interface Number{
int findCube(int n);
}
class A implements Number{
public  int findCube(int n){
 return n*n*n;
 }

}
class Prg9{
public static void main(String [] akhil){
A ob=new A();
int n;
System.out.println("Enter n");
Scanner input=new Scanner(System.in);
n=input.nextInt();
System.out.println(ob.findCube(n));
 }
}
