
/*Autor: José Roberto de Azevedo */
/* Algoritimo que imprime uma Escada de asteristicos. Questão 01 do Desafio Capgemini 2022*/

import java.util.Scanner; // biblioteca de acesso para o construtor Scanner//

public class questao01Desafiocapgemini {

	public static void main(String[] args) {
		int numero;
		boolean valor = true; 
		Scanner entrada = new Scanner(System.in);// criação do objeto que irá guardar o valor informado pelo usuario// 										// Scanner para pegar o
													
		while (valor == true) {
			System.out.println("Digite um valor de numero inteiro para N");
			numero = entrada.nextInt();// variavel recebe o valor informado pelo usuario//
										
			int n = 0;
           
			// testar e garantir que o valor sera digitado corretamente evitar erros de compilação//
			try { 
				n = numero; 
							
			} catch (NumberFormatException e) { 
				System.out.println("Entrou com um valor inválido");
			}
			if (n > 0) {
				for (int j = 0; j <= n; j++) {
					for (int x = j; x < n; x++) {
						System.out.print(" ");// imprime o espaçamento.//

					}
					for (int espaco = 0; espaco < j; espaco++) {

						System.out.print("*");// imprime o asteristico.//

					}
					System.out.println("");// pulando a linha, garantindo o espaçamento entre os asteristicos//
											
					valor = false;
				}

			} else {
				System.out.println("O valor tem que ser um numero inteiro maior do que 0");
			}
		}
	}
}