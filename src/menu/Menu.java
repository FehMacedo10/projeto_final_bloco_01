package menu;

import java.util.Scanner;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		int opcao;
		String produto;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("*************************************************");
			System.out.println("                                                 ");
			System.out.println("       Loja de Eletrônicos *Futurama Tech*       ");
			System.out.println("       		  CATÁLOGO DE PRODUTOS               ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("       001 - Playstation 5                       ");
			System.out.println("       002 - Fones de Ouvido Bluetooth           ");
			System.out.println("       003 - Caixas de Som Portáteis             ");
			System.out.println("       004 - Teclados Gamers                     ");
			System.out.println("       005 - SSDs Externos                       ");
			System.out.println("       006 - Mouse Gamers                        ");
			System.out.println("       007 - Câmeras de Segurança Inteligentes   ");
			System.out.println("       008 - Xbox Series X                       ");
			System.out.println("       009 - Carregadores Portáteis (Power Banks)");
			System.out.println("       010 - Iphone 13 Pro Max                   ");
			System.out.println("                                                 ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("                                                 ");
			System.out.println("       Loja de Eletrônicos *Futurama Tech*       ");
			System.out.println("       		      MENU DO SITE                   ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("       1 - Cadastrar Produto                     ");
			System.out.println("       2 - Listar todos os Produtos              ");
			System.out.println("       3 - Buscar produto pelo ID                ");
			System.out.println("       4 - Atualizar os Produtos no Carrinho     ");
			System.out.println("       5 - Deletar Produto do carrinho           ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.print(" Entre com a opção desejada: ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("\nCadastrar Produto");

				System.out.print("\nDigite o Produto Escolhido: ");
				produto = leia.next();

				break;
			case 2:
				System.out.println("\nListar todos os Produtos");

				break;
			case 3:
				System.out.println("\nBuscar produtos pelo ID");

				break;
			case 4:
				System.out.println("\nAtualizar os Produtos no Carrinho de Compras");

				break;
			case 5:
				System.out.println("\nDeletar Produto no Carrinho de Compras");

				break;
			default:
				System.out.println("\nOpção Inválida!");

				break;
			}
		} while (opcao != 0);

		leia.close();
	}

}
