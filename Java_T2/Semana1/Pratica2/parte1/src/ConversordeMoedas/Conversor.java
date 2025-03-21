package ConversordeMoedas;
import java.util.Scanner;

public class Conversor {
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a taxa de câmbio: ");
        double taxa = input.nextDouble();

        System.out.print("Digite a quantidade em dólares: ");
        double dolares = input.nextDouble();

        double reais = dolares * taxa;

        System.out.printf("O valor convertido é R$ %.2f", reais);

        input.close();
    }
}