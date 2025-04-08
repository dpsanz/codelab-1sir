import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o valor total da compra: ");
        double totalCompras = sc.nextDouble();

        double desconto = 0.0;
        double valorPagar;


        if (totalCompras > 1000) {
            desconto = totalCompras * 0.15;

        }
        else {
            desconto = totalCompras * 0.08;
        }

        valorPagar = totalCompras - desconto;
        System.out.println("Valor economizado: R$ "+ desconto);
        System.out.println("Valor a ser pago: R$ "+ valorPagar);

    }
}
