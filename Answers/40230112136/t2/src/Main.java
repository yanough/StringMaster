import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        String firstname = scanner.nextLine();
        String lastname = scanner.nextLine();
        String lowfirst = firstname.toLowerCase();
        String lowlast = lastname.toLowerCase();
        String first = lowfirst.substring(0, 1).toUpperCase() + lowfirst.substring(1);
        String last = lowlast.substring(0, 1).toUpperCase() + lowlast.substring(1);
        System.out.printf(first + ' ' + last);
    }
}
//normalizing name