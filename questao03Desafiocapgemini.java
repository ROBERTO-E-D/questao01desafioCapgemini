/*Autor: José Roberto de Azevedo */
/* Algoritimo que verifica a quantidade de possiveis anagramas a partir de uma palavra. Questão 03 do Desafio Capgemini 2022*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class questao03Desafiocapgemini {

	public static void main(String[] args) {
        /*Entrada de dados do teclado da palavra a ser verificada */
		Scanner s = new Scanner(System.in);
		System.out.println("Informe a palavra :");

		String p = s.nextLine();
		qtdAnagramas(p);
		s.close();
	}
        /*Metodo que ira verificar a quantidade de Anagramas possiveis*/
	private static void qtdAnagramas(String p) {
         
		/*Criando um objeto de uma matriz onde guardará os anagramas*/
		ArrayList<String> listaAnagramas = new ArrayList<String>(); 
		/*Laço de repetição bidirecional responsável pela identificação dos anagramas*/
		for (int a = 0; a < p.length(); a++) {
			for (int b = 1; b < p.length(); b++) {
				  /*condição para ter o índice que aponta para o seu caracter.*/
				if (p.charAt(a) == p.charAt(b) && a < b && a != b) {
					if (p.charAt(a) == p.charAt(a + 1)) {
						String z = p.substring(a, a + 1);/*Sendo encontrado letras iguais, as mesmas são locadas em uma variável*/
						listaAnagramas.add(z);
					} else {
						String c = p.substring(a, a + 1);
						listaAnagramas.add(c);

						String d = p.substring(a, b);
						listaAnagramas.add(d);

					}
				}
			}
		}/*o tamanho do vetor é mostrado*/
		System.out.println(listaAnagramas.size());
	}
}
