public class Circle extends Shape {
    private float radius;
    private String name;
    private String className;
    private double area;
    private double perimeter;

    public Circle(float radius){
//        checkIfArgsGreaterThanZero(radius);
        if (radius <= 0){
            throw new IllegalArgumentException("All arguments must be greater than 0");
        } else {
            this.radius = radius;
        }
        this.className = "Circle";
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();

    }

    public String getName(){
        return name;
    }

    public double getArea(){
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public float getR() {
        return radius;
    }

    @Override
    public String getClassName(){
        return className;
    }

    @Override
    public String toString() {
        String toString = String.format("%s, r = %.2f", getClassName(), getR());
        return toString;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getAreaFormula() {
        String areaFormula = "π×r^2";
        return areaFormula;
    }

    @Override
    public String getPerimeterFormula() {
        String perimeterFormula = "2×π×r";
        return perimeterFormula;
    }


}