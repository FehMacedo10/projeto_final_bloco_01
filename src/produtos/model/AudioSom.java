package produtos.model;

public class AudioSom extends Produto {
	
	private String tecnologia;
	
	public AudioSom(String nome, String id, int tipo, float preco, String tecnologia) {
		super(nome, id, tipo, preco);
        this.tecnologia = tecnologia;

	}

	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}
	

	@Override
    public void visualizar() {
        System.out.println("\n\nProduto ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Tipo: Áudio e Som");
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Tecnologia: " + tecnologia);
    }

}
