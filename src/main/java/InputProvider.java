import java.util.InputMismatchException;
import java.util.Scanner;

public class InputProvider {
    public static Scanner scan = new Scanner(System.in);

    public int TakeIntegerInput(String title, int numberOfOptions){
        scan.useDelimiter(System.lineSeparator());
        int option = 0;
        String userInput;
        System.out.print(title);
        boolean validInput = false;
        while (!validInput) {
            userInput = scan.next();
            if (!userInput.equals("")){
                if(userInput.matches("^[0-9]*$")){
                    option = Integer.parseInt(userInput);
                    if(option >= 0 && option < numberOfOptions){
                        validInput = true;
                    }
                }
            }

        }
        return option;
    }

    private float validateFloat() {
        scan.useDelimiter(System.lineSeparator());
        float userInput = 1;
        boolean validInput =  false;
        while (!validInput){
            userInput = scan.nextFloat();
            if (userInput > 0){
                validInput = true;
            }
        }
        return userInput;
    }

    public float takeFloatInput(String title){
        float floatInput = 1;
        while (true){
            try{
                System.out.print(title);
                floatInput = validateFloat();
                break;
            }
            catch (InputMismatchException e){
                System.err.println("\nYou must enter a float number grater than 0! \n");
                continue;
            }
        }
        return floatInput;
    }

    public String takeStringInput(String title){
        System.out.print(title);
        scan.useDelimiter(System.lineSeparator());
        String stringInput = "";
        stringInput = scan.next();
        if (stringInput.length() > 10){
            stringInput = stringInput.substring(0, 10);
        }
        return stringInput;
    }

    public void takeEmptyInput(){
        scan.useDelimiter(System.lineSeparator());
        System.out.println("\nPress enter to back to menu.");
        scan.next();
    }

    public void displayLargest(Shape largest, String type){
        String shapeComponents = String.format("\nThe largest by %s is %s: \n"
                        + "\nClass: %s\n"
                        + "Perimeter = %.2f\n"
                        + "Area = %.2f", type, largest.getName(), largest.getClassName(), largest.calculatePerimeter()
                ,largest.calculateArea());
        System.out.println(shapeComponents);
    }

    public void showFormulas(String name, String area, String perimeter){
        String formulas = String.format("\nFormulas for the %s: \n"
                + "\nArea = %s\n"
                + "Perimeter = %s", name, area, perimeter);
        System.out.println(formulas);
        takeEmptyInput();
    }

}