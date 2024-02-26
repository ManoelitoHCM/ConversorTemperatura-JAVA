import java.util.Scanner;

public class ConversorTemperatura {

    public static double ConverteTemperatura(double temperatura, char escolha) {
        double resultado = 0.0;

        switch (escolha) {
            case 'C':
            case 'c':
                System.out.println("Escolha para qual unidade deseja converter (F para Fahrenheit, K para Kelvin): ");
                char tempEscolha = new Scanner(System.in).next().charAt(0);
                switch (tempEscolha) {
                    case 'F':
                    case 'f':
                        resultado = (9.0 / 5.0) * temperatura + 32;
                        break;
                    case 'K':
                    case 'k':
                        resultado = temperatura - 273.15;
                        break;
                    default:
                        System.out.println("Opção de conversão inválida.");
                        break;
                }
                break;
            case 'F':
            case 'f':
                System.out.println("Escolha para qual unidade deseja converter (C para Celsius, K para Kelvin): ");
                tempEscolha = new Scanner(System.in).next().charAt(0);
                switch (tempEscolha) {
                    case 'C':
                    case 'c':
                        resultado = (temperatura - 32) * 5.0 / 9.0;
                        break;
                    case 'K':
                    case 'k':
                        resultado = (temperatura - 32) * 5.0 / 9.0 - 273.15;
                        break;
                    default:
                        System.out.println("Opção de conversão inválida.");
                        break;
                }
                break;
            case 'K':
            case 'k':
                System.out.println("Escolha para qual unidade deseja converter (C para Celsius, F para Fahrenheit): ");
                tempEscolha = new Scanner(System.in).next().charAt(0);
                switch (tempEscolha) {
                    case 'C':
                    case 'c':
                        resultado = temperatura + 273.15;
                        break;
                    case 'F':
                    case 'f':
                        resultado = (9.0 / 5.0) * temperatura + 32 - 273.15;
                        break;
                    default:
                        System.out.println("Opção de conversão inválida.");
                        break;
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        return resultado;
    }

}
