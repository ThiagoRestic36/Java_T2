package ClasseManipulaArray;

import java.util.Scanner;
import java.util.Random;

public class ManipulaArray {
	 public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    int[] array;
		    int tamanho;
		    
		    System.out.print("Digite o tamanho do array: ");
		    tamanho = input.nextInt();
		    
		    array = criaArray(tamanho);
		    System.out.println("Array criado pelo usuário: ");
		    imprimeArray(array);
		    System.out.println("Soma dos elementos do array: " + somaArray(array));
		    System.out.println("Maior valor do array: " + maiorValor(array));
		    System.out.println("Menor valor do array: " + menorValor(array));
		    
		    array = criaArrayAleatorio(tamanho);
		    System.out.println("Array criado aleatoriamente: ");
		    imprimeArray(array);
		    System.out.println("Soma dos elementos do array: " + somaArray(array));
		    System.out.println("Maior valor do array: " + maiorValor(array));
		    System.out.println("Menor valor do array: " + menorValor(array));
		  }
		  
		  public static int[] criaArray(int tamanho) {
		    Scanner input = new Scanner(System.in);
		    int[] array = new int[tamanho];
		    
		    for (int i = 0; i < tamanho; i++) {
		      System.out.print("Digite o valor da posição " + i + ": ");
		      array[i] = input.nextInt();
		    }
		    
		    return array;
		  }
		  
		  public static int[] criaArrayAleatorio(int tamanho) {
		    Random random = new Random();
		    int[] array = new int[tamanho];
		    
		    for (int i = 0; i < tamanho; i++) {
		      array[i] = random.nextInt(100);
		    }
		    
		    return array;
		  }
		  
		  public static int somaArray(int[] array) {
		    int soma = 0;
		    
		    for (int i = 0; i < array.length; i++) {
		      soma += array[i];
		    }
		    
		    return soma;
		  }
		  
		  public static int maiorValor(int[] array) {
		    int maior = array[0];
		    
		    for (int i = 1; i < array.length; i++) {
		      if (array[i] > maior) {
		        maior = array[i];
		      }
		    }
		    
		    return maior;
		  }
		  
		  public static int menorValor(int[] array) {
		    int menor = array[0];
		    
		    for (int i = 1; i < array.length; i++) {
		      if (array[i] < menor) {
		        menor = array[i];
		      }
		    }
		    
		    return menor;
		  }
		  
		  public static void imprimeArray(int[] array) {
		    for (int i = 0; i < array.length; i++) {
		      System.out.print(array[i] + " ");
		    }
		    System.out.println();
		  }
		}