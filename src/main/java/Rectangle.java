public class Rectangle extends Shape {
    private float a;
    private float b;
    private String name;
    private String className;
    private double area;
    private double perimeter;

    public Rectangle(float a, float b){

//        super.checkIfArgsGreaterThanZero(a, b);
        if (a <= 0 || b <= 0){
            throw new IllegalArgumentException("All arguments must be greater than 0");
        } else {
            this.a = a;
            this.b = b;
        }
        this.name = name;
        this.className = "Rectangle";
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
    }

//    public Rectangle(float a){
//        this.a = a;
//    }

    public String getName() {
        return name;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    @Override
    public double calculateArea() {
        // double area;
        area = a*b;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        // double perimeter;
        perimeter = 2*a + 2*b;
        return perimeter;
    }

    @Override
    public String getAreaFormula() {
        String areaFormula = "a x b";
        return areaFormula;
    }

    @Override
    public String getPerimeterFormula() {
        String perimeterFormula = "2a + 2b";
        return perimeterFormula;
    }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        String toString = String.format("%s, a=%.2f, b=%.2f", getClassName(), getA(), getB());
        return toString;
    }
}