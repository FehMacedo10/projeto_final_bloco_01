package produtos.repository;

import produtos.model.Produto;

public interface ProdutosRepository {
	
	// CRUD do E-Commerce
	public void adicionarProduto(Produto produto);
	public void listarProdutos();
	public void buscarProdutosPorId(String id);
	public void atualizarProduto(String nome, String id, int tipo, float preco);
	public void deletarProduto(String id);
}
