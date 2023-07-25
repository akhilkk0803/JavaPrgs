 interface Test{
 void square();
}

class Arithmetic implements Test{
public void square(){
System.out.print("Square");
}
}


public class test{

public static void main(String []args){
Arithmetic obj=new Arithmetic();
obj.square();
}

}
