import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner marlon = new Scanner(System.in);
        double celcius;
        double fahrenheit;

        //entrada dados
        System.out.println("Digite a temperatura em Celcius: ");
        celcius = marlon.nextDouble();

        // programagem
        fahrenheit = celcius * 1.8 + 32;

        //salida dados
        System.out.println("A temperatura em fahrenheit é " + fahrenheit);


    }
}
