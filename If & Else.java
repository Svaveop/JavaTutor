public class Main {
    public static void main(String[] args) {
        boolean HasCar = false;
        if(HasCar) {
            System.out.println("There is a car");
        } else {
            System.out.println("No car");
        }

        byte x = 45, y = 55;
        if(x >= y) {
            System.out.println("Syntax Custom Error");
        } else if(x < y) {
            System.out.println("x(45) < y(55)");
        }
        else {
            System.out.println("What else can be here?");
        }

        short a = 149, b = 615;
        if(a >= b) {
            System.out.println("Syntax Custom Error");
        } else if(a < b) {
            System.out.println("x(45) < y(55)");
        }
        //also possible without else (only if & else if)
        //we can put in if another if or in else if another else if
    }
}
