package menu;

import java.io.IOException;
import java.util.Scanner;
import produto.util.Cores;
import produtos.model.Produto;
import produtos.model.Videogames;
import produtos.model.AcessoriosPC;
import produtos.model.AudioSom;
import produtos.model.DispositivosMoveis;
import produto.controller.ProdutoController;

public class Menu {

	public static void main(String[] args) {
		
		ProdutoController produtos = new ProdutoController();
		
		int opcao, tipo;
		String nome, id;
		float preco;
		
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND
					+ 		   "****************************************************");
			System.out.println("                                                    ");
			System.out.println("        Loja de Eletrônicos *Futurama Tech*         ");
			System.out.println("       		  CATÁLOGO DE PRODUTOS                  ");
			System.out.println("                                                    ");
			System.out.println("****************************************************");
			System.out.println(" 001 - Playstation 5 | Preço: R$ 3299,00            ");
			System.out.println(" 002 - Xbox Series X | Preço: R$ 4999,00            ");
			System.out.println(" 003 - Nintendo Switch | Preço: R$ 1999,00          ");
			System.out.println(" 004 - Fones de Ouvido Bluetooth | Preço R$ 129,90  ");
			System.out.println(" 005 - Caixas de Som Portáteis | Preço R$ 526,50    ");
			System.out.println(" 006 - Teclados Gamers | Preço R$ 145,90            ");
			System.out.println(" 007 - SSDs Externos | Preço R$ 319,20              ");
			System.out.println(" 008 - Mouse Gamers  | Preço R$ 249,99              ");
			System.out.println(" 009 - Samsung S24 Ultra | Preço R$ 7199,10         ");
			System.out.println(" 010 - Iphone 16 Pro Max | Preço 11699,10           ");
			System.out.println("                                                    ");
			System.out.println("                                                    ");
			System.out.println("****************************************************");
			System.out.println("                                                    ");
			System.out.println("       Loja de Eletrônicos *Futurama Tech*          ");
			System.out.println("       		      MENU DO SITE                      ");
			System.out.println("                                                    ");
			System.out.println("****************************************************");
			System.out.println("       1 - Cadastrar Produto                        ");
			System.out.println("       2 - Listar todos os Produtos                 ");
			System.out.println("       3 - Buscar produto pelo ID                   ");
			System.out.println("       4 - Atualizar os Produtos no Carrinho        ");
			System.out.println("       5 - Deletar Produto do carrinho              ");
			System.out.println("       6 - Finalizar e Sair do Sistema              ");
			System.out.println("                                                    ");
			System.out.println("****************************************************");
			System.out.print("Entre com a opção desejada: "                          );
			System.out.println("                                                     " + Cores.TEXT_RESET);
			opcao = leia.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("\nCadastrar Produto");

				System.out.print("\nDigite o ID do Produto Escolhido: ");
				id = leia.next();
				System.out.print("\nDigite o nome do Produto Escolhido: ");
				leia.skip("\\R?");
				nome= leia.nextLine();
				System.out.print("\nDigite o preço do Produto Escolhido: ");
				preco = leia.nextFloat();
				
				do {
					System.out.println("1 - Videogames");
					System.out.println("2 - Áudio e Som");
					System.out.println("3 - Acessórios para Computadores");
					System.out.println("4 - Dispositivos Móveis");
					System.out.print("Digite o Tipo do Produto: ");
					tipo = leia.nextInt();
				} while (tipo < 1 || tipo > 4);
				
				Produto produto = null;
				
				switch(tipo) {
					case 1 -> {
						System.out.print("Digite a Plataforma: ");
						leia.skip("\\R?");
						String plataforma = leia.nextLine();
						produtos.adicionarProduto(new Videogames(nome, id, tipo, preco, plataforma));
						break;
					}
					
					case 2 -> {
						System.out.print("Digite a Tecnologia: ");
						leia.skip("\\R?");
						String tecnologia = leia.nextLine();
						produto = new AudioSom(nome, id, tipo, preco, tecnologia);
						
						break;
					}
					
					case 3 -> {
						System.out.print("Digite a Compatibilidade: ");
						leia.skip("\\R?");
						String compatibilidade = leia.nextLine();
						produto = new AcessoriosPC(nome, id, tipo, preco, compatibilidade);
						
						break;
					}
					
					case 4 -> {
						System.out.print("Digite o Sistema Operacional: ");
						leia.skip("\\R?");
						String sistemaOperacional = leia.nextLine();
						produto = new DispositivosMoveis(nome, id, tipo, preco, sistemaOperacional);
						
						break;
					}
					
				}
				
				keyPress();
				break;
			case 2:
				System.out.println("\nListar todos os Produtos");
				produtos.listarProdutos();
				
				keyPress();
				break;
			case 3:
				System.out.println("\nBuscar produtos pelo ID");
				System.out.print("\n\nDigite o ID do Produto: ");
				id = leia.next();
				
				produtos.buscarProdutosPorId(id);
			
				
				keyPress();
				break;
			case 4:
				System.out.println("\nAtualizar os Produtos no Carrinho de Compras");
				
				System.out.print("Digite a nova ID do Produto: ");
				id = leia.next();
				System.out.print("Digite o novo nome do Produto: ");
                leia.skip("\\R?");
                nome = leia.nextLine();
                System.out.print("Digite o tipo do Produto: ");
                tipo = leia.nextInt();
                System.out.print("Digite o preço do Produto: ");
                leia.skip("\\R?");
                preco = leia.nextFloat();
                
                produtos.atualizarProduto(nome, id, tipo, preco);
				
				keyPress();
				break;
			case 5:
				System.out.println("\nDeletar Produto no Carrinho de Compras");
				
				System.out.print("Digite o ID do produto: ");
				id = leia.next();
				
				produtos.deletarProduto(id);
				
				keyPress();
				break;
			case 6:
				if (opcao == 6) { 
					System.out.println("\n FUTURAMA TECH agradece pela sua Compra!");
					System.out.println("              Volte Sempre                ");
					leia.close();
					System.exit(0);
				}
			
			default:
				System.out.println("\nOpção Inválida!");
				
				break;	
			}
		} while (opcao != 0);
		
		leia.close();
	}
	
	public static void keyPress() {

		try {
			System.out.println("\n\nPressione Enter para continuar...");
			System.in.read();

		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente do ENTER!");

		}
	}

}
