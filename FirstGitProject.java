package git.challenges;

import java.util.Locale;
import java.util.Scanner;

public class FirstGitProject {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor teste: ");
        double teste = sc.nextDouble();

        double calc = teste * 2.0;

        System.out.println("Valor total: " + calc);
        sc.close();
    }

}
