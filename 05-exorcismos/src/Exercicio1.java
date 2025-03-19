import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        // declaração das variáveis
        Scanner marlon = new Scanner(System.in);
        double base, altura;
        double area, perimetro;

        // entrada de dados
        System.out.println("digite o valor da base: ");
        base = marlon.nextDouble();

        System.out.println("digite o valor da altura: ");
        altura = marlon.nextDouble();

        // processamento --> operações
        area = base * altura;
        perimetro = base + base + altura + altura;

        // salida de dados
        System.out.println("Área = " + area);
        System.out.println("Perímetro = " + perimetro);
    }
}
