public class EquilateralTriangle extends Triangle {

    private String className;

    private float a;

    public EquilateralTriangle(float a) {
        super(a, a, a);
        if (a <= 0){
            throw new IllegalArgumentException("All arguments must be greater than 0");
        } else {
            this.a = a;
        }
        this.className = "EqTriangle";
    }

    @Override
    public float getA() {
        return a;
    }

    @Override
    public String getAreaFormula() {
        String areaFormula = "3 x a";
        return areaFormula;
    }

    @Override
    public String getPerimeterFormula() {
        String perimeterFormula = "(a^2xsqrt(3))/4";
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