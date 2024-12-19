package produtos.model;

public class AcessoriosPC extends Produto {
	
	private String compatibilidade;
	
	public AcessoriosPC(String nome, String id, int tipo, float preco, String compatibilidade) {
		super(nome, id, tipo, preco);
		this.compatibilidade = compatibilidade;
		
	}

	public String getCompatibilidade() {
		return compatibilidade;
	}

	public void setCompatibilidade(String compatibilidade) {
		this.compatibilidade = compatibilidade;
	}
	

	@Override
    public void visualizar() {
        System.out.println("\n\nProduto ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Tipo: Acessórios para Computadores");
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Compatibilidade: " + compatibilidade);
    }
	
}
