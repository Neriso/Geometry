import java.util.InputMismatchException;
import java.util.Scanner;


public class Display {

    public static Scanner scan = new Scanner(System.in);


    public void clearScreen(){
        try {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int gatherIntInput(String title, int numberOfOptions){
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

    public float gatherFloatInput(String title){
        float floatInput = 1;
        while (true){
            try{
                System.out.print(title);
                floatInput = validateFloat();
                break;
            }
            catch (InputMismatchException e){
                System.err.println("\nYou must enter a float number grater than 0! \n");
//                scan.nextLine();
                continue;
            }
        }
        return floatInput;
    }



    public String gatherName(String title){
        System.out.print(title);
        scan.useDelimiter(System.lineSeparator());
        String stringInput = "";
        stringInput = scan.next();
        if (stringInput.length() > 10){
            stringInput = stringInput.substring(0, 10);
        }
        return stringInput;
    }

    public void displayMenu(){
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "|                M  E  N  U                 |\n"
                + "|-------------------------------------------|\n"
                + "| 1 - Add new shape                         |\n"
                + "| 2 - Show all shapes                       |\n"
                + "| 3 - Show shape with the largest perimeter |\n"
                + "| 4 - Show shape with the largest area      |\n"
                + "| 5 - Show formulas                         |\n"
                + "| 0 - Exit program                          |\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }

    public void displayAddShape(){
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "|               ADD NEW SHAPE               |\n"
                + "|-------------------------------------------|\n"
                + "| 1 - Circle                                |\n"
                + "| 2 - Triangle                              |\n"
                + "| 3 - Equilateral triangle                  |\n"
                + "| 4 - Rectangle                             |\n"
                + "| 5 - Square                                |\n"
                + "| 6 - Regular pentagon                      |\n"
                + "| 0 - Back to main menu                     |\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }

    public void displayShapes(){
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "|                  SHAPES                   |\n"
                + "|-------------------------------------------|\n"
                + "| 0 - Circle                                |\n"
                + "| 1 - Equilateral triangle                  |\n"
                + "| 2 - Rectangle                             |\n"
                + "| 3 - Pentagon                              |\n"
                + "| 4 - Triangle                              |\n"
                + "| 5 - Square                                |\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }

    public void emptyInput(){
        scan.useDelimiter(System.lineSeparator());
        System.out.println("\nPress enter to back to menu.");
        scan.next();
        clearScreen();
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
        clearScreen();
        emptyInput();
    }

}