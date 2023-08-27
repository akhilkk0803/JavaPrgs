/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.lang.Math;
class even extends Thread{
    int no;
    even(int no){
        this.no=no;
    }
    public void run(){
        System.out.println(no+" "+no*no);
    }
}  
class odd extends Thread{
    int no;
    odd(int no){
        this.no=no;
    }
    public void run(){
        System.out.println(no+" "+no*no*no);
    }
}
class myt extends Thread{
    public void run()  {
        for(int i=0;i<10;i++){
            int no=(int)(Math.random()*100);
            if(no%2==0){
                even t1=new even(no);
                t1.run();
            }
            else {
                odd t1=new odd(no);
                 t1.run();
            }
           try{ 
               Thread.sleep(1000);
               
           }
           catch(InterruptedException e){
               
            }
           }
        }
    }

public class Main
{
	public static void main(String[] args) {
	    myt t1=new myt();
	    t1.start();
	}
}
