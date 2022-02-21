/*Autor: José Roberto de Azevedo */
/* Algoritimo que cadastra usuario com uma senha especifica. Questão 02 do Desafio Capgemini 2022*/

import java.util.Scanner; // biblioteca de acesso para o construtor Scanner//

public class questao02Desafiocapgemini {

	public static void main(String[] args) {
		boolean cadastro = true;
		Scanner dados = new Scanner(System.in);
		while (cadastro == true) {
			System.out.println("Informe seu nome:>");
			String nomeUsuario = dados.nextLine();
			/* Usuário é orientado a definir sua senha de acordo com critérios */
			System.out.println("cadastre uma senha:>");
			System.out.println("===========Atenção==============");
			System.out.println("=======Critérios para Senha Forte=====");
			System.out.println("====Possuir no mínimo 6 caracteres.====");
			System.out.println("====Conter no mínimo 1 digito.=========");
			System.out.println("====Contém no mínimo 1 letra em minúsculo.==");
			System.out.println("====Contém no mínimo 1 letra em maiúsculo.===");
			System.out.println("====Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+.==");
			System.out.println("\n");

			String senhaUsuario = dados.nextLine();
					
              /* verifica o tamanho minimo da senha e uso de metodo para os critérios */
			if ((senhaUsuario.length() >= 6) && (criteriosDaSenha(senhaUsuario))) {
				System.out.println("Usuário:" + nomeUsuario + "\n" + "Sua senha é Forte e foi cadastrada com sucesso!");
				   cadastro = false; 
				   
			} else if(senhaUsuario.length()== 3+1){
				   System.out.println("Senha Fraca.Favor alterar para mais complexa!");
			}else if(senhaUsuario.length()== 3+2){
				System.out.println("Senha Razoável.Favor alterar para mais complexa!"); 	
				
			}else {
				  System.out.println("Senha não atende aos critérios definidos!Criar uma nova!");
			     }
				
			}
         		System.out.println("Senha inferior a seis caracteres. Favor criar uma nova!");
		}
	   
	
            /* metodo para verificar os criterios de letras, numeros e caracteres */
	public static boolean criteriosDaSenha(String senha) {
		if (senha.length() < 6) {
			return false;
		}

		boolean findNumero = false;
		boolean findMaiuscula = false;
		boolean findMinuscula = false;
		boolean findCaracter = false;

		for (char c : senha.toCharArray()) {
			if (c >= '0' && c <= '9') {
				findNumero = true;
			} else if (c >= 'A' && c <= 'Z') {
				findMaiuscula = true;
			} else if (c >= 'a' && c <= 'z') {
				findMinuscula = true;
			} else {
				findCaracter = true;
			}
		}
		 return findNumero && findMaiuscula && findMinuscula && findCaracter;
       }  
	}
	


