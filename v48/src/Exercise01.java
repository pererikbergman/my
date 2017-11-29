public class Exercise01 {

    public static void main(String[] args) {
        int[] numbers = new int[]{4, 7, 2, 9, 7, 12, 83, 99, 26, 21};
        int odd = 0;
        int even = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        if (odd > even) {
            System.out.println("Det fanns " + odd + " antal udda och " + even + " antal jämna.");
        } else if (odd < even) {
            System.out.println("Det fanns " + even + " antal jämna och " + odd + " antal udda.");
        } else {
            System.out.println("Det fanns " + even + " antal jämna och udda.");
        }
    }
}
