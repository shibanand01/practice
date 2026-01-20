abstract class Shape {
    int radius;
    int length;
    abstract double area();
}
class Circle extends Shape{
    Circle(int i)
    {
        this.radius = i;
    }
    public double area(){
        return (double)(radius*radius*3.14);
    }
}
class Square extends Shape{
    Square(int i)
    {
        this.length = i;
    }
    
    public double area()
    {
        return (double)(length*length); 
    }
}
class Calc{
    public static void main(String[] args) {
        Shape s1 = new Circle(20);
        Shape s2 = new Square(12);
        System.out.println(s1.area());
        System.out.println(s2.area());

    }
}