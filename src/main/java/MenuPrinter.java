public class MenuPrinter {
    public void printMainMenu(){
        System.out.println("");
        System.out.println("\n"
                + "                M  E  N  U                 \n"
                + "\n"
                + " 1 - Add new shape                         \n"
                + " 2 - Show all shapes                       \n"
                + " 3 - Show shape with the largest perimeter \n"
                + " 4 - Show shape with the largest area      \n"
                + " 5 - Show formulas                         \n"
                + " 6 - program info                          \n"
                + " 0 - Exit program                          \n");
    }

    public void printAddShapeMenu(){
        System.out.println("");
        System.out.println("\n"
                + "               ADD NEW SHAPE               \n"
                + "\n"
                + " 1 - Circle                                \n"
                + " 2 - Triangle                              \n"
                + " 3 - Equilateral triangle                  \n"
                + " 4 - Rectangle                             \n"
                + " 5 - Square                                \n"
                + " 6 - Regular pentagon                      \n"
                + " 0 - Back to main menu                     \n"
                );
    }

    public void printShapesMenu(){
        System.out.println("");
        System.out.println("\n"
                + "                  SHAPES                   \n"
                + "\n"
                + " 0 - Circle                                \n"
                + " 1 - Equilateral triangle                  \n"
                + " 2 - Rectangle                             \n"
                + " 3 - Pentagon                              \n"
                + " 4 - Triangle                              \n"
                + " 5 - Square                                \n"
                );
    }
    public void printInfo(){
        System.out.println("");
        System.out.println("\n"
                + "Easy App to lern geometry \nCreated by Milosz Buchacz, Codecool student");
    }

}