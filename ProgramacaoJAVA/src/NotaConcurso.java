import java.util.Scanner;


public class NotaConcurso {
 //Proponha um algoritmo em Java para calcular a nota de um candidato em um concurso.
 //Para isso, você deve ler as três notas do candidato entre 0 e 10. Em seguida, calcule a nota
 //final dele no concurso, a qual corresponde à média ponderada, considerando que a primeira
 //nota tem peso 2, a segunda tem peso 3 e a terceira tem peso 5. Exibir uma mensagem
 //dizendo qual a média do aluno e se ele foi aprovado ou reprovado. A média para aprovação
 //é 7.
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double N1, N2, N3, media;


        System.out.println ("__________CONCURSO_________");
        System.out.println ("Insira a primeira Nota: ");
        N1 = scanner.nextDouble();

        System.out.println ("Insira a segunda Nota: ");
        N2 = scanner.nextDouble();

        System.out.println ("Insira a terceira Nota: ");
        N3 = scanner.nextDouble();
        media = (N1 + N2 + N3)/3;
        System.out.printf ("Sua média é: %.2f", media);

        if (media>7) {
            System.out.println (" VOCÊ ESTÁ APROVADO!");
        } else {
            System.out.println (" VOCÊ REPROVOU :( ");
        }

    }
}
