import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner marlon = new Scanner(System.in);
        double salariominimo;
        double gastokWh;
        double valorkWh;
        double conta;
        double desconto;



                //100 kWh = 1/7 salario minimo

        // leitura de dados
        System.out.println("Salario mínimo: ");
        salariominimo = marlon.nextDouble();

        System.out.println("Gasto de kW: ");
        gastokWh = marlon.nextDouble();

        //calculagem de dados

        valorkWh = salariominimo / 7 / 100;
        conta = gastokWh * valorkWh;
        desconto = conta * 0.9;

        // salida dados

        System.out.println("Valor de cada quilowatt: " + valorkWh);
        System.out.println("Valor da conta: " + conta);
        System.out.println("Valor desconto: " + desconto);
    }
}
