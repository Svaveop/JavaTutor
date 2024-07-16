import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = scanner.nextInt();

        System.out.print("Action: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        System.out.print("Enter 2nd number: ");
        int num2 = scanner.nextInt();

        float res;

        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.print("Answer: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.print("Answer: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.print("Answer: " + res);
                break;
            case "/":
                if (num2 == 0){
                    System.out.print("Can't divide by 0");
                }else {
                    res = (float) num1 / num2;
                    System.out.print("Answer: " + res);
                }
                break;
            // and if you write "/" like ":"
            case ":":
                if (num2 == 0){
                    System.out.println("Can't divide by 0");
                }else {
                    res = (float) num1 / num2;
                    System.out.println("Answer: " + res);
                }
                break;
            default:
                System.out.println("You did something wrong");


        }

    }
}
