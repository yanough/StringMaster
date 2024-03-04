import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a sentence and a number");
        String sentence = scanner.nextLine();
        int number = scanner.nextInt();
        String[] jomle = sentence.split("\\s+");
        int length=0;
        for (String dictionay : jomle){
            length++;
        }
        if(number>length){System.out.print( number + " is out Of Bound");}
        else{System.out.print( jomle[number-1]);}
    }
}
//wordfinder