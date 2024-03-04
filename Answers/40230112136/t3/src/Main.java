import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        char[] esm = name.toCharArray();
        int l = name.length();
        for(int i=0 ; i<=l-2 ; i++)
        {
            for(int j=i+1 ; j<=l-1 ; j++)
            {
                if(esm[i]==esm[j]){esm[i]='*';}
                else{break;}
            }
        }
        for(int k=0 ; k<=l-1 ; k++)
        {
            if(esm[k]!='*') {System.out.print(esm[k]);}
        }
    }
}
//double char