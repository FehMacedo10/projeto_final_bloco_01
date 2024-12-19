package menu;

import java.util.Scanner;
import conta.util.Cores;
import produtos.model.Produto;
import produtos.model.Videogames;
import produtos.model.AcessoriosPC;
import produtos.model.AudioSom;
import produtos.model.DispositivosMoveis;

public class Menu {

	public static void main(String[] args) {
		int opcao, id, tipo;
		String nome;
		float preco;
		
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("*************************************************");
			System.out.println("                                                 ");
			System.out.println("       Loja de Eletrônicos *Futurama Tech*       ");
			System.out.println("       		  CATÁLOGO DE PRODUTOS               ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("       001 - Playstation 5                       ");
			System.out.println("       002 - Xbox Series X                       ");
			System.out.println("       003 - Nintendo Switch                     ");
			System.out.println("       004 - Fones de Ouvido Bluetooth           ");
			System.out.println("       005 - Caixas de Som Portáteis             ");
			System.out.println("       006 - Teclados Gamers                     ");
			System.out.println("       007 - SSDs Externos                       ");
			System.out.println("       008 - Mouse Gamers                        ");
			System.out.println("       009 - Samsung S24 Ultra                   ");
			System.out.println("       010 - Iphone 16 Pro Max                   ");
			System.out.println("                                                 ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("                                                 ");
			System.out.println("       Loja de Eletrônicos *Futurama Tech*       ");
			System.out.println("       		     MENU DO SITE                    ");
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

				System.out.print("\nDigite o ID do Produto Escolhido: ");
				id = leia.nextInt();
				System.out.print("\nDigite o Nome do Produto Escolhido: ");
				leia.skip("\\R?");
				nome= leia.nextLine();
				System.out.print("\nDigite o Preço do Produto Escolhido: ");
				preco = leia.nextFloat();
				
				do {
					System.out.println("Digite o Tipo do Produto: ");
					System.out.println("1 - Videogames");
					System.out.println("2 - Áudio e Som");
					System.out.println("3 - Acessórios para Computadores");
					System.out.println("4 - Dispositivos Móveis");
					tipo = leia.nextInt();
				} while (tipo < 1 || tipo > 4);
				
				Produto produto = null;
				
				switch(tipo) {
					case 1 -> {
						System.out.print("Digite a Plataforma: ");
						leia.skip("\\R?");
						String plataforma = leia.nextLine();
						produto = new Videogames(nome, id, tipo, preco, plataforma);
						break;
					}
					
					case 2 -> {
						System.out.print("Digite a Tecnologia: ");
						leia.skip("\\R?");
						String plataforma = leia.nextLine();
						produto = new AudioSom(nome, id, tipo, preco, plataforma);
						break;
					}
					
					case 3 -> {
						System.out.print("Digite a Compatibilidade: ");
						leia.skip("\\R?");
						String plataforma = leia.nextLine();
						produto = new AcessoriosPC(nome, id, tipo, preco, plataforma);
						break;
					}
					
					case 4 -> {
						System.out.print("Digite o Sistema Operacional: ");
						leia.skip("\\R?");
						String plataforma = leia.nextLine();
						produto = new DispositivosMoveis(nome, id, tipo, preco, plataforma);
						break;
					}
					
				}
				
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
