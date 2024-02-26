import java.util.Scanner;
import ConversorTemperatura;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao conversor de temperatura.");
        System.out.println("Digite o valor numérico para a temperatura: ");
        double temperatura = scanner.nextDouble();

        System.out.println("Digite a unidade da temperatura (C para Celsius, F para Fahrenheit, K para Kelvin): ");
        char escolha = scanner.next().charAt(0);

        double resultado = ConverteTemperatura(temperatura, escolha);

        System.out.println("Resultado da conversão: " + resultado);
    }
}
