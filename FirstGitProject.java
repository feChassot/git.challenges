package git.challenges;

import java.util.Scanner;

public class FirstGitProject {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor teste: ");
        double teste = sc.nextDouble();

        double calc = teste * 2.0;

        System.out.println("Valor total: " + calc);
        sc.close();
    }

}
