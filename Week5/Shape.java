public  abstract class Shape{
    private String color;
    public Shape(String color){
        this.color = color;
    }
    public abstract double area();
    public abstract double perimeter();
    public String ToString(){
        return "Color: " + color + ", Area: " + area() + ", Perimeter: " + perimeter();
    }   

}
 class Circle extends Shape{
    private double radius;
    public Circle(String color, double radius)
    {
        super(color);
        this.radius = radius;
    }
    public double GetRadius(){
        return radius;
    }
    public double SetRadius(double radius){
        if(radius <0)
        {
            System.out.println("Radius cannot be negative");
            return 0;
        }
        else
        {
            this.radius = radius;
            return radius;
        }
    }
    public double area()
    {
        return 3.14 * radius * radius;
    }

    public double perimeter()
    {
        return 2 * 3.14 * radius;
    }
    public String ToString(){
        return "Circle: " + super.ToString() + ", Radius: " + radius;
    }
}
 class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(String color, double length, double width)
    {
        super(color);
        this.length = length;
        this.width = width;
    }
    public double GetLength(){
        return length;
    }
    public double SetLength(double length){
        if(length <0)
        {
            System.out.println("Length cannot be negative");
            return 0;
        }
        else
        {
            this.length = length;
            return length;
        }
    }
    public double GetWidth(){
        return width;
    }
    public double SetWidth(double width){
        if(width <0)
        {
            System.out.println("Width cannot be negative");
            return 0;
        }
        else
        {
            this.width = width;
            return width;
        }
    }
    public double area()
    {
        return length * width;
    }

    public double perimeter()
    {
        return 2 * (length + width);
    }
    public String ToString(){
        return "Rectangle: " + super.ToString() + ", Length: " + length + ", Width: " + width;
    }
}
 class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle(String color, double base, double height)
    {
        super(color);
        this.base = base;
        this.height = height;
    }
    public double GetBase(){
        return base;
    }
    public double SetBase(double base){
        if(base <0)
        {
            System.out.println("Base cannot be negative");
            return 0;
        }
        else
        {
            this.base = base;
            return base;
        }
    }
    public double GetHeight(){
        return height;
    }
    public double SetHeight(double height){
        if(height <0)
        {
            System.out.println("Height cannot be negative");
            return 0;
        }
        else
        {
            this.height = height;
            return height;
        }
    }
    public double area()
    {
        return 0.5 * base * height;
    }

    public double perimeter()
    {
        return 3 * base;
    }
    public String ToString(){
        return "Triangle: " + super.ToString() + ", Base: " + base + ", Height: " + height;
    }
}
