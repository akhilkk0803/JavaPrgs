class Mythread extends Thread{
 public void run(){
 for(int i=0;i<10;i++){
  System.out.println(Thread.currentThread().getName()+" "+i);
  }
 }
}
class RunnableThread implements Runnable{
public void run(){

for(int i=0;i<10;i++){
 System.out.println(Thread.currentThread().getName()+" "+i);
  }
 }
}
class thread{
public static void main(String []args){
  Mythread m1=new Mythread();
  Mythread m2=new Mythread();
  RunnableThread t1=new RunnableThread();
  RunnableThread t2=new RunnableThread();
  Thread r1=new Thread(t1);
  Thread r2=new Thread(t2);
  m1.setName("m1");
  m2.setName("m2");
 // m1.start();
 // m2.start();
  r1.setName("r1");
 r2.setName("r2");
  r1.start();
  r2.start();
 }
}
