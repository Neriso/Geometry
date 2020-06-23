import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShapeList {

    private List<Shape> shapesList;

    public ShapeList() {
        this.shapesList = new ArrayList<>();

    }

    public void addShape(Shape shape) {
        shapesList.add(shape);
    }

    public Shape getShapeAt(int index) {
        Shape shapeToShowFormulas = shapesList.get(index);
        return shapeToShowFormulas;
    }

    public Shape getLargestShapeByPerimeter() {
        try {
            ArrayList<Shape> sortedShapes = (ArrayList<Shape>) shapesList.stream()
                    .sorted(Comparator.comparing(Shape::calculatePerimeter)).collect(Collectors.toList());
            Shape largestByParimeter = sortedShapes.get(shapesList.size() - 1);
            return largestByParimeter;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("There is no element to display, add it first!");
        }
        return null;
    }

    public Shape getLargestShapeByArea() {
        try {
            ArrayList<Shape> sortedShapes = (ArrayList<Shape>) shapesList.stream()
                    .sorted(Comparator.comparing(Shape::calculateArea)).collect(Collectors.toList());
            Shape largestByArea = sortedShapes.get(shapesList.size() - 1);
            return largestByArea;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("There is no element to display, add it first!");
        }
        return null;
    }

    public String getShapesTable() {
        StringBuilder table = new StringBuilder();
        String header = String.format(
                "%4s %8s %23s %10s %14s %7s %22s \n", "idx", "Class",
                "toString", "Perimeter", "Formula", "Area", "Formula");
        table.append(header);
        for (Shape shape : shapesList) {
            table.append(String.format("| %-4d| %-10s| %-37s| %-10.2f| %-20s| %-10.2f| %-35s|\n",
                    shapesList.indexOf(shape), shape.getClassName(),
                    shape.toString(), shape.calculatePerimeter(),
                    shape.getPerimeterFormula(), shape.calculateArea(),
                    shape.getAreaFormula()));
        }
        return table.toString();
    }
}