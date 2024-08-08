import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Float> numbers = new LinkedList<>();
        numbers.add(7.9f);
        numbers.add(231.67f);
        numbers.add(432.42f);
        numbers.add(0.042f);
        
        for (Float el : numbers) {
            System.out.println(el);
        }
    }
}
