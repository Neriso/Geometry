public class RegularPentagon extends Shape {

    private String name;
    private float a;
    private String className;
    private double area;
    private double perimeter;

    public RegularPentagon(float a){
        if (a <= 0){
            throw new IllegalArgumentException("All arguments must be greater than 0");
        } else {
            this.a = a;
        }
        this.name = name;
        this.className = "Pentagon";
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();

    }

    public float getA() {
        return a;
    }

    public String getName() {
        return name;
    }

    @Override
    public double calculateArea() {
        area = (Math.pow(a, 2) * Math.sqrt((5*(5+2 * Math.sqrt(5)))))/4;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = 5 * a;
        return perimeter;
    }

    @Override
    public String getAreaFormula() {
        String areaFormula;
        areaFormula = "(a2 sqrt(5(5+2sqrt(5))))/4";
        return areaFormula;
    }

    @Override
    public String getPerimeterFormula() {
        String parimeterFormula;
        parimeterFormula = "5 x a";
        return parimeterFormula;
    }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        String toString = String.format("%s, a=%.2f", getClassName(), getA());
        return toString;
    }

}