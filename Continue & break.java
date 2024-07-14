public class Main {
    public static void main(String[] args) {
        for(int i = 5; i < 30; i+= 3) {
            if(i % 3 == 0){
                continue; //misses numbers which divide to 3 with 0 remainder
            }
            if (i >= 21) {
                break; // when i >= to 21 it just ends the cycle (for)
            }
            System.out.println("Element: " + i);
        }// We can use OPs continue & break with while & do while
    }
}
