
public class App {
    private static ShapeList shapes = new ShapeList();
    private static InputProvider inputProvider = new InputProvider();
    private static MenuPrinter menuPrinter = new MenuPrinter();

    
    public void main(){
        boolean isRunning = true;
        int option;
        while (isRunning) {
            menuPrinter.printMainMenu();
            int numberOfOptions = 7;
            option = inputProvider.TakeIntegerInput("What do you want to do?: ", numberOfOptions);
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
                case 6:
                    menuPrinter.printInfo();
                    break;
                case 0:
                    isRunning = false;
                    break;

            }
        }   
    }


    private void addNewShape(){
        int numberOfOptions = 7;
        menuPrinter.printAddShapeMenu();
        int option;
        option = inputProvider.TakeIntegerInput("What kind of shape do you want to add?: ", numberOfOptions);
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

    private void showFormulas(){
        menuPrinter.printShapesMenu();
        int numberOfOptions = 6;
        int index = inputProvider.TakeIntegerInput("What kind of shapes formulas do you want to display?: ", numberOfOptions);
        showFormulasByIndex(index);
    }

    private void showFormulasByIndex(int index) {
        switch (index){
            case 0:
                inputProvider.showFormulas("Circle", "π×r^2", "2×π×r");
                break;
            case 1:
                inputProvider.showFormulas("Equilateral triangle", "3 x a", "(a^2xsqrt(3))/4");
                break;
            case 2:
                inputProvider.showFormulas("Rectangle", "a x b", "2a + 2b");
                break;
            case 3:
                inputProvider.showFormulas("Pentagon", "(a2 sqrt(5(5+2sqrt(5))))/4", "5 x a");
                break;
            case 4:
                inputProvider.showFormulas("Triangle", "sqrt(s(s-a)(s-b)(s-c)), s=(a+b+c)/2", "a+b+c");
                break;
            case 5:
                inputProvider.showFormulas("Square", "a^2", "4 x a");
                break;
        }
    }

    private void addCircle() {
        float radius = inputProvider.takeFloatInput("Enter radius lenght: ");
        Shape circle = new Circle(radius);
        shapes.addShape(circle);
    }

    private void addTriangle() {
        float a = inputProvider.takeFloatInput("Enter one side's length of a triangle: ");
        float b = inputProvider.takeFloatInput("Enter second side's length of a triangle: ");
        float c = inputProvider.takeFloatInput("Enter third side's length of a triangle: ");
        Shape triangle = new Triangle(a, b, c);
        shapes.addShape(triangle);
    }

    private void addEqTriangle(){
        float a = inputProvider.takeFloatInput("Enter side's length of a triangle: ");
        Shape eqTriangle = new EquilateralTriangle(a);
        shapes.addShape(eqTriangle);
    }

    private void addRectangle(){
        float a = inputProvider.takeFloatInput("Enter one side's length of a rectangle: ");
        float b = inputProvider.takeFloatInput("Enter second side's length of a rectangle: ");
        Shape rectangle = new Rectangle(a, b);
        shapes.addShape(rectangle);
    }

    private void addSquare(){
        float a = inputProvider.takeFloatInput("Enter side's length of a square: ");
        Shape square = new Square(a);
        shapes.addShape(square);
    }

    private void addPentagon(){
        float a = inputProvider.takeFloatInput("Enter side's length of a pentagon: ");
        Shape pentagon = new RegularPentagon(a);
        shapes.addShape(pentagon);
    }

    private void showAll(){
        System.out.println(shapes.getShapesTable());
        inputProvider.takeEmptyInput();
    }

    private void showByLargestPerimeter(){
        Shape largestByPerimeter = shapes.getLargestShapeByPerimeter();
        String perimeter = "perimeter";
        inputProvider.displayLargest(largestByPerimeter, perimeter);
        inputProvider.takeEmptyInput();
    }

    private void showByLargestArea(){

        String area = "area";
        Shape largestByArea = shapes.getLargestShapeByArea();
        inputProvider.displayLargest(largestByArea, area);
        inputProvider.takeEmptyInput();
    }
}


