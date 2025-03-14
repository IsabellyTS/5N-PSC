import java.util.Scanner;
//Desenvolva um algoritmo que receba três números, calcule a média aritmética
//entre eles e exiba o valor obtido.
public class EC01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Double num1, num2, num3, media, resultado;

        System.out.println("Informe a nota 1: ");
        num1 = s.nextDouble();

        System.out.println("Informe a nota 2: ");
        num2 = s.nextDouble();

        System.out.println("Informe a nota 3: ");
        num3 = s.nextDouble();

        media = (num1 + num2 + num3) / 3;
        
    }
}
