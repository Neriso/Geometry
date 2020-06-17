

public class Main {

    private static ShapeList shapes = new ShapeList();
    private static Display display = new Display();


    public static void main(String[] args) {
        Display display = new Display();
        boolean isRunning = true;
        int option;

        while (isRunning) {
            display.clearScreen();
            display.displayMenu();
            int numberOfOptions = 6;
            option = display.gatherIntInput("What do you want to do?: ", numberOfOptions);

            switch (option) {
                case 1:
                    addNewShape();
                    break;
                case 2:
                    showAll();
                    break;
                case 3:
                    showByLargestPerimeter();
                    break;
                case 4:
                    showByLargestArea();
                    break;
                case 5:
                    showFormulas();
                    break;
                case 0:
                    isRunning = false;
                    break;

            }
        }
    }

    public static void addNewShape(){
        display.clearScreen();
        int numberOfOptions = 7;
        display.displayAddShape();
        int option;
        option = display.gatherIntInput("What kind of shape do you want to add?: ", numberOfOptions);
        switch (option) {
            case 1:
                addCircle();
                break;
            case 2:
                addTriangle();
                break;
            case 3:
                addEqTriangle();
                break;
            case 4:
                addRectangle();
                break;
            case 5:
                addSquare();
                break;
            case 6:
                addPentagon();
                break;
            case 0:
                break;
        }
    }

    private static void showFormulas(){
        display.clearScreen();
        display.displayShapes();
        int numberOfOptions = 6;
        int index = display.gatherIntInput("What kind of shapes formulas do you want to display?: ", numberOfOptions);
        showFormulasByIndex(index);
//        display.clearScreen();
//        System.out.println(display.showFormulas(shapeToShowFormulas));
//        display.emptyInput();
    }

    private static void showFormulasByIndex(int index) {
        switch (index){
            case 0:
                display.showFormulas("Circle", "π×r^2", "2×π×r");
                break;
            case 1:
                display.showFormulas("Equilateral triangle", "3 x a", "(a^2xsqrt(3))/4");
                break;
            case 2:
                display.showFormulas("Rectangle", "a x b", "2a + 2b");
                break;
            case 3:
                display.showFormulas("Pentagon", "(a2 sqrt(5(5+2sqrt(5))))/4", "5 x a");
                break;
            case 4:
                display.showFormulas("Triangle", "sqrt(s(s-a)(s-b)(s-c)), s=(a+b+c)/2", "a+b+c");
                break;
            case 5:
                display.showFormulas("Square", "a^2", "4 x a");
                break;
        }
    }

    private static void addCircle() {
        display.clearScreen();
//        String name = display.gatherName("Enter circle name: ");
        float radius = display.gatherFloatInput("Enter radius lenght: ");
        Shape circle = new Circle(radius);
        shapes.addShape(circle);
    }

    private static void addTriangle() {
        display.clearScreen();
//        String name = display.gatherName("Enter triangle name: ");
        float a = display.gatherFloatInput("Enter one side's length of a triangle: ");
        float b = display.gatherFloatInput("Enter second side's length of a triangle: ");
        float c = display.gatherFloatInput("Enter third side's length of a triangle: ");
        Shape triangle = new Triangle(a, b, c);
        shapes.addShape(triangle);
    }

    private static void addEqTriangle(){
        display.clearScreen();
//        String name = display.gatherName("Enter triangle name: ");
        float a = display.gatherFloatInput("Enter side's length of a triangle: ");
//        float b = a;
//        float c = a;
        Shape eqTriangle = new EquilateralTriangle(a);
        shapes.addShape(eqTriangle);
    }

    private static void addRectangle(){
        display.clearScreen();
//        String name = display.gatherName("Enter rectangle name: ");
        float a = display.gatherFloatInput("Enter one side's length of a rectangle: ");
        float b = display.gatherFloatInput("Enter second side's length of a rectangle: ");
        Shape rectangle = new Rectangle(a, b);
        shapes.addShape(rectangle);
    }

    private static void addSquare(){
        display.clearScreen();
//        String name = display.gatherName("Enter square name: ");
        float a = display.gatherFloatInput("Enter side's length of a square: ");
//        float b = a;
        Shape square = new Square(a);
        shapes.addShape(square);
    }

    private static void addPentagon(){
        display.clearScreen();
//        String name = display.gatherName("Enter pentagon name: ");
        float a = display.gatherFloatInput("Enter side's length of a pentagon: ");
        Shape pentagon = new RegularPentagon(a);
        shapes.addShape(pentagon);
    }

    private static void showAll(){
        display.clearScreen();
        System.out.println(shapes.getShapesTable());
        display.emptyInput();
    }

    private static void showByLargestPerimeter(){
        display.clearScreen();
        Shape largestByPerimeter = shapes.getLargestShapeByPerimeter();
        String perimeter = "perimeter";
        display.displayLargest(largestByPerimeter, perimeter);
        display.emptyInput();
    }

    private static void showByLargestArea(){
        display.clearScreen();
        String area = "area";
        Shape largestByArea = shapes.getLargestShapeByArea();
        display.displayLargest(largestByArea, area);
        display.emptyInput();
    }
}