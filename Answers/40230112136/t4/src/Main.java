import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        int comparedResult = s1.compareTo(s2);

        if (comparedResult > 0) {
            System.out.println(s2);
        } else if (comparedResult < 0) {
            System.out.println(s1);
        } else {
            System.out.println(s1);
        }

    }
}
//first word