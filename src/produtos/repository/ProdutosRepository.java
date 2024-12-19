package produtos.repository;

import produtos.model.Produto;

public interface ProdutosRepository {
	
	// CRUD do E-Commerce
	public void adicionarProduto(Produto produto);
	public void listarProdutos();
	public void buscarProdutosPorId(int Id);
	public void atualizarProduto(int Id, String nome);
	public void deletarProduto(int Id);
}
