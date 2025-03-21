import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();

        System.out.println("Escolha a unidade de origem:");
        System.out.println("1 - Celsius");
        System.out.println("2 - Fahrenheit");

        int escolhaUnidade = scanner.nextInt();

        double resultado = 0;

        if (escolhaUnidade == 1) {
            resultado = (temperatura * 9 / 5) + 32;
            System.out.println("A temperatura em Fahrenheit é: " + resultado);
        } else if (escolhaUnidade == 2) {
            resultado = (temperatura - 32) * 5 / 9;
            System.out.println("A temperatura em Celsius é: " + resultado);
        } else {
            System.out.println("Escolha de unidade inválida.");
        }
    }
}