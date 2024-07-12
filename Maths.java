import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        short num1 = 50, num2 = 10;
        int res1 = num1 + num2;
        int res2 = num1 - num2;
        int res3 = num1 * num2;
        int res4 = num1 / num2;
        System.out.println("Resault of + : " + res1);
        System.out.println("Resault of - : " + res2);
        System.out.println("Resault of * : " + res3);
        System.out.println("Resault of / : " + res4);
        float num3 = 40, num4 = 27; //answer with float
        float res5 = num3 / num4; // 1.4814814
        int num5 = 40, num6 = 27; // answer without float
        int res6 = num5 / num6; // 1
        float res7 = num3 % num4; //shows remainders (with .0 bcs it's float)
        System.out.println("Resault: " + res5);
        System.out.println("Resault: " + res6);
        System.out.println("Resault: " + res7);
    }
}
