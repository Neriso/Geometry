public class Square extends Rectangle {

    private String className;
    private float a;

    public Square(float a) {
        super(a, a);
        if (a <= 0){
            throw new IllegalArgumentException("All arguments must be greater than 0");
        } else {
            this.a = a;
        }
        this.className = "Square";

    }

    @Override
    public float getA() {
        return a;
    }

    @Override
    public String getAreaFormula() {
        String areaFormula = "a^2";
        return areaFormula;
    }

    @Override
    public String getPerimeterFormula() {
        String perimeterFormula = "4 x a";
        return perimeterFormula;
    }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        String toString = String.format("%s, a=%.2f",super.getClassName(), super.getA());
        return toString;
    }
}