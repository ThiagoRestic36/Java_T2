package JogodeAdivinhação;

import java.util.Scanner;
import java.util.Random;

public class Adivinhação {
	  public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        Random gerador = new Random();
	        int numeroAleatorio = gerador.nextInt(100) + 1;
	        int tentativas = 0;
	        int palpite = 0;

	        System.out.println("Bem-vindo ao jogo de adivinhação! Tente adivinhar o número entre 1 e 100.");

	        while (palpite != numeroAleatorio) {
	            System.out.print("Digite um número: ");
	            palpite = input.nextInt();
	            tentativas++;

	            if (palpite > numeroAleatorio) {
	                System.out.println("Muito alto! Tente novamente.");
	            } else if (palpite < numeroAleatorio) {
	                System.out.println("Muito baixo! Tente novamente.");
	            }
	        }

	        System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
	    }
	}