package Exercicío3;

import java.util.ArrayList;
import java.util.Scanner;

public class Coleções2 {

	public static void main(String[] args) {
		
		int op;
		Scanner leia = new Scanner(System.in);
		ArrayList <String> estoque = new ArrayList();
		
		do
		{
			System.out.println("\n\tLista de opções: ");
			System.out.println("\n1 - Armazenar produtos no estoque.");
			System.out.println("\n2 - Remover produtos do estoque.");
			System.out.println("\n3 - Atualiazar produtos do estoque.");
			System.out.println("\n4 - Mostrar todos produtos.");
			System.out.println("\n5 - Finalizar o programa.");
			
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite qual produto deseja adicionar ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
			
			case 2:
				leia.nextLine();
				System.out.println("\nDigite qual produto deseja remover do estoque: ");
				String produtor = leia.nextLine();
				if(estoque.contains(produtor))
				{
					estoque.remove(produtor);
				}
				else
				{
					System.out.println("O produto não existe.");
				}
				System.out.println(estoque);
				break;
				
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que deseja atualizar: ");
				String atualizar = leia.nextLine();
				String verifica = leia.nextLine();
				System.out.println("\nDigite o produto que deseja adicionar "+verifica+":");
				String novo = leia.nextLine();
				
				
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto não existe.");
				}
				System.out.println(estoque);
				break;
			case 4:
				System.out.println("\nOs produtos do estoque são: ");
				System.out.println(estoque);
				break;
				default:
					System.out.println("\nOpção inválida.");

			}
		}while(op!=0);
	}

}
