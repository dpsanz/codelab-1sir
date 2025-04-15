import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex5Prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado1, lado2, lado3;
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Digite um valor --> ");
        lado1 = sc.nextDouble();
        System.out.println("Digite um valor --> ");
        lado2 = sc.nextDouble();
        System.out.println("Digite outro valor --> ");
        lado3 = sc.nextDouble();

        if (lado1<lado2+lado3 && lado2 < lado1+lado3 && lado3 < lado1+lado2){
            System.out.println("Os valores representam os lados de um triangulo");
        }
        else {
            System.out.println("Os valores não representam os lados de um triangulo");
        }
    }
}
