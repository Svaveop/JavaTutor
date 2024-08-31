public class Main {
    public static void main(String[] args) {
        // Java methods / functions
        info("Hello");
        String java = "Java";
        info(java);

        short num = 7;
        int resault1 = sum((short) 5, num);
        short num2 = 8;
        int resault2 = sum((short) 4, num2);
        info(String.valueOf(resault2));
    }
    public static void info(String hello) {
        System.out.print(hello);
        System.out.println("!");
    }
    public static int sum(short a, short b) {
        int res = a + b;
        String resault = "Resault: " + res;
        info(resault);
        return res;
    }
}
