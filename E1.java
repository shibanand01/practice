abstract class Shape{
    double area;
    abstract void area();
}
class Circle extends Shape{
    int radius;
    Circle(int radius)
    {
        this.radius = radius;
    }
    public void area()
    {
        this.area = 3.14*radius*radius;
        System.out.println(area);
    }
}
class Rectangle extends Shape{
    int length;
    int breadth;
    Rectangle(int length, int breadth)
    {
        this.length= length;
        this.breadth = breadth;
    }
    public void area()
    {
        this.area = length*breadth;
        System.out.println(area);
    }
}
class Calc
{
    public static void main(String[] args) {
        Shape s1 = new Rectangle(12, 010);
        Shape s2 = new Circle(22);
        s1.area();
        s2.area();
    }
}