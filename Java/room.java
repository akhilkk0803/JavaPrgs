// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Room
{
    int roomno;
    String roomtype ;
    double area;
    void setData(int roomno,String roomtype,double area){
        this.roomno=roomno;
        this.roomtype=roomtype;
        this.area=area;
    }
    void display(){
        System.out.println("Roomno: "+roomno+" RoomType: "+roomtype+" Area:"
        +area+"sq");
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Room r1=new Room();
        r1.setData(1,"bedroom",2000);
        r1.display();
    }
}