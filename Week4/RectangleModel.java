public class RectangleModel
{
    class Rectangle {
    private double width;
    private double height;
    public Rectangle() {
        width = 1;
        height = 1;
    }
    public Rectangle(double side) {
        if (side > 0) {
            width = side;
            height = side;
        } else {
            width = 1;
            height = 1;
        }
    }
    public Rectangle(double width, double height) {
        if (width > 0 && height > 0) {
            this.width = width;
            this.height = height;
        } else {
            this.width = 1;
            this.height = 1; 
        }
    }

    
    public double getArea() {
        return width * height;
    }

    
    public double getPerimeter() {
        return 2 * (width + height);
    }

    
    public boolean isSquare() {
        return width == height;
    }

    
    public void scale(double factor) {
        if (factor > 0) {
            width *= factor;
            height *= factor;
        }
    }
    public String toString() {
        return  width  + height ;
    }
}

}
