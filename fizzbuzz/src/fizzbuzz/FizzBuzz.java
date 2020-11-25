package fizzbuzz;

public class FizzBuzz {

    static Object[] arr = new Object[100];

    public static Object[] list() {
        addElements();
        return arr;
    }

    private static void addElements() {
        for (int i = 1; i < (arr.length - 1); i++) {
            if (divisibleBy(i, 3) && divisibleBy(i, 5)) {
                arr[i-1] = "FizzBuzz";
            } else if (divisibleBy(i, 3)) {
                arr[i-1] = "Fizz";
            } else if (divisibleBy(i, 5)) {
                arr[i-1] = "Buzz";
            } else {
                arr[i-1] = i;
            }
        }
    }

    private static boolean divisibleBy(int i, int divisor) {
        return i % divisor == 0;
    }

}
