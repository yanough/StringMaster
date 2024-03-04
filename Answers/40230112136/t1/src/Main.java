import java.net.SocketOption;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a sentence , a word and a replace word");
        String sentence = scanner.nextLine();
        String word = scanner.nextLine();
        String newword = scanner.nextLine();
        String[] jomle = sentence.split("\\s+");
        int length=0;
        for (String dictionay : jomle){
            length++;
        }
        for(int i=0;i<length;i++)
        {
            if(Objects.equals(jomle[i], word)){System.out.print(newword + ' ');
                continue;}
            System.out.print(jomle[i]+' ');

        }
    }
}
//word cencor