package produto.controller;

import java.util.ArrayList;
import produtos.model.Produto;
import produtos.repository.ProdutosRepository;

public class ProdutoController implements ProdutosRepository {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 000;

	@Override
	public void adicionarProduto(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO Produto foi Adicionado com Sucesso!");

	}

	@Override
	public void listarProdutos() {
		if (listaProdutos.isEmpty()) {
			System.out.println("\nNenhum produto cadastrado!");
		} else {
			for (Produto produto : listaProdutos) {
				produto.visualizar();
			}
		}
	}

	@Override
	public void buscarProdutosPorId(String id) {
		var produto = buscarNaCollection(id);

		if (produto != null) {
			System.out.println("\nProduto encontrado!:");
			produto.visualizar();
		} else {
			System.out.println("\nProduto com ID " + id + " não encontrado.");
		}
	}

	@Override
	public void atualizarProduto(String nome, String id, int tipo, float preco) {
		var produto = buscarNaCollection(id);
		
        if (produto != null) {
            produto.setNome(nome);
            produto.setId(id);
            produto.setTipo(tipo);
            produto.setPreco(preco);
            
            System.out.println("\nProduto atualizado com sucesso!");
        } else {
            System.out.println("\nProduto com ID " + id + " não encontrado.");
        }
	}

	@Override
	public void deletarProduto(String id) {
		var produto = buscarNaCollection(id);

        if (produto != null) {
            listaProdutos.remove(produto);
            System.out.println("\nProduto deletado com sucesso!");
        } else {
            System.out.println("\nProduto com ID " + id + " não encontrado.");
        }
	}

	public int gerarNumero() {
		return ++numero;
	}

	public Produto buscarNaCollection(String id) {
		for (var produto : listaProdutos) {
			if (produto.getId().equals(id)) {
				return produto;
			}
		}

		return null;
	}
}
