import java.util.Scanner;

public class SucessorEAntecessor {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        int N = 0;


        System.out.println("Escreva um número: ");
         N = scanner.nextInt();
        System.out.println("Você inseriu o número: " + N);
        System.out.println(" Seu antecessor é: "+ (N-1));
        System.out.println(" E seu sucessor é: " + (N+1));
    }
}
