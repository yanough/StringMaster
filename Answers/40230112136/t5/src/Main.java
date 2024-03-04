import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean odd = scanner.nextBoolean();
        int result = 0;
        if (odd == true) {
            while (number > 0) {
                if (number % 2 == 0) {
                    result++;
                }
                number = (number / 10);
            }}

            if (odd == false) {
                while (number > 0) {
                    if (number % 2 == 1) {
                        result++;
                    }
                    number = (number / 10);
                    // System.out.printf(number);
                }
            }
        System.out.print(result);
    }
}
//oddevencounter
