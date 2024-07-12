import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float num1 = 50, num2 = 33;
        float res = num1 % num2;
        res = res + 10; //or
        res += 10; //more short way
        res++; //the most short way (but only for 1)
        res--; //same with -1
    }
}
