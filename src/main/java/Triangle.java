public class Triangle extends Shape {
    private float a;
    private float b;
    private float c;
    private String name;
    private String className;
    private double area;
    private double perimeter;

    public Triangle(float a, float b, float c) {
        if (a <= 0 || b <= 0 || c <= 0){
            throw new IllegalArgumentException("All arguments must be greater than 0");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        this.name = name;
        this.className = "Triangle";
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    @Override
    public double calculateArea() {
        double area;
        double s;
        s = (a+b+c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter;
        perimeter = a+b+c;
        return perimeter;
    }

    @Override
    public String getAreaFormula() {
        String areaFormula = "sqrt(s(s-a)(s-b)(s-c)), s=(a+b+c)/2";
        return areaFormula;
    }

    @Override
    public String getPerimeterFormula() {
        String perimeterFormula = "a+b+c";
        return perimeterFormula;
    }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        String toString = String.format("%s, a=%.2f, b=%.2f, c=%.2f", getClassName(), getA(), getB(), getC());
        return toString;
    }
}