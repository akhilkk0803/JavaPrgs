// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Circle{
    private double radius;
    private String color="red";
    Circle(){
    radius=1.0;
    }
    Circle(double radius){
        this.radius=radius;
    }
    Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    double getRadius(){
        return this.radius;
    }
    String getColor(){
        return this.color;
    }
    void setColor(String Color){
        this.color=color;
    }
    void setRadius(double radius){
        this.radius=radius;
    }
    double getArea(){
        return (22/(7*1.0)*radius*radius);
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Circle c1=new Circle();
        Circle c2=new Circle(4.5);
        Circle c3=new Circle(4.8,"blue");
        System.out.println("Color for c1: "+c1.getColor()+" Radius for c1: "+
                            c1.getRadius()+"Area of c1:"+c1.getArea());
        System.out.println("Color for c2: "+c2.getColor()+" Radius for c2: "+
                            c2.getRadius()+"Area of c2:"+c2.getArea());
        System.out.println("Color for c3: "+c3.getColor()+" Radius for c3: "+
                            c3.getRadius()+"Area of c3:"+c3.getArea());
        
    }
}
