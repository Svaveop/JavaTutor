import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(40);
        numbers.add(1, 30);

        System.out.println(numbers.size());
        System.out.println(numbers.get(1));
        numbers.remove(1); // deletes selected index
        numbers.clear(); //deletes everything

        for (Integer el : numbers) {
            System.out.println(el);
        }
    }
}
