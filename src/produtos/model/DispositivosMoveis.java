package produtos.model;

public class DispositivosMoveis extends Produto {
	
	private String sistemaOperacional;
	
	public DispositivosMoveis(String nome, String id, int tipo, float preco, String sistemaOperacional) {
		super(nome, id, tipo, preco);
		
	}

	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}
	

	@Override
    public void visualizar() {
        System.out.println("\n\nProduto ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Tipo: Dispositivos Móveis");
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Sistema Operacional: " + sistemaOperacional);
    }
}
