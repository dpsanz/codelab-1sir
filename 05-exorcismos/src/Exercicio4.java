import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner marlon = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(("0.00"));
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

        System.out.println("Valor de cada quilowatt: " + df.format(valorkWh));
        System.out.println("Valor da conta: R$" + df.format(conta));
        System.out.println("Valor desconto: R$" + df.format(desconto));
    }
}
